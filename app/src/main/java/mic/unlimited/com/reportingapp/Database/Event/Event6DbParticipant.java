package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event6DbParticipant extends RealmObject {
    @PrimaryKey
    private int participantId;
    private int event;
    private String name;
    private String address;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getEvent() {
        return event;
    }

    public void setEvent(int event) {
        this.event = event;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
