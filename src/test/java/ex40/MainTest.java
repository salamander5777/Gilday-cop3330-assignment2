package ex40;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void employee_search() {
        System.out.print("\nResults:\n\n");
        String input_name = "J";
        if(input_name.matches("J")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("Jacquelyn" + " " + "Jackson"), "| ", ("DBA"), ("| " + "\n"));
            System.out.format("%-20s%-1s%-18s%-1s", ("Jake" + " " + "Jacobson"), "| ", ("Programmer"), ("| " + "\n"));
            System.out.format("%-20s%-1s%-18s%-1s", ("John" + " " + "Johnson"), "| ", ("Manager"), ("| " + "2016-12-31\n"));
        }
        else if(input_name.matches("Ja") || input_name.matches("Jac")) {
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("Jacquelyn" + " " + "Jackson"), "| ", ("DBA"), ("| " + "\n"));
            System.out.format("%-20s%-1s%-18s%-1s", ("Jake" + " " + "Jacobson"), "| ", ("Programmer"), ("| " + "\n"));
        }
        else if(input_name.matches("Jacq") || input_name.matches("Jacqu") || input_name.matches("Jacque") || input_name.matches("Jacquel") || input_name.matches("Jacquely") || input_name.matches("Jacquelyn") || input_name.matches("Jack") || input_name.matches("Jacks") || input_name.matches("Jackso") || input_name.matches("Jackson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("Jacquelyn" + " " + "Jackson"), "| ", ("DBA"), ("| " + "\n"));
        }
        else if(input_name.matches("Jak") || input_name.matches("Jake") || input_name.matches("Jaco") || input_name.matches("Jacob") || input_name.matches("Jacobs") || input_name.matches("Jacobso") || input_name.matches("Jacobson")) {
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("Jake" + " " + "Jacobson"), "| ", ("Programmer"), ("| " + "\n"));
        }
        else if(input_name.matches("Jo") || input_name.matches("Joh") || input_name.matches("John") || input_name.matches("Johns") || input_name.matches("Johnso") || input_name.matches("Johnson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("John" + " " + "Johnson"), "| ", ("Manager"), ("| " + "2016-12-31\n"));
        }
        else if(input_name.matches("M") || input_name.matches("Mi") || input_name.matches("Mic") || input_name.matches("Mich") || input_name.matches("Micha") || input_name.matches("Michae") || input_name.matches("Michael") || input_name.matches("Michaela") || input_name.matches("Michaels") || input_name.matches("Michaelso") || input_name.matches("Michaelson")) {
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("Michaela" + " " + "Michaelson"), "| ", ("District Manager"), ("| " + "2015-12-19\n"));
        }
        else if(input_name.matches("S") || input_name.matches("Sa") || input_name.matches("Sal") || input_name.matches("Sall") || input_name.matches("Sally") || input_name.matches("W") || input_name.matches("We") || input_name.matches("Web") || input_name.matches("Webb") || input_name.matches("Webbe") || input_name.matches("Webber")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", ("Sally" + " " + "Webber"), "| ", ("Web Developer"), ("| " + "2015-12-18\n"));
        }
        else{
            System.out.print("This program did not find a first or last name containing the string: " + input_name);
        }
    }
}