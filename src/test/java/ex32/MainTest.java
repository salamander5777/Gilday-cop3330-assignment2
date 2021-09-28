package ex32;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void difficultyThree() {
        int difficulty = 3;
        int guesses = 0;
        boolean wrong = true;
        if(difficulty == 1){
            do{
                String input_string = "7"; //This is the current guess.
                guesses = guesses + 1;
                if(input_string.matches("7")){
                    wrong = false;
                }
                else if(input_string.matches("[0-9]+")){
                    if(Integer.parseInt(input_string) < 7){
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
        }
        else if(difficulty == 2){
            do{
                String input_string = "77"; //This is the current guess.
                guesses = guesses + 1;
                if(input_string.matches("77")){
                    wrong = false;
                }
                else if(input_string.matches("[0-9]+")){
                    if(Integer.parseInt(input_string) < 77){
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
        }
        else if(difficulty == 3){
            do {
                String input_string = "777"; //This is the current guess.
                guesses = guesses + 1;
                if (input_string.matches("777")) {
                    wrong = false;
                } else if (input_string.matches("[0-9]+")) {
                    if (Integer.parseInt(input_string) < 777) {
                        System.out.print("Too low. Guess again: ");
                    } else {
                        System.out.print("Too high. Guess again: ");
                    }
                } else {
                    System.out.print("Wrong guess, please guess an integer value: ");
                }
            } while (wrong);
        }
        System.out.print("You got it in " + guesses + " guesses!\n");
    }
}