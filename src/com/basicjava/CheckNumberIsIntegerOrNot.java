package com.basicjava;
import java.util.Scanner;

public class CheckNumberIsIntegerOrNot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any value");
        System.out.println(sc.hasNextInt());
    }
}
