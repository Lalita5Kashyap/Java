package com.Strings;

public class DetectDoubleAndTripleSpace {
    public static void main(String[] args) {
        String line= "This string contains double and triple  spaCE";
        System.out.println(line.indexOf("  "));
        System.out.println(line.indexOf("   "));
    }
}
