package pz_2_3_frist_variant.service;

import pz_2_3_frist_variant.model.*;
import java.util.*;

public class Airline {
    private List<Aircraft> fleet = new ArrayList<>();

    public void addPlane(Aircraft plane) {
        fleet.add(plane);
    }

    public int getTotalPassengerCapacity() {
        int total = 0;
        for (Aircraft a : fleet) {
            if (a instanceof PassengerPlane p) {
                total += p.getCapacity();
            }
        }
        return total;
    }

    public int getTotalLoadCapacity() {
        int total = 0;
        for (Aircraft a : fleet) {
            if (a instanceof CargoPlane c) {
                total += c.getLoadCapacity();
            }
        }
        return total;
    }

    public void sortByRange() {
        fleet.sort(Comparator.comparingInt(Aircraft::getRange));
    }

    public Aircraft findByFuelConsumption(int fuel) {
        for (Aircraft a : fleet) {
            if (a.getFuelConsumption() == fuel) {
                return a;
            }
        }
        return null;
    }

    public void showAllPlanes() {
        for (Aircraft a : fleet) {
            a.showInfo(); // поліморфізм у дії
        }
    }
}
