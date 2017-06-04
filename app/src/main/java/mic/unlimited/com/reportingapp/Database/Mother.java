package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Mother extends RealmObject{
    @PrimaryKey
    private int motherId;
    private String motherName;
    private int motherAge;
    private long motherContact;
    private Supervisor supervisorId;
}
