package day8;

public class MathRandom {
    public static void main(String[] args) {

    //Random numbers in java use Math.random()
        System.out.println(Math.random()); // to print random

    int min = 1;
    int max = 10;
    int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
        System.out.println(randomInRange);

//        String v6 = "160.95";
//        double price = Double.valueOf(v6);
//        //range 1 - 10
//        double quantity = randomInRange;
//
//        boolean checkingPrice = price * quantity == 321.9;
}



    }

