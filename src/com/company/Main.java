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

        double d = (b*b - 4*a*c);
        if (a!=0) {
            if (d < 0) {
                System.out.println("Корней НЕТ и не будет");
            }
            if (d==0) {
                System.out.println("Корень примерно " + -b/(2*a));
            }
            if (d>0) {
                System.out.println(" Первый корень " + (-b + Math.sqrt(d))/(2*a) + " Второй Корень " + (-b - Math.sqrt(d))/(2*a));
            }
        }
        if (a==0 && b!=0 && c!=0) {
            System.out.println(-c/b);
        }
        if (b==0 && c!=0 && a!=0) {
            System.out.println(" Первый корень " + (-b + Math.sqrt(d))/(2*a) + " Второй Корень " + (-b - Math.sqrt(d))/(2*a));
        }
        if (a==0 && b==0 && c==0) {
            System.out.println("Корень - любое число");
        }

        System.out.println("Hello World 2");

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double n = sc.nextDouble();

        if (n==0) {
            System.out.println("Неа");
        }
        if (n < 0) {
            if (y > x) {
                c = x;
                x = y;
                y = c;
            }
            for (double i = x; i >= y; i += n) {
                System.out.println(Math.sin(i));
            }
        }
            if (n > 0) {
                if (y < x) {
                    c = x;
                    x = y;
                    y = c;
                }
                for (double i = x; i <= y; i += n) {
                    System.out.println(Math.sin(i));
                }
            }

    }
}
