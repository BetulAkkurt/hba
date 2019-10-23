package day14;

public class loops4 {
    public static void main(String[] args) {
    int counter = 0;
    int sum = 0;
    for(int i = 1; i <= 10; i = i + 3) {
        System.out.println(i);
        sum += i; // same as sum = sum + i;
        counter++; // same as counter = counter + 1;
    }

    System.out.println("sum from 1 to 10 with +3 is " + sum);
    System.out.println("counter is " + counter);

    System.out.println((double) sum / counter);
}
}
