package mic.unlimited.com.reportingapp.Retrofit.Model;

import java.util.List;

/**
 * Created by Bibesh on 6/4/17.
 */

public class Supervisor {
    private int supervisorId;
    private List<VDC> vdc;

    public int getSupervisorId() {
        return supervisorId;
    }

    public List<VDC> getVdc() {
        return vdc;
    }
}
