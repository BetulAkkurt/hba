package day8;

public class task2 {
    public static void main(String[] args) {
    //Random numbers in java use Math.random()
    double random = Math.random(); // 0 <-> 1
    System.out.println(random);

    System.out.println("-------------------");
    //this give us a random number between 0 and "int max"
    int max = 10; // declaring integer max with value 10
    double r1 = random * max; // gets random double between 0 - "max"
    int i1 = (int)r1; // gets integer form double
    System.out.println(r1); //printing double r1
    System.out.println(i1); //printing integer i1

    System.out.println("-------------------");
    //TODO task1: print random integer number between 0 and 100
    int max2 = 100; // declaring integer max with value 10
    double r2 = random * max2; // gets random double between 0 - "max"
    int i2 = (int)r2; // gets integer form double
    System.out.println(r2); //printing double r1
    System.out.println(i2); //printing integer i1

    System.out.println((int)(Math.random()*100));

    //task2: print 2 random numbers between 0 and 10;
}
}



