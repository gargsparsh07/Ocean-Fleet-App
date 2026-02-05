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

    // UC4: Identify high-performance vessels
    public List<Vessel> getHighPerformanceVessels() {

        List<Vessel> highPerformanceList = new ArrayList<>();
        double maxSpeed = 0;

        // Step 1: Find maximum average speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() > maxSpeed) {
                maxSpeed = vessel.getAverageSpeed();
            }
        }

        // Step 2: Collect vessels with max speed
        for (Vessel vessel : vesselList) {
            if (vessel.getAverageSpeed() == maxSpeed) {
                highPerformanceList.add(vessel);
            }
        }

        return highPerformanceList;
    }

    public List<Vessel> getVesselList() {
        return vesselList;
    }
}

