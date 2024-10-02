package com.conditions;
import java.util.Scanner;

public class CheckStudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter subject number 1: ");
        float a = sc.nextFloat();
        System.out.println("Enter subject number 2: ");
        float b = sc.nextFloat();
        System.out.println("Enter subject number 3: ");
        float c = sc.nextFloat();

        float total = (a+b+c)/3.0f;
        if (a>=33 && b>=33 && c>=33 && total>=40)
        {
            System.out.println("Student is pass with this :" +total);
        }
        else
        {
            System.out.println("Student is fail: " +total);
        }


    }
}
