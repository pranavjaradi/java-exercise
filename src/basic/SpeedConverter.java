package basic;

import java.util.Scanner;

public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println("Welcome to Miles per hour conversion app.");
        System.out.println("Now we will convert your miles per hour speed into meter per second");

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your speed in miles per hour: ");

        float mphSpeed = sc.nextFloat();
        sc.close();

        float mpsSpeed = mphSpeed / 2.237f;

        System.out.printf("%f miles per hour will be %.4f meter per second.", mphSpeed, mpsSpeed);


    }
}
