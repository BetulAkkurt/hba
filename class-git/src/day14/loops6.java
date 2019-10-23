package day14;

import java.util.Scanner;

public class loops6 {
    public static void main(String[] args) {

        // part 2
// continue part 1, and get average

        Scanner scan = new Scanner(System.in);

        System.out.println("Provide a max number");
        int max = scan.nextInt();
        int sum = 0;
        int avarage = 0;

        for(int i = 1; i <= max; i++){

            System.out.println(i);
            sum += i; // same as sum = sum + i;
            avarage++;

        }

        System.out.println("sum is " + sum);
        System.out.println("Average is " + max);

        System.out.println((double) sum / max);





    }
}