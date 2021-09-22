package ex39;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        System.out.print("Name                | Position          | Separation Date \n--------------------|-------------------|----------------\n");
        for(int i = 0; i < 5; i++){
            System.out.format("%-20s%-1s%-18s%-1s", ("John" + " " + "Johnson"), "| ", ("Manager"), ("| " + "2016-12-31\n"));
        }
    }
}