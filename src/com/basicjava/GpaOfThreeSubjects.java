package com.basicjava;

import java.util.Scanner;

public class GpaOfThreeSubjects {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter number 1: ");
        float a = sc.nextFloat();
        System.out.print("Enter number 2: ");
        float b = sc.nextFloat();
        System.out.print("Enter number 3: ");
        float c = sc.nextFloat();
        float gpa =((a+b+c)*100)/300;
        System.out.print("GPA of three subjects is:" +gpa);

    }
}
