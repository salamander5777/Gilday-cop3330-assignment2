package ex25;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 25 - Password Strength Indicator. (Program that determines the complexity of a given password based on specific rules).
//A password is very weak if it is less than 8 in length and only contains numbers. A password is weak if it is less than 8 in length and only contains letters. A password is strong if it is at least 8 in length and contains letters and numbers. A password is very strong if it is at least 8 in length and contains numbers, letters, and special characters.
class Main {
    static double passwordValidator(String s1){ //'passwordValidator' function will be used to create a value = to password complexity.
        int l = s1.length();
        char[] arrays1 = s1.toCharArray();
        int Alphabet = 0; //Establishing a base value for Alphabetical characters.
        int Num = 0; //Establishing a base value for Numerical characters.
        int Spe = 0; //Establishing a base value for Special characters.

        if(l < 8){
            for(int i = 0; i < l; i++){
                if(Character.isDigit(arrays1[i])){
                    Num = 1;
                }
                else if(Character.isLetter(arrays1[i])){
                    Alphabet = 2;
                }
                else if(!Character.toString(arrays1[i]).matches("[0-9]") || !Character.toString(arrays1[i]).matches("[A-Z]") || Character.toString(arrays1[i]).matches("[a-z]")){
                    Num = 1;
                }
            }
            return (Num+ Alphabet);
        }
        else{
            for(int i = 0; i < l; i++){
                if(Character.isDigit(arrays1[i])){
                    Num = 1;
                }
                else if(Character.isLetter(arrays1[i])){
                    Alphabet = 2;
                }
                else if(!Character.toString(arrays1[i]).matches("[0-9]") || !Character.toString(arrays1[i]).matches("[A-Z]") || Character.toString(arrays1[i]).matches("[a-z]")){
                    Spe = 1;
                }
            }
            return (Num+ Alphabet +Spe+1);
        }
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

        System.out.print("This program will check the strength of a given password.");
        System.out.print("\nInput a password to test: ");
        String s1 = start_scan.next();  //Reads in the provided password.

        passwordValidator(s1); //Calling function passwordValidator.

        System.out.print((passwordValidator(s1) == 1) ? "The password " + "'" + s1 + "'" + " is a very weak password." : (passwordValidator(s1) == 2) ? "The password " + "'" + s1 + "'" + " is a weak password." : (passwordValidator(s1) == 3) ? "The password " + "'" + s1 + "'" + " is an average password." : (passwordValidator(s1) == 4) ? "The password " + "'" + s1 + "'" + " is a strong password." : "The password " + "'" + s1 + "'" + " is a very strong password."); //Prints out the estimated strength of the password.
        start_scan.close();
    }
}
