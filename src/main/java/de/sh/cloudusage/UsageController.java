package de.sh.cloudusage;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class UsageController {

    @Autowired
    private DataService dataService;

    @Autowired
    private UsageService usageService;

    @Autowired
    private ResultSenderService resultSenderService;

    @GetMapping("/calculate-usage")
    public void calculateAndSendUsage() {
        List<Event> events = dataService.fetchEvents();
        Map<String, Long> usageMap = usageService.calculateUsage(events);
        resultSenderService.sendResults(usageMap);
    }
}

