package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.println("Input a namber");
	double m = in.nextDouble();
	double argone = Math.sqrt((Math.pow((3*m+2),2))-24*m);
	double argtwo = 3*Math.sqrt(m);
	double argthree = 2/Math.sqrt(m);
	double z = argone / (argtwo - argthree);
	System.out.println(z);
	in.close();
    }
}
