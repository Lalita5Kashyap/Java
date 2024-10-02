package com.conditions;

import java.util.Scanner;
public class YearLeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long year = sc.nextLong();
        if (year!=0) {
            if (year % 400 == 0)
                System.out.println("Year is leap year");
            else if (year % 100 == 0)
                System.out.println("Year is  leap year");
            else if (year % 4 == 0)
                System.out.println("Year is  leap year");
            else
                System.out.println("Year is  not leap year");
        }
            else
            {
                System.out.println("Zero year doesn't exit");
            }
        }
}
