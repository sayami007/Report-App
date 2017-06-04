package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Vdc extends RealmObject {
    @PrimaryKey
    private int vdcId;
    private String vdcName;
    private String vdcHealthPost;
    private District district;
}
