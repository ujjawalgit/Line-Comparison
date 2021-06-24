package com.linecomparision;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Double x1, x2, y1, y2, distance;

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter coordinate of point1(x1,y1):");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        System.out.print("enter coordinate of point2(x2,y2):");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        scanner.close();

        distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        System.out.println("distance  between" + "(" + x1 + "," + y1 + "), " + "(" + x2 + "," + y2 + ")=" + distance);
    }
}