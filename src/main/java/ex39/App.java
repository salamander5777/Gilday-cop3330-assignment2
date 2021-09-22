package ex39;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Gilday
 */

import java.util.*;

//Exercise 39 - Sorting Records. (Program that sorts all employees by last name and prints them to the screen in a tabular format.)
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

    public static void main(String[] args) {
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

        System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
        Map<String, String> sortedNameMap = new TreeMap<>(mapFirstName); //Creation of a new Tree Map; This will automatically organize the first names.
        Map<String, String> sortedPositionMap = new TreeMap<>(mapPosition); //Creation of a new Tree Map; This will automatically organize the positions.
        Map<String, String> sortedSeparationMap = new TreeMap<>(mapSeparation); //Creation of a new Tree Map; this will automatically organize the separation dates.

        for(int i = 0; i < 5; i++){
            System.out.format("%-20s%-1s%-18s%-1s", (sortedNameMap.values().stream().skip(i).findFirst().orElse("") + " " + sortedNameMap.keySet().stream().skip(i).findFirst().orElse("")), "| ", (sortedPositionMap.values().stream().skip(i).findFirst().orElse("")), ("| " + sortedSeparationMap.values().stream().skip(i).findFirst().orElse("") + "\n"));
        }
    }
}