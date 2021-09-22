package ex28;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;

//Exercise 28 - Adding Numbers. (Program that prompts the user for five numbers and computes the total of the numbers.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        double AN = 0;

        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            AN = AN + start_scan.nextDouble(); //Reads in the number name.
        }

        System.out.print("The total is " + AN + "."); //Prints out the final additive amount.
        start_scan.close();
    }
}
