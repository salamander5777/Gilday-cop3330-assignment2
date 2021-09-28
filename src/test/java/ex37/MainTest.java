package ex37;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

class MainTest {

    @Test
    void generateThePassword() {
        Random passwordGenerator = new Random();
        int randomNumber;
        List<String> list = Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "-", "_", "+", "=", "`", "~", "<", ">", ",", ".", "?", "/", "{", "[", "}", "]", ";", ":", "'", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"); //List the characters that will be used for the random number generator. 65 total characters.
        int indexSCA = 0, indexNC = 0, indexLA = 0, indexTotal = 0;
        StringBuilder password = new StringBuilder();
        int specialCharacterAmount = 2;
        int numberCount = 2;
        int passwordLength = 8;

        do{ //This will keep looping until all the conditions of password generation are met.
            randomNumber = passwordGenerator.nextInt(65);
            if(randomNumber < 29 && indexSCA != specialCharacterAmount){
                password.append(list.get(randomNumber));
                indexSCA = indexSCA + 1;
                indexTotal = indexTotal + 1;
            }
            else if(randomNumber >= 29 && randomNumber < 39 && indexNC != numberCount){
                password.append(list.get(randomNumber));
                indexNC = indexNC + 1;
                indexTotal = indexTotal + 1;
            }
            else if(randomNumber >= 39){
                password.append(list.get(randomNumber));
                indexLA = indexLA + 1;
                indexTotal = indexTotal + 1;
            }
        }while(indexLA <= passwordLength/2 || indexTotal < passwordLength || indexSCA < specialCharacterAmount || indexNC < numberCount);
        System.out.print("Your password is " + password);
    }
}