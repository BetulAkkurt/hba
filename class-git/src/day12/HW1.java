package day12;

import java.util.Scanner;

public class HW1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a quiz grade: ");
        int quiz = scan.nextInt();
        int q = quiz;

        System.out.println("Provide a midterm grade: ");
        int midterm = scan.nextInt();
        int m = midterm;

        System.out.println("Provide a finalgrade grade: ");
        int finalgrade = scan.nextInt();
        int f = finalgrade;

        int average = (q + m + f ) / 3;


        if (average >= 90) {
            System.out.println("Grade is A");
        }
        else if ( average >= 80 && average < 90) {
            System.out.println("Grade is B");
        }
        else if (average >= 70 && average < 80) {
            System.out.println("Grade is C");
        }
        else if (average >= 60 && average<70) {
            System.out.println("Grade is D");
        }
        else {
            System.out.println("Grade is F");
        }
    }
}
