package com.basicjava;

import java.util.Scanner;

public class GpaOfThreeSubjects {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number 1");
        float a = sc.nextInt();
        System.out.println("Enter number 2");
        float b = sc.nextInt();
        System.out.println("Enter number 3");
        float c = sc.nextInt();
        float gpa =((a+b+c)*100)/300;
        System.out.println("GPA of three subjects is:" +gpa);

    }
}
