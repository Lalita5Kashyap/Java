package com.basicjava;
import java.util.Scanner;

public class GreetWithName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
       String name= sc.next();
        System.out.println("Hello " + name + " Have a good day");

    }
}
