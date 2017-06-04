package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event3DbTopic extends RealmObject {
    @PrimaryKey
    private int topicId;
    private Event3Db event3Db;
    private String topic;
}
