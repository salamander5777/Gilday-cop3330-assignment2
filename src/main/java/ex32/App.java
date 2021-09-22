package ex32;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;

//Exercise 32 - Guess the Number Game. (Program that acts like a "Guess the Number" game that has three levels of difficulty. The first level of difficulty uses a number between 1 and 10. The second difficulty has a number between 1 and 100. The third difficulty has a number between 1 and 1000. Each failed guess is tracked)
class Main {
    public static void difficultyOne(boolean wrong, int guesses, Scanner start_scan){ //Difficulty '1' for the game. The static correct number here is '7' which is between [1-10] inclusive.
        do{
            String input_string = start_scan.nextLine(); //Reads in your current guess.
            guesses = guesses + 1;
            if(input_string.matches("7")){
                wrong = false;
            }
            else if(input_string.matches("[0-9]+")){
                if(Integer.parseInt(input_string) < 7){
                    System.out.print("Too low. Guess again: ");
                }
                else{
                    System.out.print("Too high. Guess again: ");
                }
            }
            else{
                System.out.print("Wrong guess, please guess an integer value: ");
            }
        }while(wrong);
        System.out.print("You got it in " + guesses + " guesses!\n");
    }

    public static void difficultyTwo(boolean wrong, int guesses, Scanner start_scan){ //Difficulty '2' for the game. The static correct number here is '77' which is between [1-100] inclusive.
        do{
            String input_string = start_scan.nextLine(); //Reads in your current guess.
            guesses = guesses + 1;
            if(input_string.matches("77")){
                wrong = false;
            }
            else if(input_string.matches("[0-9]+")){
                if(Integer.parseInt(input_string) < 77){
                    System.out.print("Too low. Guess again: ");
                }
                else{
                    System.out.print("Too high. Guess again: ");
                }
            }
            else{
                System.out.print("Wrong guess, please guess an integer value: ");
            }
        }while(wrong);
        System.out.print("You got it in " + guesses + " guesses!\n");
    }
    public static void difficultyThree(boolean wrong, int guesses, Scanner start_scan){ //Difficulty '3' for the game. The static correct number here is '777' which is between [1-1000] inclusive.
        do{
            String input_string = start_scan.nextLine(); //Reads in your current guess.
            guesses = guesses + 1;
            if(input_string.matches("777")){
                wrong = false;
            }
            else if(input_string.matches("[0-9]+")){
                if(Integer.parseInt(input_string) < 777){
                    System.out.print("Too low. Guess again: ");
                }
                else{
                    System.out.print("Too high. Guess again: ");
                }
            }
            else{
                System.out.print("Wrong guess, please guess an integer value: ");
            }
        }while(wrong);
        System.out.print("You got it in " + guesses + " guesses!\n");
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        String goAgain;
        String input_string;

        do{
            int guesses = 0; //This will increment with the amount of guesses made until a correct guess. It will return to 0 if the player wishes to continue the game.
            do{ //Will only exit once a proper integer between [1-3], inclusive, is input.
                System.out.print("Enter the difficulty level (1, 2, or 3): ");
                input_string = start_scan.nextLine(); //Reads in difficulty level.
                if(!input_string.matches("1") && !input_string.matches("2") && !input_string.matches("3")){
                    System.out.print("Please input an acceptable difficulty (1, 2, 3).\n");
                }
            }while(!input_string.matches("1") && !input_string.matches("2") && !input_string.matches("3"));

            //Code block below used to call functions that allow for number guessing.
            System.out.print("I have my number. What's your guess? ");
            if(input_string.matches("1")){
                difficultyOne(true, guesses, start_scan);
            }
            else if(input_string.matches("2")){
                difficultyTwo(true, guesses, start_scan);
            }
            else if(input_string.matches("3")){
                difficultyThree(true, guesses, start_scan);
            }

            System.out.print("Do you wish to play again (Y/N)? ");
            goAgain = start_scan.nextLine();
        }while(goAgain.matches("Y") || goAgain.matches("y"));

        start_scan.close();
    }
}
