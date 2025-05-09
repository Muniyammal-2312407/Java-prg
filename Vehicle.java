public class Vehicle {
    private String numberPlate;
    private String type;
    private boolean isEmergency;

    public Vehicle(String numberPlate, String type, boolean isEmergency) {
        this.numberPlate = numberPlate;
        this.type = type;
        this.isEmergency = isEmergency;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getType() {
        return type;
    }

    public boolean isEmergencyVehicle() {
        return isEmergency;
    }

    @Override
    public String toString() {
        return numberPlate + " (" + type + ") - Emergency: " + isEmergency;
    }
}
