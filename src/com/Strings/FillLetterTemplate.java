package com.Strings;

public class FillLetterTemplate {
    public static void main(String[] args) {
        String letter= "Dear </name/> , Thanks a lot";
        letter= letter.replace("</name/>", "Lalita");
        System.out.println(letter);


    }
}
