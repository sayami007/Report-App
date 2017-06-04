package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event10DbTopic extends RealmObject {
    @PrimaryKey
    private int topicId;
    private  String topic;
    private Event10Db event10;
}
