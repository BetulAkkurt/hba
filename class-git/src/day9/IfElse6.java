package day9;

import java.util.Scanner;

public class IfElse6 {
    public static void main(String[] args){

    Scanner scan = new Scanner(System.in);

        System.out.println("provide a grade: ");

        String grade = scan.nextLine();

        if(grade.equals("A")) {
            System.out.println("Excellent");
        }

        else if(grade.equals("B")) {
            System.out.println("Good");
        }

        else if(grade.equals("C")) {
            System.out.println("Middle");
        }
       else if(grade.equals("D")) {
            System.out.println("Pass");

        }
        else if(grade.equals("F")) {
            System.out.println("Fail");
        }

        else {
            System.out.println("Invalid Grade");
        }


    }}
