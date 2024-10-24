package de.sh.cloudusage;


import java.util.List;

/**
 * The type Dataset.
 */
public class Dataset {
    private List<Event> events;

    /**
     * Gets events.
     *
     * @return the events
     */
    public List<Event> getEvents() {
        return events;
    }

    /**
     * Sets events.
     *
     * @param events the events
     */
    public void setEvents(List<Event> events) {
        this.events = events;
    }
}

