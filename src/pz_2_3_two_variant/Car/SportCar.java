package pz_2_3_two_variant.Car;

public class SportCar extends Car{

    private int maxSpeed;
    private double fastestSpeed;
    public SportCar(int price, String model, int fuelTank, double engineValue, int maxSpeed, double fastestSpeed) {
        super(price, model, fuelTank, engineValue);
        this.maxSpeed = maxSpeed;
        this.fastestSpeed = fastestSpeed;
    }

    public double getFastestSpeed() {
        return fastestSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    @Override
    public String Ride(int kilometrsCount) {
        int reserveFuel = getFuelTank() / FuelConsumption() * 100;
        return "Спортивний автомобіль " + this.getModel() + " вирушає на трасу. \n" +
                "Максимальна швидкість — " + this.maxSpeed + " км/год, " +
                "розгін 0–100 км/год за " + this.fastestSpeed + " с. \n" +
                "Запас ходу — " + reserveFuel + " км/" + kilometrsCount + " км.\n" +
                "Насолоджуйтесь драйвом!\n";
    }

    @Override
    public String toString() {
        return super.toString() + ", максимальна швидкість: " + maxSpeed + ", розгін 0 - 100 (км/год): " + fastestSpeed;
    }
}
