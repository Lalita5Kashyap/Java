package com.conditions;
import java.util.Scanner;
public class CheckWebsiteType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org"))
        {
            System.out.println("This is organization website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is commercial website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is indian website");
            
        }
        else
        {
            System.out.println("other website");
        }
    }
}
