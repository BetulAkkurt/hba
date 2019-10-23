package day15;
// part1, run loop up to 100000000,
// and exit that loop when i is equal to 232558

// part2, continue part1, but instead of 232558 use some random number
// using random generator, Math.random, Random

import java.util.Random;

public class LoopBreakTask {
    public static void main(String[] args) {
       int number = -1;
        Random rnd = new Random();
        int srn = rnd.nextInt(10_000_000);
        int srn1 = (int)(Math.random()*100_000_000);

        for(int i = 0; i<=100_000_000; i++){
            System.out.println(i);
            if(i ==232558) {
                System.out.println("========");
                number = i;
                break;
            }
        }
        System.out.println("Your number is " + number);
    }


}
