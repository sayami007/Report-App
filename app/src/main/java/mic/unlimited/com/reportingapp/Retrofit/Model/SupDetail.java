package mic.unlimited.com.reportingapp.Retrofit.Model;

/**
 * Created by Bibesh on 6/4/17.
 */

public class SupDetail {
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

    public long getSupervisorPhone() {
        return supervisorPhone;
    }

    public String getUsernameText() {
        return usernameText;
    }

    public String getPasswordText() {
        return passwordText;
    }

    public int getDistrictId() {
        return districtId;
    }
}
