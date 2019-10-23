package day8;

public class xMathRandom {
    public static void main(String[] args) {
        double random = Math.random();
        System.out.println(random);

        System.out.println("-----------------");
        int max = 10;
        double r1 = random * max;
        int i1 = (int)r1;
        System.out.println(r1);
        System.out.println(i1);

        System.out.println("--------------------------");
        int max2 = 100;
        double r2 = random * max2;
        int i2 = (int)r2;
        System.out.println(r2);
        System.out.println(i2);
        System.out.println((int)(Math.random()*100));


    }
}
