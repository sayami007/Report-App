package mic.unlimited.com.reportingapp.Database.Event;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.AllEvent;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event7cDb extends RealmObject {

    @PrimaryKey
    private int id;
    private AllEvent event;
    private Supervisor supervisor;
    private String supervisorPos;

    private String groupName;
    private Date date;
    private String smName;

    private long contactNumber;
    private int wardNumber;
    private String village;
    private int maleP;
    private int femaleP;
    private String topic;
    private String question;
}
