package com.company;
import java.util.Scanner;
        public class Main {
            public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
                System.out.println("Введите натуральное число n");
                int x = in.nextInt();
                System.out.println("Введите количество повторов умножения");
                int y = in.nextInt();
                double kr = 1/Math.pow((2*x+1),2);
                for (int i = 1; i < y; i++) {
                    double S = 1 / (Math.pow((i), 2) * y + kr);
                    System.out.print("Результат равен = " + S);
                    in.close();
                }
            }
        }