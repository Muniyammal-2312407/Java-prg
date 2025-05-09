public class Main {
    public static void main(String[] args) {
        Traffic signal = new Traffic("City Center", 3);

        Vehicle v1 = new Vehicle("TN01AB1234", "Car", false);
        Vehicle v2 = new Vehicle("TN09XZ0001", "Ambulance", true);
        Vehicle v3 = new Vehicle("TN04KL5678", "Truck", false);

        signal.addVehicle(v1, 0);
        signal.addVehicle(v2, 1);
        signal.addVehicle(v3, 2);

        System.out.println("----- TRAFFIC CLASS OUTPUT -----");
        signal.showVehiclesInSignal();

        MonitoringEnforcement monitor = new MonitoringEnforcement();
        monitor.registerVehicle(v1);
        monitor.registerVehicle(v2);
        monitor.registerVehicle(v3);

        System.out.println("\n----- MONITORING ENFORCEMENT OUTPUT -----");
        monitor.showAllVehicles();

        System.out.println("\n-- Sorted by Type --");
        monitor.sortVehiclesByType();

        System.out.println("\n-- Emergency Processing --");
        monitor.processEmergencyVehicles();
    }
}
