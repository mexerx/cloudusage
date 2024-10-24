package de.sh.cloudusage;

/**
 * The type Event.
 */
public class Event {
    private String customerId;
    private String workloadId;
    private long timestamp;
    private String eventType;

    /**
     * Gets customer id.
     *
     * @return the customer id
     */
// Getter und Setter
    public String getCustomerId() { return customerId; }

    /**
     * Sets customer id.
     *
     * @param customerId the customer id
     */
    public void setCustomerId(String customerId) { this.customerId = customerId; }

    /**
     * Gets workload id.
     *
     * @return the workload id
     */
    public String getWorkloadId() { return workloadId; }

    /**
     * Sets workload id.
     *
     * @param workloadId the workload id
     */
    public void setWorkloadId(String workloadId) { this.workloadId = workloadId; }

    /**
     * Gets timestamp.
     *
     * @return the timestamp
     */
    public long getTimestamp() { return timestamp; }

    /**
     * Sets timestamp.
     *
     * @param timestamp the timestamp
     */
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }

    /**
     * Gets event type.
     *
     * @return the event type
     */
    public String getEventType() { return eventType; }

    /**
     * Sets event type.
     *
     * @param eventType the event type
     */
    public void setEventType(String eventType) { this.eventType = eventType; }
}

