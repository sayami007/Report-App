package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Supervisor extends RealmObject {
    @PrimaryKey
    private int supervisroId;
    private String supervisorName;
    private long supervisorPhone;
    private String usernameText;
    private String passwordText;
    private District district;

}
