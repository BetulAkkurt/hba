package day7;

public class string2 {
    public static void main(String[] args) {
        String s1 = "ABCD";
        System.out.println(s1.length());

        int l = s1.length();
        System.out.println(l);

        String username = "techno.study";

        if(username.length() < 10) {
            System.out.println("you can login");
        }

        if(username.length() > 10) {
            System.out.println("you cannot login");
        }
    }
}
