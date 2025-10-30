package pz_2_3_frist_variant.model;

public abstract class Aircraft {
    private String model;
    private int range;
    private int fuelConsumption;

    public Aircraft(String model, int range, int fuelConsumption) {
        this.model = model;
        this.range = range;
        this.fuelConsumption = fuelConsumption;
    }

    public String getModel() {
        return model;
    }

    public int getRange() {
        return range;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public abstract void showInfo(); // демонстрація поліморфізму

    @Override
    public String toString() {
        return String.format("%s (дальність: %dkm, витрата: %dл/100км)", model, range, fuelConsumption);
    }
}
