package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 4/20/17.
 */

public class Event1DB extends RealmObject {
    @PrimaryKey
    private int id;
    private Supervisor supervisorId;
    private String supervisorPos;
    private String date;
    private String chairperson;
    private int maleNumber;
    private int femaleNumber;
    private String officeRepresented;
    private String agenda;
    private String decision;
    private EventName eventId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Supervisor getSupervisorId() {
        return supervisorId;
    }

    public void setSupervisorId(Supervisor supervisorId) {
        this.supervisorId = supervisorId;
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

    public String getChairperson() {
        return chairperson;
    }

    public void setChairperson(String chairperson) {
        this.chairperson = chairperson;
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

    public String getOfficeRepresented() {
        return officeRepresented;
    }

    public void setOfficeRepresented(String officeRepresented) {
        this.officeRepresented = officeRepresented;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public EventName getEventId() {
        return eventId;
    }

    public void setEventId(EventName eventId) {
        this.eventId = eventId;
    }
}
