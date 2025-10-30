package pz_2_3_frist_variant.mainAirplane;
import pz_2_3_frist_variant.model.*;
import pz_2_3_frist_variant.service.Airline;

public class AirlineApp {
    public static void mainAirplane() {
        Airline airline = new Airline();

        airline.addPlane(new PassengerPlane("Boeing 737", 3500, 2400, 180));
        airline.addPlane(new CargoPlane("Antonov AN-124", 4800, 4000, 120));
        airline.addPlane(new SportPlane("Extra 300", 1200, 900, 400));

        System.out.println("=== Інформація про літаки ===");
        airline.showAllPlanes();

        System.out.println("\nЗагальна пасажиромісткість: " + airline.getTotalPassengerCapacity());
        System.out.println("Загальна вантажопідйомність: " + airline.getTotalLoadCapacity() + " тонн");

        System.out.println("\n=== Сортування за дальністю польоту ===");
        airline.sortByRange();
        airline.showAllPlanes();

        int searchFuel = 2400;
        System.out.println("\nПошук літака з витратою пального " + searchFuel + " л/100км:");
        var found = airline.findByFuelConsumption(searchFuel);
        System.out.println(found != null ? found : "Літак не знайдено.");
    }
}
