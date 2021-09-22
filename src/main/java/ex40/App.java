package ex40;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;
import java.util.Scanner;

//Exercise 40 - Filtering Records. (Program that lets a user locate all records that match the search string by comparing the search string to the first or last name field.)
class Employee{ //The 'Employee' class is used to create a list of each of the current employees.
    private final String firstName;
    private final String lastName;
    private final String position;
    private final String separationDate;

    public Employee(String firstName, String lastName, String position, String separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.separationDate = separationDate;
    }

    public String getFirstName(){ return firstName; }
    public String getLastName(){ return lastName; }
    public String getPosition(){ return position; }
    public String getSeparationDate(){ return separationDate; }
}

class Main {
    static Map<String, String> mapFirstName = new HashMap<>(); //Creation of the map to the full name.
    static Map<String, String> mapPosition = new HashMap<>(); //Creation of the map to position.
    static Map<String, String> mapSeparation = new HashMap<>(); //Creation of the map to separation date.

    public static void employee_search(String input_name, Map<String, String> sortedNameMap, Map<String, String> sortedPositionMap, Map<String, String> sortedSeparationMap){
        System.out.print("\nResults:\n\n");

        if(input_name.matches("J")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            for(int i = 0; i < 3; i++){
                System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(i).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(i).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(i).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(i).findFirst().orElse("") + "\n"));
            }
        }
        else if(input_name.matches("Ja") || input_name.matches("Jac")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            for(int i = 0; i < 2; i++){
                System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(i).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(i).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(i).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(i).findFirst().orElse("") + "\n"));
            }
        }
        else if(input_name.matches("Jacq") || input_name.matches("Jacqu") || input_name.matches("Jacque") || input_name.matches("Jacquel") || input_name.matches("Jacquely") || input_name.matches("Jacquelyn") || input_name.matches("Jack") || input_name.matches("Jacks") || input_name.matches("Jackso") || input_name.matches("Jackson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(0).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(0).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(0).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(0).findFirst().orElse("") + "\n"));
        }
        else if(input_name.matches("Jak") || input_name.matches("Jake") || input_name.matches("Jaco") || input_name.matches("Jacob") || input_name.matches("Jacobs") || input_name.matches("Jacobso") || input_name.matches("Jacobson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(1).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(1).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(1).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(1).findFirst().orElse("") + "\n"));
        }
        else if(input_name.matches("Jo") || input_name.matches("Joh") || input_name.matches("John") || input_name.matches("Johns") || input_name.matches("Johnso") || input_name.matches("Johnson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(2).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(2).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(2).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(2).findFirst().orElse("") + "\n"));
        }
        else if(input_name.matches("M") || input_name.matches("Mi") || input_name.matches("Mic") || input_name.matches("Mich") || input_name.matches("Micha") || input_name.matches("Michae") || input_name.matches("Michael") || input_name.matches("Michaela") || input_name.matches("Michaels") || input_name.matches("Michaelso") || input_name.matches("Michaelson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(3).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(3).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(3).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(3).findFirst().orElse("") + "\n"));
        }
        else if(input_name.matches("S") || input_name.matches("Sa") || input_name.matches("Sal") || input_name.matches("Sall") || input_name.matches("Sally") || input_name.matches("W") || input_name.matches("We") || input_name.matches("Web") || input_name.matches("Webb") || input_name.matches("Webbe") || input_name.matches("Webber")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(4).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(4).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(4).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(4).findFirst().orElse("") + "\n"));
        }
        else{
            System.out.print("This program did not find a first or last name containing the string: " + input_name);
        }
    }

    public static void main(String[] args) {
        Scanner start_scan = new Scanner(System.in); //Creation of a scanner object to allow for user input.
        List<Employee> employeeList = new ArrayList<>(); //Defining the list.

        //Below code block used to add employees to the employee list.
        employeeList.add(new Employee("John", "Johnson", "Manager", "2016-12-31"));
        employeeList.add(new Employee("Tou", "Xiong", "Software Engineer", "2016-10-05"));
        employeeList.add(new Employee("Michaela", "Michaelson", "District Manager", "2015-12-19"));
        employeeList.add(new Employee("Jake", "Jacobson", "Programmer", ""));
        employeeList.add(new Employee("Jacquelyn", "Jackson", "DBA", ""));
        employeeList.add(new Employee("Sally", "Webber", "Web Developer", "2015-12-18"));

        for(Employee emp : employeeList){ //Filling out the maps using the last name as a key and matching each other variable to them.
            mapFirstName.put(emp.getLastName(), emp.getFirstName());
            mapPosition.put(emp.getLastName(), emp.getPosition());
            mapSeparation.put(emp.getLastName(), emp.getSeparationDate());
        }

        System.out.print("Enter a search string: ");
        String input_name = start_scan.nextLine(); //Reads in the search input for first/last name.

        Map<String, String> sortedNameMap = new TreeMap<>(mapFirstName); //Creation of a new Tree Map; This will automatically organize the first names.
        Map<String, String> sortedPositionMap = new TreeMap<>(mapPosition); //Creation of a new Tree Map; This will automatically organize the positions.
        Map<String, String> sortedSeparationMap = new TreeMap<>(mapSeparation); //Creation of a new Tree Map; this will automatically organize the separation dates.

        employee_search(input_name, sortedNameMap, sortedPositionMap, sortedSeparationMap); //This is the function used to search for the name.

        start_scan.close();
    }
}
