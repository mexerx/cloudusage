package de.sh.cloudusage;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsageService {

    public Map<String, Long> calculateUsage(List<Event> events) {
        Map<String, Long> usageMap = new HashMap<>();
        Map<String, Long> startTimes = new HashMap<>();

        for (Event event : events) {
            String key = event.getCustomerId() + "-" + event.getWorkloadId();

            if ("start".equals(event.getEventType())) {
                startTimes.put(key, event.getTimestamp());
            } else if ("stop".equals(event.getEventType()) && startTimes.containsKey(key)) {
                long duration = event.getTimestamp() - startTimes.get(key);
                usageMap.put(event.getCustomerId(), usageMap.getOrDefault(event.getCustomerId(), 0L) + duration);
                startTimes.remove(key);
            }
        }
        return usageMap;
    }
}

