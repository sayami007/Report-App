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

}
