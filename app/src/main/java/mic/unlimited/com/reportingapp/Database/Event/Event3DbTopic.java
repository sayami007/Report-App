package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event3DbTopic extends RealmObject {
    @PrimaryKey
    private int topicId;
    private int event3DbId;
    private String topic;

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public int getEvent3DbId() {
        return event3DbId;
    }

    public void setEvent3DbId(int event3DbId) {
        this.event3DbId = event3DbId;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
