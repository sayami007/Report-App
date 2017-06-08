package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event5DbParticipant extends RealmObject {
    @PrimaryKey
    private int participantId;
    private int event5id;
    private String name;
    private String address;

    public int getParticipantId() {
        return participantId;
    }

    public void setParticipantId(int participantId) {
        this.participantId = participantId;
    }

    public int getEvent5id() {
        return event5id;
    }

    public void setEvent5id(int event5id) {
        this.event5id = event5id;
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
