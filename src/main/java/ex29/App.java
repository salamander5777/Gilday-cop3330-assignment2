package ex29;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;

//Exercise 29 - Handling Bad Input. (Program that prompts for the rate of return on an investment and calculates how many years it will take to double your investment.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        String input_string;
        int r = 0;
        int years = 0;

        do{
            System.out.print("What is the rate of return? ");
            input_string = start_scan.nextLine(); //Reads in rate of return.

            if(input_string.matches("[0-9]+")){
                if(Integer.parseInt(input_string) <= 0){
                    System.out.print("Sorry. That's not a valid input.\n");
                }
                else{
                    years = (int) Math.ceil(72.0/Double.parseDouble(input_string));
                    r = 1;
                }
            }
            else{
                System.out.print("Sorry. That's not a valid input.\n");
            }
        }while(r == 0);

        System.out.print("It will take " + years + " years to double your initial investment.");  //Prints how many years it takes to double your investment.
        start_scan.close();
    }
}