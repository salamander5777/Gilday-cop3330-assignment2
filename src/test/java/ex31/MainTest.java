package ex31;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void karvonenHeartRate() {
        double intensity = 0.55;
        int intensityPercent = 55;
        int bpm;

        System.out.print("Resting Pulse: " + 65 + "      Age: " + 22 + "\n\nIntensity    | Rate   \n-------------|--------\n"); //Prints out the resting pulse and starts setting up the table.
        do{
            bpm = (int) Math.round((((220 - 22) - 65)*intensity) + 65);
            System.out.print(intensityPercent + "%          | " + bpm + " bpm\n"); //Prints out the Rate at intensities increasing at increments of 5 from 55%.

            intensityPercent = intensityPercent +5;
            intensity = intensity + .05;
        }while(intensityPercent != 100);
    }
}