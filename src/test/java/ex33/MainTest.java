package ex33;

import org.junit.jupiter.api.Test;
import java.util.Random;

class MainTest {

    @Test
    void magicEightAnswer() {
        Random notYetMagicEight = new Random();
        int moreThanEight = 4;
        int magicEight = notYetMagicEight.nextInt(moreThanEight);
        if(magicEight == 1){
            System.out.print("Yes.");
        }
        else if(magicEight == 2){
            System.out.print("No.");
        }
        else if(magicEight == 3){
            System.out.print("Maybe.");
        }
        else{
            System.out.print("Ask again later.");
        }
    }
}