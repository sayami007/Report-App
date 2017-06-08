package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event2DbParticipants extends RealmObject {
    @PrimaryKey
    private int participantId;
    private Event2Db event;
    private String name;
    private String address;


    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public Event2Db getEvent() {
        return event;
    }

    public void setEvent(Event2Db event) {
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
