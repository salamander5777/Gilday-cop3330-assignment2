package ex36;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Exercise 36 - Computing Statistics. (Program that prompts for response times from a website in milliseconds. The program will keep asking for values until the user enters “done.”.)
class Main {
    public static Double average(double index, ArrayList<String> array){ //This function is used to find the average of all the numbers in the array.
        double averageOfArray = 0.0;

        for(int i = 0; i<index; i++){
            averageOfArray = averageOfArray + Double.parseDouble(array.get(i));
        }

        averageOfArray = averageOfArray/index; //This gives the mean of the array.
        return averageOfArray;
    }

    public static Double min(double index, ArrayList<String> array){ //This function is used to find the lowest number in the array.
        double minOfArray = Double.parseDouble(array.get(0));

        for(int i = 1; i<index; i++){
            if(Double.parseDouble(array.get(i)) < minOfArray){
                minOfArray = Double.parseDouble(array.get(i));
            }
        }
        return minOfArray;
    }

    public static Double max(double index, ArrayList<String> array){ //This function is used to find the highest number in the array.
        double maxOfArray = Double.parseDouble(array.get(0));

        for(int i = 1; i<index; i++){
            if(Double.parseDouble(array.get(i)) > Double.parseDouble(array.get(i - 1))){
                maxOfArray = Double.parseDouble(array.get(i));
            }
        }
        return maxOfArray;
    }

    public static Double std(double index, ArrayList<String> array){ //This function is used to find the standard deviation of all the numbers in the array.
        double stdOfArray = 0.0;
        double mean = 0.0;

        for(int i = 0; i<index; i++){
            mean = mean + Double.parseDouble(array.get(i));
        }
        mean = mean/index; //This gives the mean which is required to find Standard Deviation.

        for(int i = 0; i<index; i++){
            stdOfArray = stdOfArray + Math.pow((Double.parseDouble(array.get(i)) - mean), 2);
        }

        stdOfArray = stdOfArray/index;
        stdOfArray = Math.round(Math.sqrt(stdOfArray)*100.0)/100.0;
        return stdOfArray;
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        String input_number;
        double index = 0; //Will be used to track how many numbers are in the array.
        ArrayList<String> array = new ArrayList<>(); //Creation of an array that will hold the numbers.

        do{
            System.out.print("Enter a number: ");
            input_number = start_scan.nextLine(); //Reads in the input number.
            if(input_number.matches("[-0-9]+")){
                array.add(input_number);
                index = index+1;
            }
            else if(!input_number.matches("[-0-9]+") && !input_number.matches("done")){
                System.out.print("Sorry. That's not a valid input. Input either a number or done.\n");
            }
        }while(!input_number.matches("done"));

        System.out.print("Numbers: " + Arrays.toString(array.toArray()).replace("[", "").replace("]", "") + "\nThe average is " + average(index, array) + "\nThe minimum is " + min(index, array) + "\nThe maximum is " + max(index, array) + "\nThe standard deviation is " + std(index, array));

        start_scan.close();
    }
}
