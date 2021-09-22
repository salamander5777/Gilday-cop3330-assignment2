package ex30;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        int x = 1; //Starts multiplication number at 1.
        do{ //Prints out a multiplication table for 1-12.
            for(int i = 1; i < 13; i++){
                System.out.printf("%5s", (x*i));
            }
            System.out.print("\n");
            x = x + 1;
        }while(x < 13);
    }
}