package day8;

public class xMathRandom2 {

    public static void main(String[] args) {
        System.out.println((int)(Math.random()*0));
        System.out.println((int)(Math.random()*10));

        System.out.println("======================");

        int max = 10;
        double r1 = Math.random() * max;
        int i1 = (int)r1;
        System.out.println(i1);


        double r2 = Math.random() * max;
        int i2 = (int)r2;
        System.out.println(i2);


    }
}
