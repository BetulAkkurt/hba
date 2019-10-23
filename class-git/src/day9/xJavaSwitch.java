package day9;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class xJavaSwitch {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Provide a your grade");
        String grade = scan.nextLine();

        switch (grade) {
            case "A":
                System.out.println("excellent");
                break;
            case "B+":
            case "B":
            case "B-":
                System.out.println("good");
                break;
            case "C+":
            case "C":
            case "C-":
                System.out.println("middle");
                break;
            case "D+":
            case "D":
            case "D-":
                System.out.println("pass");
                break;
            case "F":
                System.out.println("fail");
            default:
                System.out.println("Invalid grade");

        }
    }
}
