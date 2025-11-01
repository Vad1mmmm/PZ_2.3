package pz_2_3_two_variant.Car;

public class PassengerCar extends Car {
    private int passengerCount;
    private double baggageWeigth;
    public PassengerCar(int price, String model, int fuelTank, int capacity, double engineValue,  double baggageWeigth) {
        super(price, model, fuelTank, engineValue);
        this.passengerCount = capacity;
        this.baggageWeigth = baggageWeigth;
    }
    public int getPassengerCount() {
        return passengerCount;
    }

    public double getBaggageWeigth() {
        return baggageWeigth;
    }

    @Override
    public String Ride(int kilometrsCount) {
        int reserveFuel = getFuelTank() / FuelConsumption() * 100;
        return "Пасажирський автомобіль " + this.getModel() + " вирушає в подорож. \n" +
                "Запас ходу — " + reserveFuel + " км/" + kilometrsCount + " км.\n" +
                "Кількість пасажирів — " + this.passengerCount + ", " +
                "вага багажу — " + this.baggageWeigth + " кг.\n" +
                "Поїздка буде комфортною та безпечною!\n";
    }

    @Override
    public String toString() {
        return super.toString() + ", кількість пасажирів: " + passengerCount + ", максимальна вага багажу: " +  baggageWeigth;
    }
}
