package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Car> carList;

    public static void main(String[] args) {

        carList = new ArrayList<Car>();
        promptUserForCar();
        displayAllCars();

    }
    public static void promptUserForCar() {
        String input = "Y";
        Scanner keyboard = new Scanner(System.in);
        String colour;
        String make;
        String status;
        String speed;

        while (input.equalsIgnoreCase("y")) {
            System.out.print("Do you want to enter car information (Y|N): ");
            input = keyboard.nextLine();
            if (input.equalsIgnoreCase("y")) {
                System.out.print("Enter the colour of car: ");
                colour = keyboard.nextLine();
                System.out.print("Enter the make of car: ");
                make = keyboard.nextLine();
                Car c = new Car(colour, make);
                System.out.print("Enter the driver of car: ");
                String driver = keyboard.nextLine();
                c.setDriver(driver);
                carList.add(c);
            } else
                break;

        }
    }
    public static void displayAllCars() {
        for(Car c:carList) {
            System.out.println("" +c.getDescription());
        }
    }
}
