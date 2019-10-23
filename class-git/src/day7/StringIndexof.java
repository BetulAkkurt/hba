package day7;

import javax.swing.*;

public class StringIndexof {
    public static void main(String[] args) {


        String s1 = "hello";
        System.out.println(s1.indexOf("ello"));

        System.out.println("ex2===================");

        String s2 = "Techno Study";
        int indexS2 = s2.indexOf("ech");
        System.out.println(indexS2);

        System.out.println("ex3-------------------");
        String s3 = "so something so many";
        int indexS3 = s3.lastIndexOf("so");
        System.out.println(indexS3);


    String str = "techno study";
    int length = str.length();
    int index = str.indexOf("e");

    int sum = length + index;
        System.out.println(sum);



    }
}
