package pz_2_3_frist_variant.model;

public class CargoPlane extends Aircraft {
    private int loadCapacity;

    public CargoPlane(String model, int range, int fuelConsumption, int loadCapacity) {
        super(model, range, fuelConsumption);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void showInfo() {
        System.out.println("Вантажний літак " + getModel() + " може перевозити до " + loadCapacity + " тонн вантажу.");
    }
}
