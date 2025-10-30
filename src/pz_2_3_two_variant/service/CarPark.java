package pz_2_3_two_variant.service;
import pz_2_3_two_variant.Car.*;
import java.util.ArrayList;
import java.util.*;

public class CarPark {
    private  ArrayList<Car> allCars = new ArrayList<Car>();

    public CarPark(){}

    public ArrayList<Car> getCars() {
        return allCars;
    }

    public void addCar(Car... cars){
        for (Car car : cars){
            allCars.add(car);
        }
    }

    public void GetAllCars() {
        for (Car car : allCars){
            System.out.println(car);
        }
    }

    public void getPriceAllCars() {
        int totalPrice = 0;
        for (Car car : allCars){
            totalPrice += car.getPrice();
        }
        System.out.println("Сумарна вартість автопарку:  " + totalPrice);
    }

    public void getTotalCargoCapacity() {
        int totalCargoCapacity = 0;
        for (Car car : allCars){
            if (car instanceof CargoCar c) {
                totalCargoCapacity += ((CargoCar) car).getCargoCapacity();
            }
        }
        System.out.println("Загальна вага вантажу, який можна перевезти: "  + totalCargoCapacity);
    }

    public void getPassengerTotalCount() {
        int passengerTotalCount = 0;
        for (Car car : allCars){
            if (car instanceof PassengerCar c) {
                passengerTotalCount += ((PassengerCar) car).getPassengerCount();
            }
        }
        System.out.println("Загальна кільсть пасажирів, яких можна перевезти: " + passengerTotalCount);
    }

    public void getCarMaxSpeed() {
        SportCar carMaxSpeed = null;

        for (Car car : allCars) {
            if (car instanceof SportCar sportCar) {
                if (carMaxSpeed == null || sportCar.getMaxSpeed() > carMaxSpeed.getMaxSpeed()) {
                    carMaxSpeed = sportCar;
                }
            }
        }

        if (carMaxSpeed != null) {
            System.out.println("Авто з найбільшою максимальною швидкістю:\n" + carMaxSpeed);
        } else {
            System.out.println("У парку немає спортивних автомобілів!");
        }
    }

}
