package com.linecomparision;

import java.util.Scanner;

public class LineComparison {

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Double x1, x2, x3, y1, y2, y3, dis1, dis2;

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter coordinate of initial point(x1,y1):");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("enter coordinate of end point of line1(x2,y2):");
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();

        System.out.println("enter coordinate of end point of line2(x3,y3):");
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        scanner.close();

        dis1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        dis2 = Math.sqrt((x3 - x1) * (x3 - x1) + (y3 - y1) * (y3 - y1));

        System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ")=" + dis1);
        System.out.println("distance between" + "(" + x1 + "," + y1 + ")," + "(" + x3 + "," + y3 + ")=" + dis2);

        if (dis1.equals(dis2)) {
            System.out.println("length of line1 and line2 are equal");
        } else {
            if (dis1 > dis2) {
                System.out.println("length of line1 is greater than line2");
            } else {
                System.out.println("length of line1 is lesser than line2");
            }
        }
    }
}