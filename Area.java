// package java_1;

import java.util.Scanner;
public class Area{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        final double PI= 3.14,area;
        int r;
        r= sc.nextInt();
        System.out.println("Enter the radius of circle");
        area=PI*r*r;
        System.out.println("Area of circle" +area);
    }
}