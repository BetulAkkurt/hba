package day15;

public class LoopContinue2 {public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
        System.out.println("beginning>>>>>>>>> " + i);
        if(i >= 4){
            continue;
        }
        System.out.println("ending<<<<<<<<< " + i);
        System.out.println();
    }
}
}

