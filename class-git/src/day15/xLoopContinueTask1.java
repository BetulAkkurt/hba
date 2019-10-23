package day15;

public class xLoopContinueTask1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Start of iteration " + i);

        if(i%2 == 0){
            continue;

        } else{
            System.out.println("number is " +i);
        }
            System.out.println("end of iteration " + i);
        }
}}
