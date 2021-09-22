package ex30;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

//Exercise 30 - Multiplication Table. (Program that generates a multiplication table for the numbers 1 through 12 (inclusive).)
class Main {
    public static void main(String[] args) {
        int x = 1; //Starts multiplication number at 1.
        do{ //Prints out a multiplication table for 1-12.
            for(int i = 1; i < 13; i++){
                System.out.printf("%5s", (x*i));
            }
            System.out.print("\n");
            x = x + 1;
        }while(x < 13);
    }
}