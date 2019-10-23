package day14;

import java.util.Scanner;

// Part1
// Write a program with sum up to you provided number from 0
// 5
// 0 + 1 + 2 + 3 + 4 + 5 = > ???
public class loops5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a max number: ");


        int max = scan.nextInt();

        int sum = 0;
        for(int i = 0; i<=max; i++){
            System.out.println(i);
        sum+=i;


        }



    }
}
