package com.operators;
import java.util.Scanner;

public class CheckNumberIsGreaterThanUserNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter any number");
        int a = sc.nextInt();
        int b = 78;
        if (a>b)
        {
            System.out.println("User number is greater");
        }
        else
        {
            System.out.println("b is greater");
        }



    }
}
