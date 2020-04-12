package main;

import observer.observers.AlertSystem;
import observer.observers.Logger;
import observer.observers.Observer;
import observer.publisher.Publisher;
import observer.publisher.WeatherStation;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class MainObserver {
    private static Scanner scanner = new Scanner(System.in);

    private static WeatherStation weatherStation = new WeatherStation();
    private static Logger logger = new Logger(weatherStation);
    private static AlertSystem alertSystem = new AlertSystem(weatherStation);

    private static int userChoice;


    public static void main(String[] args) {
        while (true) {
            displayMenu();
            takeUserInput();
            update();
            try {
                Runtime.getRuntime().exec("clear");
            } catch (IOException e) {
                System.out.println("Error");
                e.printStackTrace();
            }
        }
    }

    private static void update() {
        if (userChoice >= 1 && userChoice <= 5) {
            switch (userChoice) {
                case 1:
                    weatherStation.setTemperature(weatherStation.getTemperature() + 1);
                    break;
                case 2:
                    weatherStation.setWindSpeed(weatherStation.getWindSpeed() + 1);
                    break;
                case 3:
                    weatherStation.setPressure(weatherStation.getPressure() + 1);
                    break;
                case 4:
                    logger.unsubscribe();
                    break;
                case 5:
                    alertSystem.unsubscribe();
                    break;
            }
        }
    }

    private static void takeUserInput() {
        String input = scanner.nextLine();
        try {
            userChoice = Integer.parseInt(input);


        } catch (Exception e) {
            System.out.println("That's not a number!");
        }
    }

    private static void displayMenu() {
        System.out.println("------- Observer Pattern Implementation -------\n");
        System.out.println(
                String.format(Locale.US,
                        "%-25s  T: %5.2f | WS: %5.2f | P: %5.2f",
                        "Weather Station", weatherStation.getTemperature(), weatherStation.getWindSpeed(), weatherStation.getPressure()
                )
        );
        System.out.println(
                String.format(Locale.US,
                        "%-25s %2d",
                        "Observers", weatherStation.getObservers().size()
                )
        );

        System.out.println();

        System.out.println(
                String.format(Locale.US,
                        "%-25s  T: %5.2f | WS: %5.2f | P: %5.2f",
                        "Logger", logger.getTemperature(), logger.getWindSpeed(), logger.getPressure()
                )
        );
        System.out.println(
                String.format(Locale.US,
                        "%-25s  T: %5.2f | WS: %5.2f | P: %5.2f",
                        "Alert System", alertSystem.getTemperature(), alertSystem.getWindSpeed(), alertSystem.getPressure()
                )
        );

        System.out.println();
        System.out.println("-----------------------------------------------");

        System.out.println(
                String.format(
                Locale.US,
                "1. %s\n2. %s\n3. %s\n4. %s\n5. %s",
                "Add Temperature", "Add Wind Speed", "Add Pressure", "Unsubscribe Logger", "Unsubscribe Alert System")
        );

        System.out.println();
    }
}
