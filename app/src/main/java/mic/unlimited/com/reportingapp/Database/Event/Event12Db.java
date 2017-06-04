package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.AllEvent;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event12Db extends RealmObject {
    @PrimaryKey
    private int id;
    private AllEvent event;
    private Supervisor supervisor;
    private String supervisorPos;
    private int flyer1;
    private int flyer2;
    private int flyer3;
    private int flyer4;
    private int flyer5;
    private int babyBibs;
    private int towel;
    private int poster3D;

}
