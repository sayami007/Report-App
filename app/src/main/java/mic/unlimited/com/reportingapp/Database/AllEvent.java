package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class AllEvent extends RealmObject {
    @PrimaryKey
    private int eventId;
    private String eventName;
}
