package day12;
//Find the Largest Number Among Three Numbers using user Input
//Finding largest of three numbers using if-else..if
//    int a = 34;
import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i1 = 50;
        int i2 = 30;
        int i3 = 40;
        if (i1 > i2 && i1 > i3) {
            System.out.println("Largest number is i1");
        }
         else if(i2 > i1 && i2 > i3) {
            System.out.println("Largest number is i2");
        }
        else {
            System.out.println("Largest number is i3");
        }
    }
}
