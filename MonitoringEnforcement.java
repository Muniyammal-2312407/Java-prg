import java.util.*;

public class MonitoringEnforcement {
    private ArrayList<Vehicle> vehicleList = new ArrayList<>();
    private PriorityQueue<Vehicle> emergencyQueue;

    public MonitoringEnforcement() {
        emergencyQueue = new PriorityQueue<>(
            Comparator.comparing(Vehicle::isEmergencyVehicle).reversed()
        );
    }

    public void registerVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
        emergencyQueue.offer(vehicle);
    }

    public void showAllVehicles() {
        System.out.println("All Registered Vehicles:");
        for (Vehicle v : vehicleList) {
            System.out.println("  " + v);
        }
    }

    public void sortVehiclesByType() {
        Collections.sort(vehicleList, Comparator.comparing(Vehicle::getType));
        System.out.println("Vehicles Sorted by Type:");
        for (Vehicle v : vehicleList) {
            System.out.println("  " + v);
        }
    }

    public void processEmergencyVehicles() {
        System.out.println("Processing Vehicles (Priority: Emergency First):");
        while (!emergencyQueue.isEmpty()) {
            Vehicle v = emergencyQueue.poll();
            System.out.println("  Processed: " + v);
        }
    }
}
