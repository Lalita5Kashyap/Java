package com.basicjava;
import java.util.Scanner;

public class ConvertKmToMiles {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your km value");
        double a=sc.nextInt();
        double miles = (a*0.62137);
        System.out.println(miles);
    }
}
