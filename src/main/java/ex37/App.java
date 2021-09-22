package ex37;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;
import java.util.Scanner;

//Exercise 37 - Password Generator. (Program that generates a secure password. Prompts for the minimum length, the number of special characters, and the number of numbers. Then it generates a password using those inputs.)
class Main {
    public static String GenerateThePassword(int passwordLength, int specialCharacterAmount, int numberCount){ //This function is used to create our password.
        Random passwordGenerator = new Random();
        int randomNumber;
        List<String> list = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "`", "~", "<", ">", ",", ".", "?", "/", "{", "[", "}", "]", ";", ":", "'", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"); //List the characters that will be used for the random number generator. 65 total characters.
        int indexSCA = 0, indexNC = 0, indexLA = 0, indexTotal = 0;
        StringBuilder password = new StringBuilder();

        do{ //This will keep looping until all the conditions of password generation are met.
            randomNumber = passwordGenerator.nextInt(65);
            if(randomNumber < 29 && indexSCA != specialCharacterAmount){
                password.append(list.get(randomNumber));
                indexSCA = indexSCA + 1;
                indexTotal = indexTotal + 1;
            }
            else if(randomNumber >= 29 && randomNumber < 39 && indexNC != numberCount){
                password.append(list.get(randomNumber));
                indexNC = indexNC + 1;
                indexTotal = indexTotal + 1;
            }
            else if(randomNumber >= 39){
                password.append(list.get(randomNumber));
                indexLA = indexLA + 1;
                indexTotal = indexTotal + 1;
            }
        }while(indexLA <= passwordLength/2 || indexTotal < passwordLength || indexSCA < specialCharacterAmount || indexNC < numberCount);

        return password.toString();
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What's the minimum length? ");
        int passwordLength = start_scan.nextInt(); //Reads in password minimum password length.
        System.out.print("How many special characters? ");
        int specialCharacterAmount = start_scan.nextInt(); //Reads in the amount of special characters there will be.
        System.out.print("How many numbers? ");
        int numberCount = start_scan.nextInt(); //Reads in the amount of numbers there will be in the password.

        System.out.print("Your password is " + GenerateThePassword(passwordLength, specialCharacterAmount, numberCount));

        start_scan.close();
    }
}
