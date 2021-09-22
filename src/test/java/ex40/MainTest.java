package ex40;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void employee_search() {
        if("Johnson".matches("Johnson")){
            System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
            for(int i = 0; i < 1; i++){
                System.out.format("%-20s%-1s%-18s%-1s", ("John" + " " + "Johnson"), "| ", ("Manager"), ("| " + "2016-12-31\n"));
            }
        }
    }
}