package ex34;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void employeeList() {
        int employeeCount = 5;

        String[] array = {"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        System.out.print("There are " + employeeCount + " employees: \n" + array[0] + "\n" +  array[1] + "\n" + array[2] + "\n" + array[3] + "\n" + array[4]);
    }
}