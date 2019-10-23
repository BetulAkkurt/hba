package day15;

public class xLoopBreak {
    public static void main(String[] args) {
        int number = 0;
        for(int i = 0; i<=10; i++){
            System.out.println(i);
            if(i == 5) {
                number = i;
                break;
            }
        }
        System.out.println("your number is" +number);
    }
}
