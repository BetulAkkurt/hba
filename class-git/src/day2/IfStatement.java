package day2;

import javax.management.StandardEmitterMBean;

public class IfStatement<temperature, Temperature> {

    public static void main(String[] args ) {
        boolean statement = false;
        if (statement) {
            System.out.println("It is 20th century");
        }



        int temperature = 100;
        if (temperature >= 70) {
            System.out.println("Its hot");
        }
        if (temperature < 70 && temperature >= 60) {
            System.out.println("Its warm");
        }
        if (temperature < 60 && temperature >= 20) {
            System.out.println("Cool");
        }

        if (temperature < 20) System.out.println("Freezing");
        }

        if(temperature <= 0) {
            System.out.println("Its Negative");
        }

        if(temperature > 0){
            System.out.println("Pozitive");
        }
}


