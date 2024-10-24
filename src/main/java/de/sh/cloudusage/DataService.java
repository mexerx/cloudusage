package de.sh.cloudusage;



import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * The type Data service.
 */
@Service
public class DataService {

    /**
     * Fetch events list.
     *
     * @return the list
     */
    public List<Event> fetchEvents() {
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://localhost:8080/v1/dataset";
        Dataset dataset = restTemplate.getForObject(url, Dataset.class);
        return dataset.getEvents();
    }
}

