package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayThreePartOne {

    public static void main(final String args[]) {
        List<String> measurements = new ArrayList<>();

        try {
            String strCurrentLine;
            BufferedReader objReader = null;

            //reads file in
            objReader = new BufferedReader(new FileReader("src/main/resources/input.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                measurements.add(strCurrentLine);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        String number = "";
        int zeroCount = 0;
        int oneCount = 0;

        // power consumption = gammaRate * epsilonRate
        // most common to gamma rate
        // least common to epsilonRate

        for(int i = 0; i < 5; i++) {
            number = measurements.get(i);
            System.out.println("Number: " + number);

            for(int j = 0; i < number.length(); j++) {
                if (number.indexOf(j) == 0) {
                    zeroCount++;
                } else {
                    oneCount++;
                }
            }
            /* 1. if zeroCount > oneCount then gammaRate is zero and
            epsilon rate is one for that index
            2. Convert epilsonRate and gammaRate from binary to decimal
            and multiply them together */
        }

    }

}
