package mic.unlimited.com.reportingapp.Database.Event;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.AllEvent;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 4/21/17.
 */

public class Event8Db extends RealmObject {
    @PrimaryKey
    private int id;
    private AllEvent event;
    private Supervisor supervisor;
    private String supervisorPos;
    private String place;
    private Date date;
    private String club;
    private String wardNumber;
    private String tole;
    private String maleNumber;
    private String femaleNumber;


}
