package com.linecomparision;

import java.util.Scanner;

public class LineComparison {
    public static Double x1, y1;// start point is same for each line
    public Double x, y;//end point
    public Double dis;
// calculation of length between two points
    public void getDistance() {
        this.dis = Math.sqrt((x1 - this.x) * (x1 - this.x) + (y1 - this.y) * (y1 - this.y));
    }
// comparing two lines
    public static void compareLine(LineComparison line1, LineComparison line2) {
        System.out.println("line1 : distance between" + "(" + x1 + "," + y1 + ")," + "(" + line1.x + "," + line1.y + ")=" + line1.dis);
        System.out.println("line2 : distance between" + "(" + x1 + "," + y1 + ")," + "(" + line2.x + "," + line2.y + ")=" + line2.dis);

        if (line1.dis.equals(line2.dis)) {
            System.out.println("length of line1 and line2 are equal");
        } else {
            if (line1.dis > line2.dis) {
                System.out.println("length of line1 is greater than line2");
            } else {
                System.out.println("length of line1 is lesser than line2");
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");

        LineComparison line1 = new LineComparison();
        LineComparison line2 = new LineComparison();

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter coordinate of initial point(x1,y1):");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();

        System.out.println("enter coordinate of end point of line1(x2,y2):");
        line1.x = scanner.nextDouble();
        line1.y = scanner.nextDouble();
        line1.getDistance();
        System.out.println("enter coordinate of end point of line2(x3,y3):");
        line2.x = scanner.nextDouble();
        line2.y = scanner.nextDouble();
        line2.getDistance();

        compareLine(line1,line2);
        scanner.close();
    }
}