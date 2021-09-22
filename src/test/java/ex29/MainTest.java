package ex29;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void main() {
        int years = 0;
        if("4".matches("[0-9]+")){
            if(Integer.parseInt("4") <= 0){
                System.out.print("Sorry. That's not a valid input.\n");
            }
            else{
                years = (int) Math.ceil(72.0/Double.parseDouble("4"));
            }
        }
        else{
            System.out.print("Sorry. That's not a valid input.\n");
        }
        System.out.print(years);
    }
}