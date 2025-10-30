package pz_2_3_two_variant.Car;

public abstract class Car implements Comparable<Car> {
    private int price;
    private String model;
    private int fuelTank;
    private double engineValue;

    public Car(int price, String model, int fuelTank, double engineValue) {
        this.price = price;
        this.model = model;
        this.fuelTank = fuelTank;
        this.engineValue = engineValue;
    }
    public int getPrice() {
        return price;
    }

    public int getFuelTank() {
        return fuelTank;
    }

    public String getModel() {
        return model;
    }

    public double getEngineValue() {
        return engineValue;
    }

    public abstract String Ride(int kilometrsCount);

    public int FuelConsumption() {
        return (int)engineValue * 10 / 2;
    }

    @Override
    public int compareTo(Car other) {
        return Integer.compare(this.FuelConsumption(), other.FuelConsumption());
    }

    @Override
    public String toString() {
        return "Модель авто: " + model + ", ціна: " + price + ", розмір паливного баку: " +  fuelTank + ", об'єм двигуна: " +  engineValue ;
    }

}