package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event9DbPerson extends RealmObject{
    @PrimaryKey
    private int personId;
    private Event9Db event9;
    private String personName;

}
