package ex35;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

//Exercise 35 - Picking a Winner. (Program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.)
class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        ArrayList<String> array = new ArrayList<>(); //Creation of the initial array that will hold names for the contest.
        Random contest = new Random();
        int maxRandom = 0; //The current maximum value for 'Random'.
        String input_contestant;

        do{
            System.out.print("Enter a name: ");
            input_contestant = start_scan.nextLine(); //Reads in contestant.

            if(!input_contestant.matches("")){
                array.add(input_contestant);
                maxRandom = maxRandom + 1;
            }
        }while(!input_contestant.matches(""));
        int contestantWinner = contest.nextInt(maxRandom); //This is what generates the number for who won.

        System.out.print("The winner is... " + array.get(contestantWinner)); //Prints out the name of the winner, which should be random.

        start_scan.close();
    }
}
