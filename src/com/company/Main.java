package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    System.out.println("Hello World");
	    Scanner sc = new Scanner(System.in);

	    double a = sc.nextDouble();
	    double b = sc.nextDouble();
	    double c = sc.nextDouble();

	    System.out.println(a*b*c);

	    System.out.println((a+b+c)/3.0);

	    System.out.println(Math.min(a,Math.min(b,c)));
	    System.out.println(Math.min(a,Math.max(b,c)));
	    System.out.println(Math.max(a,Math.max(b,c)));



    }
}
