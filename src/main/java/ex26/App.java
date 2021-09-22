package ex26;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 26 - Months to Pay Off a Credit Card. (Program that will help you determine how many months it will take to pay off a credit card balance. The program will ask for the balance of a credit card, the APR of the card, and their monthly payment. Then it will output the number of months needed to pay off the card.)
class PaymentCalculator { //This class will be used to house our math functions.
    public int calculateMonthsUntilPaidOff(double b, double APR, double p){
        double i = (APR/100)/365;

        //n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        return (int) Math.ceil(-(1.0/30.0)*Math.log(1+(b/p)*(1.0-Math.pow(1.0+i, 30)))/Math.log(1+i));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("What is your balance? ");
        double b = start_scan.nextDouble(); //Reads in the balance amount.
        System.out.print("What is the APR on the card (as a percent)? ");
        double APR = start_scan.nextDouble(); //Reads in the APR.
        System.out.print("What is the monthly payment you can make? ");
        double p = start_scan.nextDouble(); //Reads in the amount of monthly payments needed.

        PaymentCalculator pay; //Creating a reference to PaymentCalculator.
        pay = new PaymentCalculator();
        pay.calculateMonthsUntilPaidOff(b, APR, p);

        System.out.print("It will take you " + pay.calculateMonthsUntilPaidOff(b, APR, p) + " months to pay off this card."); //Prints out how many monthly payments will be needed to pay off the card.
        start_scan.close();
    }
}
