package ex32;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void difficultyThree() {
        int guesses = 0;
        boolean wrong = true;
        do{
            String input_string = "777"; //Reads in your current guess.
            guesses = guesses + 1;
            if(input_string.matches("777")){
                wrong = false;
            }
            else if(input_string.matches("[0-9]+")){
                if(Integer.parseInt(input_string) < 777){
                    System.out.print("Too low. Guess again: ");
                }
                else{
                    System.out.print("Too high. Guess again: ");
                }
            }
            else{
                System.out.print("Wrong guess, please guess an integer value: ");
            }
        }while(wrong);
        System.out.print("You got it in " + guesses + " guesses!\n");
    }
}