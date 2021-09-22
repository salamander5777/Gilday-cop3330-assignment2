package ex24;

/*
*  UCF COP3330 Fall 2021 Assignment 2 Solution
*  Copyright 2021 Michael Gilday
*/

import java.util.*;

//Exercise 24 - Anagram Checker. (Program that prompts for two strings and compares them to determine if the two strings are anagrams.)
class Main {
    static boolean isAnagram(String s1, String s2){ //'isAnagram' function will be used to compare the lengths of the two strings, if the lengths of the strings match then it will then input them into an array and sort alphabetically, if the sort matches then they are anagrams of one another.
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            char[] arrays1 = s1.toLowerCase().toCharArray();
            char[] arrays2 = s2.toLowerCase().toCharArray();

            Arrays.sort(arrays1);
            Arrays.sort(arrays2);

            return Arrays.equals(arrays1, arrays2);
        }
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in);  //Creation of a scanner object to allow for user input.

        System.out.print("Enter two strings and I'll tell you if they are anagrams!");
        System.out.print("\nEnter the first string: ");
        String s1 = start_scan.next();  //Reads in the first string.
        System.out.print("Enter the second string: ");
        String s2 = start_scan.next();  //Reads in the second string.

        isAnagram(s1, s2); //Calling function isAnagram.

        System.out.print(!isAnagram(s1, s2) ? "\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are not anagrams." : "\"" + s1 + "\"" + " and " + "\"" + s2 + "\"" + " are anagrams."); //Prints out whether the two programs are anagrams.
        start_scan.close();
    }
}
