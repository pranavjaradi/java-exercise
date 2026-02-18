package basic;

import java.util.Scanner;

public class TemperatureConvertor {

    public static double celsiusToFahrenheitConverter(double celsius) {
        return (celsius * 9.0/5.0) + 32;
    }


    public static void main(String[] args) {
        // Initiating scanner for user input
        Scanner sc = new Scanner(System.in);

        // asking and taking user input
        System.out.println("Hello, I am a Celsius to Fahrenheit temperature converter. \n" +
                "Enter temperature in Celsius: ");
        double tempInCelsius = sc.nextDouble();

        // closing the scanner
        sc.close();

        // calculating and printing the result
        double output = celsiusToFahrenheitConverter(tempInCelsius);
        System.out.println(tempInCelsius + " Celsius will be " + output + " in Fahrenheit.");



    }




}
