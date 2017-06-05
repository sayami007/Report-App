package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Vdc extends RealmObject {

    private int vdcId;
    private String vdcName;
    private String vdcHealthPost;
    private int district;


    public int getVdcId() {
        return vdcId;
    }

    public void setVdcId(int vdcId) {
        this.vdcId = vdcId;
    }

    public String getVdcName() {
        return vdcName;
    }

    public void setVdcName(String vdcName) {
        this.vdcName = vdcName;
    }

    public String getVdcHealthPost() {
        return vdcHealthPost;
    }

    public void setVdcHealthPost(String vdcHealthPost) {
        this.vdcHealthPost = vdcHealthPost;
    }

    public int getDistrict() {
        return district;
    }

    public void setDistrict(int district) {
        this.district = district;
    }
}
