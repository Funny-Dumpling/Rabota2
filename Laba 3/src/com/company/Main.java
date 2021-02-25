package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("Введите значение x");
	        int x = in.nextInt();
	        System.out.println("Введите значение a");
	        int a = in.nextInt();
	        System.out.println("Введите значение c");
	        int c = in.nextInt();
	        System.out.println("Введите значение b");
	        int b = in.nextInt();
	        System.out.println("Введите значение x нач.");
	        int Xнач = in.nextInt();
	        System.out.println("Введите значение x кон.");
	        int Xкон = in.nextInt();
	        if (x+10 < 0 && b != 0) {
	        	double fx = ((a * Math.pow(x, 2))-c*x+b);
	        } else if (x+10 < 0 && b == 0) {
	        	double fx = (x - a) / (x - c);
	        } else { System.out.println(x);
	        }
	        in.close(); }
    }
