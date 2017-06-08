package mic.unlimited.com.reportingapp.Database.Event;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 4/21/17.
 */

public class Event2Db extends RealmObject {

    @PrimaryKey
    private int id;
    private EventName event;
    private Supervisor supervisor;
    private String supervisorPos;

    private String date;
    private String startDate;
    private String endDate;

    private int maleNumber;
    private int femaleNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EventName getEvent() {
        return event;
    }

    public void setEvent(EventName event) {
        this.event = event;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public String getSupervisorPos() {
        return supervisorPos;
    }

    public void setSupervisorPos(String supervisorPos) {
        this.supervisorPos = supervisorPos;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getMaleNumber() {
        return maleNumber;
    }

    public void setMaleNumber(int maleNumber) {
        this.maleNumber = maleNumber;
    }

    public int getFemaleNumber() {
        return femaleNumber;
    }

    public void setFemaleNumber(int femaleNumber) {
        this.femaleNumber = femaleNumber;
    }
}
