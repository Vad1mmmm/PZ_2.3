package pz_2_3_frist_variant.model;

public class PassengerPlane extends Aircraft {
    private int capacity;

    public PassengerPlane(String model, int range, int fuelConsumption, int capacity) {
        super(model, range, fuelConsumption);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void showInfo() {
        System.out.println("Пасажирський літак " + getModel() + " може перевезти " + capacity + " пасажирів.");
    }
}
