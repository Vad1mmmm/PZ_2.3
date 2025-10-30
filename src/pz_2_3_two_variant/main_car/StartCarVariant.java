package pz_2_3_two_variant.main_car;

import pz_2_3_two_variant.Car.*;
import pz_2_3_two_variant.service.CarPark;
import java.util.Collections;

public class StartCarVariant {
    public static void startProgram() {
        CarPark carPark = new CarPark();

        Car car1 = new PassengerCar(1300, "BMW", 60, 4, 4.3, 300);
        Car car2 = new CargoCar(6000, "Scania", 600, 16000, "Зернові культури", "Ресорна", 16.4);
        Car car3 = new SportCar(5000, "Pagani", 80, 12.7, 460, 3.1);
        Car car4 = new PassengerCar(1300, "Mercedes", 60, 4, 6.3, 300);
        Car car5 = new CargoCar(6000, "MAN", 600, 16000, "Зернові культури", "Ресорна", 12.2);
        Car car6 = new SportCar(5000, "Pasat", 80, 8.3, 450, 3.1);
        Car car7 = new SportCar(5000, "Bugati", 80, 12.7, 520, 3.1);
        Car car8 = new SportCar(5000,  "Lamborgini", 80, 12.7, 380, 3.1);
        Car car9 = new SportCar(5000, "Toyota Camry", 80, 12.7, 400, 3.1);

        carPark.addCar(car1, car2,  car3, car4, car5, car6, car7, car8, car9);


        carPark.GetAllCars();
        carPark.getTotalCargoCapacity();
        carPark.getPassengerTotalCount();
        Collections.sort(carPark.getCars());
        System.out.println("----------------------------sorted-----------------------");
        carPark.GetAllCars();
        System.out.println("----------------------------max speed--------------------");
        carPark.getCarMaxSpeed();
        carPark.getPriceAllCars();
        System.out.println("----------------------------Ride-------------------------");
        System.out.println(car1.Ride(199));
        System.out.println(car2.Ride(199));
        System.out.println(car3.Ride(199));
        System.out.println(car4.Ride(199));
        System.out.println(car6.Ride(199));


    }
}
