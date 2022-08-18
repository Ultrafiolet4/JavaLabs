package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Operations {

    int m;
    int c;
    double t;
    double b;
    double f;
    double g = 9.8;
    double z;

    public void insertAllNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert first number(Integer):");
        m = scanner.nextInt();
        System.out.println("Insert second number(Integer):");
        c = scanner.nextInt();
        System.out.println("Insert third number(Double):");
        t = scanner.nextDouble();
        System.out.println("Insert fourth number(Double):");
        b = scanner.nextDouble();
    }

    public void operatingWithFirstNumber() {
        f = Math.cbrt((m * t * g * t) + Math.abs(c * Math.sin(t)));
    }

    public void operatingWithSecondNumber() {
        z = m * Math.cos(b * t * Math.sin(t)) + c;
    }

    public void printOperatedNumbers() {
        System.out.println(f);
        System.out.println(z);
    }

    public void getCurrentTimeStamp() {
        String currentTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
        System.out.println(currentTime);
    }
}
