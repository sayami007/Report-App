package mic.unlimited.com.reportingapp.Database.Event;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 4/21/17.
 */

public class Event3Db extends RealmObject {
    @PrimaryKey
    private int id;
    private EventName event;
    private Supervisor supervisor;
    private String supervisorPos;
    private Date date;
    private String chairperson;
    private int maleNumber;
    private int femaleNumber;
    private int totalMedia;
}
