package ex36;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void average() {
        double averageOfArray = 0.0;
        int index = 4;

        for(int i = 0; i<index; i++){
            averageOfArray = averageOfArray + 100;
        }

        averageOfArray = averageOfArray/index;
        System.out.print(averageOfArray);
    }
}