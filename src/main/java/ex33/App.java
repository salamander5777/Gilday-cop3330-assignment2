package ex33;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;
import java.util.Random;

//Exercise 33 - Magic 8 Ball. (Program that acts like a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or "Ask again later.")
class Main {
    public static void magicEightAnswer(int magicEight){
        if(magicEight == 1){
            System.out.print("Yes.");
        }
        else if(magicEight == 2){
            System.out.print("No.");
        }
        else if(magicEight == 3){
            System.out.print("Maybe.");
        }
        else{
            System.out.print("Ask again later.");
        }
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        Random notYetMagicEight = new Random(); //This will allow a random integer generator to be created.
        int moreThanEight = 4; //This limits the random numbers to 0-4.

        System.out.print("What's your question?\n> ");
        String input_question = start_scan.nextLine(); //Reads in the question
        int magicEight = notYetMagicEight.nextInt(moreThanEight); //This is what actually generates our random number.

        magicEightAnswer(magicEight); //Calls the 'magicEightAnswer' function which will print out 1 of 4 different choices.
        start_scan.close();
    }
}
