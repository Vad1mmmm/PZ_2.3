package pz_2_3_two_variant.Car;

public class CargoCar extends Car{

    private int cargoCapacity;
    private String cargoType;
    private String transmisionType;
    public CargoCar(int price, String model, int fuelTank,  int cargoCapacity, String cargoType, String transmisionType, double engineValue) {
        super(price, model, fuelTank,  engineValue);
        this.cargoCapacity = cargoCapacity;
        this.cargoType = cargoType;
        this.transmisionType = transmisionType;
    }

    public String getCargoType() {
        return cargoType;
    }

    public String getTransmisionType() {
        return transmisionType;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public String Ride(int kilometrsCount) {
        int reserveFuel = getFuelTank()/FuelConsumption() * 100;
        System.out.println(FuelConsumption());
        return "Автомобіль " + this.getModel() + " вирушає в дорогу. \nЗапас ходу - " + reserveFuel + " км/" + kilometrsCount + " км \nЗавантаженість - " + this.cargoCapacity + " \nТип вантажу - " + this.cargoType + "\n";
    }

    @Override
    public String toString(){
        return super.toString() + ", вантажопідйомність: " + cargoCapacity + ", тип вантажу: " +  cargoType + ", тип трансмісії: " +  transmisionType;
    }

}
