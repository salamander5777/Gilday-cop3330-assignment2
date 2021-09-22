package ex38;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;
import java.util.Scanner;

//Exercise 38 - Filtering Values. (Program that prompts for a list of numbers, separated by spaces. The program then prints out a new list containing only the even numbers.)
class Main {
    public static Integer[] filterEvenNumbers(String[] numberArray){ //This function is used to get rid of any negative numbers in the scanned string.
        ArrayList<Integer> evenArray = new ArrayList<>();

        for (String s : numberArray) {
            if (((Integer.parseInt(s) / 2) * 2) == Integer.parseInt(s)) { //This will end up as false for 'odd' integers will not equal themselves when divided by 2 and then multiplied by 2.
                evenArray.add(Integer.parseInt(s));
            }
        }

        return evenArray.toArray(new Integer[0]);
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input_numbers = start_scan.nextLine(); //Reads in a string of numbers.
        String[] numberArray = input_numbers.split(" ");

        filterEvenNumbers(numberArray);
        System.out.print("The even numbers are " + Arrays.toString(filterEvenNumbers(numberArray)).replace("[", "").replace("]", "").replace(",", "") + ".");

        start_scan.close();
    }
}
