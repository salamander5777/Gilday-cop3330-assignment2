package ex36;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

class MainTest {

    @Test
    void average() {
        ArrayList<String> array = new ArrayList<>();
        array.add("100");
        array.add("200");
        array.add("1000");
        array.add("300");
        double averageOfArray = 0.0;
        double minOfArray = Double.parseDouble(array.get(0));
        double maxOfArray = Double.parseDouble(array.get(0));
        double stdOfArray = 0.0;
        double mean = 0.0;
        int index = 4;

        for(int i = 0; i<index; i++){
            averageOfArray = averageOfArray + Double.parseDouble(array.get(i));
            if(Double.parseDouble(array.get(i)) < minOfArray) {
                minOfArray = Double.parseDouble(array.get(i));
            }
            mean = mean + Double.parseDouble(array.get(i));
        }
        for(int i = 1; i<index; i++){
            if(Double.parseDouble(array.get(i)) > Double.parseDouble(array.get(i - 1))){
                maxOfArray = Double.parseDouble(array.get(i));
            }
        }
        mean = mean/index;
        for(int i = 0; i<index; i++){
            stdOfArray = stdOfArray + Math.pow((Double.parseDouble(array.get(i)) - mean), 2);
        }
        stdOfArray = stdOfArray/index;
        stdOfArray = Math.round(Math.sqrt(stdOfArray)*100.0)/100.0;
        averageOfArray = averageOfArray/index;

        System.out.print("Numbers: " + Arrays.toString(array.toArray()).replace("[", "").replace("]", "") + "\nThe average is " + averageOfArray + "\nThe minimum is " + minOfArray + "\nThe maximum is " + maxOfArray + "\nThe standard deviation is " + stdOfArray);
    }
}