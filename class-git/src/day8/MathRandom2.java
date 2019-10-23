package day8;

public class MathRandom2 {

    public static void main(String[] args) {
        //Random numbers in java use Math.random()
        double random = Math.random(); // 0 <-> 1
        System.out.println(random);

        System.out.println("-------------------");
        int max = 10;
        double r1 = random * max; // 0 - 10
        int i1 = (int)r1;
        System.out.println(r1);
        System.out.println(i1);

        //int randomInRange = min + (int) (Math.random() * ((max - min) + 1));
    }

}

