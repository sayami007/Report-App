package mic.unlimited.com.reportingapp.Database;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Mother extends RealmObject {

    @PrimaryKey
    private int motherId;
    private String motherName;
    private int motherAge;
    private long motherContact;
    private Supervisor supervisorId;
    private int vdcId;

    public int getMotherId() {
        return motherId;
    }

    public void setMotherId(int motherId) {
        this.motherId = motherId;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public int getMotherAge() {
        return motherAge;
    }

    public void setMotherAge(int motherAge) {
        this.motherAge = motherAge;
    }

    public long getMotherContact() {
        return motherContact;
    }

    public void setMotherContact(long motherContact) {
        this.motherContact = motherContact;
    }

    public Supervisor getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Supervisor supervisorId) {
        this.supervisorId = supervisorId;
    }

    public int getVdcId() {
        return vdcId;
    }

    public void setVdcId(int vdcId) {
        this.vdcId = vdcId;
    }
}
