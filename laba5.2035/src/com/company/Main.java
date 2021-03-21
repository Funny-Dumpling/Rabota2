package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int[] array;
        array = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 31));
            System.out.println("Число массива - "+ array[i]);
        }
        System.out.println("Введите ваше число - ");
        Scanner in = new Scanner(System.in);
        int b = in.nextInt();
        int x = 0;
        for (int i = 0; i< array.length;i++){
            if (b == array[i]){
                x++;
            }
        }
        System.out.println("Число встречается - " + x);
    }
}