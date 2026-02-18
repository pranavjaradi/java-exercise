package conditional.statements;

import java.util.Scanner;

public class BmiCalculator {

    public static double bmiValue(double weight, double height) {
        return (weight / Math.pow(height, 2.0));
    }

    public static String bmiCategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }


    public static void main(String[] args) {
        // Welcoming user and taking weight, height from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BMI calculator.\n" + "Enter your weight in KG: ");
        double weight = sc.nextDouble();

        System.out.println("Enter your height in meters: ");
        double height = sc.nextDouble();
        sc.close();

        // calculating bmi and category
        double bmi = bmiValue(weight, height);
        String bmiCategory = bmiCategory(bmi);

        // giving result to user
        System.out.printf("BMI Result are as follows:\nBMI Value: %.2f\nBMI Category: %s", bmi, bmiCategory);


    }
}
