package com.conditions;

import java.util.Scanner;
public class CalculateIncomeTaxPaidByUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter user salary");
        long salary = sc.nextLong();
        float tax =0;
        if(salary <=250000)
        {
            tax= 0;
            System.out.println("you are not tax payable");
        } else if (salary <= 500000) {
           tax = .05f * (salary-250000);
            System.out.println("You will pay 5% tax");

        } else if (salary <=1000000) {
            tax=0.2f *(salary- 250000);
            System.out.println("you will pay 20% tax");

        }
        else if (salary >=1000000)
        {
            tax=.3f *(salary-250000);
            System.out.println("you will pay 30% tax");
        }
    }
}
