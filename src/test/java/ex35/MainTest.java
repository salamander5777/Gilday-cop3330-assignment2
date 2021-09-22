package ex35;

import org.junit.jupiter.api.Test;
import java.util.Random;

class MainTest {

    @Test
    void main() {
        String[] array = new String[]{"John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        Random contest = new Random();
        int contestantWinner = contest.nextInt(5);
        System.out.print("The winner is... " + array[contestantWinner]);
    }
}