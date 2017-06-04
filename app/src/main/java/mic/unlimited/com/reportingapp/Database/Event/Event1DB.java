package mic.unlimited.com.reportingapp.Database.Event;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.AllEvent;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 4/20/17.
 */

public class Event1DB extends RealmObject {
    @PrimaryKey
    private int id;
    private Supervisor supervisorId;
    private String supervisorPos;
    private Date date;
    private String chairperson;
    private int maleNumber;
    private int femaleNumber;
    private String officeRepresented;
    private String agenda;
    private String decision;
    private AllEvent eventId;

}
