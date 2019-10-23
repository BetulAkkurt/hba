package calismalarim;

public class loop {
    public static void main(String[] args) {
        for(int i = 0; i<10;i++) { //loop variable
            System.out.println("Mesaj" + i);
        }
        int i = 0;
        while (i<10) {
            System.out.println("mesaj" + i);
            i++;
        }
        i=0;
        do {
            System.out.println("ikinci mesaj" + i);
            i++;
        }while (i<10);
    }
}
