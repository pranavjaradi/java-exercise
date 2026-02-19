package basic;

import java.util.Scanner;

public class LetterCounter {

    public static int letterCounter(String message, String letter) {
        message = message.toLowerCase();
        letter = letter.toLowerCase();
        int freq = 0;
        for (int i = 0; i < message.length(); i++) {
            if (letter.charAt(0) == message.charAt(i)) {
                freq++;
            }
        }
        return freq;
    }


    public static void main(String[] args) {
        System.out.println("Welcome to the Letter counter App!\n\nI will count the frequency of specific letter in a message.");

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your message: ");
        String message = sc.nextLine();


        System.out.println("Which letter would you like to count the frequency of: ");
        String letter = sc.nextLine();

        sc.close();

        int count = letterCounter(message, letter);
        System.out.printf("Dear user, your message has %d %s's in it.", count, letter);


    }
}
