package com.operators;

public class EncryptDecryptGrade {
    public static void main(String[] args) {
        char grade= 'b';
        grade =(char) (grade +8);
        System.out.println(grade);

        //Decrypt grade
        grade =(char) (grade -8);
        System.out.println(grade);

    }
}
