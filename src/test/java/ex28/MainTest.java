package ex28;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        double AN = 0;

        for(int i = 0; i < 5; i++){
            AN = AN + 1;
        }
        System.out.print(AN);
    }
}