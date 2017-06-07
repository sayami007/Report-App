package mic.unlimited.com.reportingapp.Database.Event;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;
import mic.unlimited.com.reportingapp.Database.EventName;
import mic.unlimited.com.reportingapp.Database.Supervisor;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Event12Db extends RealmObject {
    @PrimaryKey
    private int id;
    private EventName event;
    private Supervisor supervisor;
    private String supervisorPos;
    private int flyer1;
    private int flyer2;
    private int flyer3;
    private int flyer4;
    private int flyer5;
    private int babyBibs;
    private int towel;
    private int poster3D;

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

    public int getFlyer1() {
        return flyer1;
    }

    public void setFlyer1(int flyer1) {
        this.flyer1 = flyer1;
    }

    public int getFlyer2() {
        return flyer2;
    }

    public void setFlyer2(int flyer2) {
        this.flyer2 = flyer2;
    }

    public int getFlyer3() {
        return flyer3;
    }

    public void setFlyer3(int flyer3) {
        this.flyer3 = flyer3;
    }

    public int getFlyer4() {
        return flyer4;
    }

    public void setFlyer4(int flyer4) {
        this.flyer4 = flyer4;
    }

    public int getFlyer5() {
        return flyer5;
    }

    public void setFlyer5(int flyer5) {
        this.flyer5 = flyer5;
    }

    public int getBabyBibs() {
        return babyBibs;
    }

    public void setBabyBibs(int babyBibs) {
        this.babyBibs = babyBibs;
    }

    public int getTowel() {
        return towel;
    }

    public void setTowel(int towel) {
        this.towel = towel;
    }

    public int getPoster3D() {
        return poster3D;
    }

    public void setPoster3D(int poster3D) {
        this.poster3D = poster3D;
    }
}
