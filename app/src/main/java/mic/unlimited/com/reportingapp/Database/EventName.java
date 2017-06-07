package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;

/**
 * Created by Bibesh on 6/7/17.
 */

public class EventName extends RealmObject {
    private int eventId;
    private String eventName;

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}