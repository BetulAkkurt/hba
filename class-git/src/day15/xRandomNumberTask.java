package day15;

import java.util.Random;
import java.util.Scanner;

public class xRandomNumberTask {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess a Number game!!!");
        Random rand =new Random();
        int randomNumber = rand.nextInt(10);

        Scanner scan = new Scanner(System.in);
        int myNumber = -1;

        while ( myNumber != randomNumber) {
            System.out.println("Provide number");
            myNumber = scan.nextInt();

        if(myNumber < randomNumber) {
            System.out.println("Provide a greater number");

        } else{
            System.out.println("Provide a smaller number");
        }

        }
        System.out.println("you win the game");
        System.out.println("Number was" + randomNumber);

    }
}
