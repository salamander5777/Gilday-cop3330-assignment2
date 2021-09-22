package ex31;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;

//Exercise 31 - Karvonen Heart Rate. (Program that prompts for your age and your resting heart rate. Then the program uses the Karvonen formula to determine the target heart rate based on a range of intensities from 55% to 95%.)
class Main {
    public static void KarvonenHeartRate(int age, int heartRate){
        double intensity = 0.55;
        int intensityPercent = 55;
        int bpm;

        System.out.print("Resting Pulse: " + heartRate + "      Age: " + age + "\n\nIntensity    | Rate   \n-------------|--------\n"); //Prints out the resting pulse and starts setting up the table.
        do{
            bpm = (int) Math.round((((220 - age) - heartRate)*intensity) + heartRate);
            System.out.print(intensityPercent + "%          | " + bpm + " bpm\n"); //Prints out the Rate at intensities increasing at increments of 5 from 55%.

            intensityPercent = intensityPercent +5;
            intensity = intensity + .05;
        }while(intensityPercent != 100);
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        String input_age, input_hr; //Creating strings outside of loops and initializing int values.
        int age = 0;
        int heartRate = 0;
        int x = 0;

        do{
            System.out.print("How old are you? (Input number of years.) ");
            input_age = start_scan.nextLine(); //Reads in your age.

            if(input_age.matches("[0-9]+")){
                if(Integer.parseInt(input_age) <= 0){
                    System.out.print("Please input a valid age.\n");
                }
                else{
                    age = Integer.parseInt(input_age);
                    x = 1;
                }
            }
            else{
                System.out.print("Please input a valid age.\n");
            }
        }while(x == 0);

        do{
            System.out.print("What is your resting heart rate? ");
            input_hr = start_scan.nextLine(); //Reads in resting heart rate.

            if(input_hr.matches("[0-9]+")){
                heartRate = Integer.parseInt(input_hr);
                x = 1;
            }
            else{
                System.out.print("Please input a valid age.\n");
                x = 0;
            }
        }while(x == 0);
        KarvonenHeartRate(age, heartRate); //Calling the Karvonen Heart Rate calculator.

        start_scan.close();
    }
}