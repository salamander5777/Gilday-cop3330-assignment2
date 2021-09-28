package ex24;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

class MainTest {

    @Test
    void isAnagram() {
            char[] arrays1 = "note".toLowerCase().toCharArray();
            char[] arrays2 = "tone".toLowerCase().toCharArray();

            Arrays.sort(arrays1);
            Arrays.sort(arrays2);

            if(Arrays.equals(arrays1, arrays2)){
                System.out.print("The two words are anagrams.");
            }
            else{
                System.out.print("The two words are not anagrams.");
            }
    }
}