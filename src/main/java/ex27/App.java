package ex27;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.Scanner;

//Exercise 27 - Validating Inputs. (Program that prompts for a first name, last name, employee ID, and ZIP code. Then it will ensure that the input is valid according to: First & Last name being filled in, first and last name being at least 2 characters long, employee ID in format AA-1234, and that the zip is a number.)
class Main {
    static String isFirstName(String fn_input){ //'isFirstName' will validate if the first name is input and if it is the correct length.
        if(fn_input.equals("")){ //'If' statement that will run if the first name is blank.
            return "The first name must be at least 2 characters long.\nThe first name must be filled in.";
        }
        else if(fn_input.length() < 2){ //'If' statement that will run if there are less than 2 characters and the first name is not blank.
            return "The first name must be at least 2 characters long.";
        }
        return "";
    }

    static String isLastName(String ln_input){ //'isLastName' will validate if the last name is input and if it is the correct length.
        if(ln_input.equals("")){ //'If' statement that will run if the first name is blank.
            return "\nThe last name must be at least 2 characters long.\nThe last name must be filled in.";
        }
        else if(ln_input.length() < 2){ //'If' statement that will run if there are less than 2 characters and the first name is not blank.
            return "\nThe last name must be at least 2 characters long.";
        }
        return "";
    }

    static String isZIP(String zip_input){ //'isZIP' will validate if the first name is input and if it is the correct length.
        if(zip_input.length() != 5){ //Will return false if ZIP is not 5-digits long.
            return "\nThe zipcode must be a 5 digit number.";
        }
        try { //Tries to see if zip_input is only digits, if not it will output an error.
            Integer.parseInt(zip_input);
        } catch (NumberFormatException errorNFE) {
            return "\nThe zipcode must be a 5 digit number.";
        }
        return "";
    }

    static String isEmployeeID(String EmID_input){ //'isEmployeeID' will validate if the ID is written in the format Two Letter, Hyphen, then 4 numbers.
        //!Character.toString(arraysID[0]).matches("[A-Z]")
        char[] arraysID = EmID_input.toUpperCase().toCharArray(); //Inputting current characters of 'ID_input' into array to see if they match the proper format.

        if(EmID_input.equals("")){
            return "\nThe employee ID must be in the format of AA-1234.";
        }
        if(EmID_input.length() != 7){
            return "\nThe employee ID must be in the format of AA-1234.";
        }
        else if(!Character.toString(arraysID[0]).matches("[A-Z]") || !Character.toString(arraysID[1]).matches("[A-Z]") || !Character.toString(arraysID[2]).matches("-")|| !Character.toString(arraysID[3]).matches("[0-9]") || !Character.toString(arraysID[4]).matches("[0-9]") || !Character.toString(arraysID[5]).matches("[0-9]") || !Character.toString(arraysID[6]).matches("[0-9]")){
            return "\nThe employee ID must be in the format of AA-1234.";
        }
        return "";
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.

        System.out.print("Enter the first name: ");
        String fn_input = start_scan.nextLine(); //Reads in the first name.
        System.out.print("Enter the last name: ");
        String ln_input = start_scan.nextLine(); //Reads in the last name.
        System.out.print("Enter the ZIP code: ");
        String zip_input = start_scan.nextLine(); //Reads in the ZIP code.
        System.out.print("Enter the employee ID: ");
        String EmID_input = start_scan.nextLine(); //Reads in the employee ID.

        //Below code block used to call functions that see if rules are followed.
        isFirstName(fn_input);
        isLastName(ln_input);
        isZIP(zip_input);
        isEmployeeID(EmID_input);

        String s = isFirstName(fn_input) + isLastName(ln_input) + isZIP(zip_input) + isEmployeeID(EmID_input);

        System.out.print((!s.equals("")) ? s : "There were no errors found."); //Prints out whether an input error was found and which errors they were.
        start_scan.close();
    }
}
