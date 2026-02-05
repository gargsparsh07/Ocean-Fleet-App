package util;

import model.Vessel;
import java.util.ArrayList;
import java.util.List;

public class VesselUtil {

    private List<Vessel> vesselList = new ArrayList<>();

    // UC2: Add vessel details
    public void addVesselPerformance(Vessel vessel) {
        vesselList.add(vessel);
    }

    // UC3: Search vessel by vesselId
    public Vessel getVesselById(String vesselId) {

        for (Vessel vessel : vesselList) {
            if (vessel.getVesselId().equalsIgnoreCase(vesselId)) {
                return vessel;
            }
        }
        return null;
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }
}

