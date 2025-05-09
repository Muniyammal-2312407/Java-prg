public class Traffic {
    private String signalName;
    private Vehicle[] slots;

    public Traffic(String signalName, int capacity) {
        this.signalName = signalName;
        this.slots = new Vehicle[capacity];
    }

    public void addVehicle(Vehicle vehicle, int position) {
        if (position >= 0 && position < slots.length) {
            slots[position] = vehicle;
        }
    }

    public void showVehiclesInSignal() {
        System.out.println("Vehicles at signal: " + signalName);
        for (Vehicle v : slots) {
            if (v != null) {
                System.out.println("  " + v);
            }
        }
    }
}
