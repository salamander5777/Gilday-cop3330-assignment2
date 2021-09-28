package ex38;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class MainTest {

    @Test
    void filterEvenNumbers() {
        String input_numbers = "1 2 3 4 5 6 7 8"; //The input string of numbers.
        String[] numberArray = input_numbers.split(" ");
        ArrayList<Integer> evenArray = new ArrayList<>();

        for (String s : numberArray) {
            if (((Integer.parseInt(s) / 2) * 2) == Integer.parseInt(s)) { //This will end up as false for 'odd' integers will not equal themselves when divided by 2 and then multiplied by 2.
                evenArray.add(Integer.parseInt(s));
            }
        }
        System.out.print("The even numbers are " + Arrays.toString(evenArray.toArray(new Integer[0])).replace("[", "").replace("]", "").replace(",", "") + ".");
    }
}