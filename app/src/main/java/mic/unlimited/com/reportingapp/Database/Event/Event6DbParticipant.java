package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event6DbParticipant extends RealmObject {
    @PrimaryKey
    private int participantId;
    private Event6Db event;
    private String name;
    private String address;
}
