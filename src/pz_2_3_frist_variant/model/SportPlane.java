package pz_2_3_frist_variant.model;

public class SportPlane extends Aircraft {
    private int maxSpeed;

    public SportPlane(String model, int range, int fuelConsumption, int maxSpeed) {
        super(model, range, fuelConsumption);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void showInfo() {
        System.out.println("Спортивний літак " + getModel() + " має максимальну швидкість " + maxSpeed + " км/год.");
    }
}
