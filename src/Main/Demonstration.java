package Main;
import pz_2_3_frist_variant.mainAirplane.AirlineApp;
import pz_2_3_two_variant.main_car.StartCarVariant;
import pz_2_3_2_my_array_list.StartArray;
import java.util.Scanner;

public class Demonstration {
    public static void startDemonstration() {
        System.out.print("""
                Вітаю!!! Ви в меню Пз 2.3
                Оберіть завдання, яке хочете переглянути
                1. Завдання 2.3.1 - варіант 1
                2. Завдання 2.3.1 - варіант 2
                3. Завдання 2.3.2
                4. Закінчити роботу
                Ваш вибір:\s""");
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        try {
            choice = sc.nextInt();
        }
        catch (Exception e){
           System.out.println();
        }
        switch (choice) {
            case 1 -> {
                AirlineApp.mainAirplane();
                pressToContinue();
                startDemonstration();
            }
            case 2 -> {
                StartCarVariant.startProgram();
                pressToContinue();
                startDemonstration();
            }
            case 3 -> {
                StartArray.startProgram();
                pressToContinue();
                startDemonstration();
            }
            case 4 -> {
                System.out.println("Гарного дня!");
            }
            default -> {
                System.out.println("Такого варіанту вибору немає");
                startDemonstration();
            }

        }
    }
    private static void pressToContinue() {
        System.out.println("Натисніть будь яку клавішу для того, щоб продовжити ");
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        System.out.println("\n");
    }
}
