package ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void isEmployeeID() {
        char[] arraysID = "TK-4321".toUpperCase().toCharArray(); //Inputting current characters of 'ID_input' into array to see if they match the proper format.

        if("TK-4321".equals("")){
            System.out.print("\nThe employee ID must be in the format of AA-1234.");
        }
        if("TK-4321".length() != 7){
            System.out.print("\nThe employee ID must be in the format of AA-1234.");
        }
        else if(!Character.toString(arraysID[0]).matches("[A-Z]") || !Character.toString(arraysID[1]).matches("[A-Z]") || !Character.toString(arraysID[2]).matches("-")|| !Character.toString(arraysID[3]).matches("[0-9]") || !Character.toString(arraysID[4]).matches("[0-9]") || !Character.toString(arraysID[5]).matches("[0-9]") || !Character.toString(arraysID[6]).matches("[0-9]")){
            System.out.print("\nThe employee ID must be in the format of AA-1234.");
        }
    }
}