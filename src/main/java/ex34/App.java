package ex34;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;

//Exercise 34 - Employee List Removal. (Program that contains a list of employee names. It prints out the list of names when the program runs the first time. It then prompts for an employee name and removes that specific name from the list of names.)
class Main {
    public static void employeeList(int employeeCount, String input_question, String[] array, String[] employeeListNew){
        if(input_question.matches("John Smith")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 0){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Jackie Jackson")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 1){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Chris Jones")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 2){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Amanda Cullen")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 3){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }
        else if(input_question.matches("Jeremy Goodwin")){
            employeeCount = 4;
            for(int i = 0, r = 0; i < 5; i++){
                if (i == 4){
                    continue;
                }
                employeeListNew[r++] = array[i];
            }
        }

        if(!input_question.matches("Jeremy Goodwin") && !input_question.matches("Amanda Cullen") && !input_question.matches("Chris Jones") && !input_question.matches("Jackie Jackson") && !input_question.matches("John Smith")){
            System.out.print("There are " + employeeCount + " employees: \n" + array[0] + "\n" +  array[1] + "\n" + array[2] + "\n" + array[3] + "\n" + array[4]);
        }
        else{
            System.out.print("\nThere are " + employeeCount + " employees:\n" + employeeListNew[0] +  "\n" + employeeListNew[1] + "\n" + employeeListNew[2] + "\n" + employeeListNew[3]);
        }
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        int employeeCount = 5;

        String[] array = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"}; //The original employee list.
        String[] employeeListNew = new String[array.length - 1]; //Employee list w/ one less employee.

        System.out.print("There are " + employeeCount + " employees: \n" + array[0] + "\n" +  array[1] + "\n" + array[2] + "\n" + array[3] + "\n" + array[4] + "\n\nEnter an employee name to remove: ");
        String input_question = start_scan.nextLine(); //Reads in the employee slated for removal.

        employeeList(employeeCount, input_question, array, employeeListNew); //Calling the employeeList function and seeing if the input new matches a current employee.

        start_scan.close();
    }
}