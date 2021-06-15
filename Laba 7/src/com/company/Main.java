package com.company;
        import java.util.Scanner;
        public class Main {

    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Введите строку");
        String str1 = in.nextLine();
        String[] chAr = str1.split(" ");
        String ch1 = chAr[0];
        for (int i = 1; i < chAr.length; i++) {
            if (ch1.length() < chAr[i].length()) ;
        }
        System.out.println(ch1);

    }
}

