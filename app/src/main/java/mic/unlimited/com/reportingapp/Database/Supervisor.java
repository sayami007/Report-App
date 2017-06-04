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
    private int districtId;

    public int getSupervisroId() {
        return supervisroId;
    }

    public String getSupervisorName() {
        return supervisorName;
    }

    public void setSupervisorName(String supervisorName) {
        this.supervisorName = supervisorName;
    }

    public long getSupervisorPhone() {
        return supervisorPhone;
    }

    public void setSupervisorPhone(long supervisorPhone) {
        this.supervisorPhone = supervisorPhone;
    }

    public String getUsernameText() {
        return usernameText;
    }

    public void setUsernameText(String usernameText) {
        this.usernameText = usernameText;
    }

    public String getPasswordText() {
        return passwordText;
    }

    public void setPasswordText(String passwordText) {
        this.passwordText = passwordText;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }
}
