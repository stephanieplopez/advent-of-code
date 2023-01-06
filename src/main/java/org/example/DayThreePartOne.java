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
       // List<String> rows = new ArrayList<>();

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

        for(int i = 0; i < measurements.size(); i++) {
            number = measurements.get(i);
            System.out.println("Number: " + number);
//            if(number.substring(i,i+1).equals("0")) {
//                zeroCount++;
//            } else {
//                oneCount++;

            //Issue is that we can't get our loop to properly go to the next row at the correct index

            for(int j = 0; j < measurements.size(); j++) {
                if (number.substring(j,j+1).equals("0")){
                    zeroCount++;
                } else {
                    oneCount++;
                }
                System.out.println("Zero Count: " + zeroCount);
                System.out.println("One Count: " + oneCount);
                System.out.println("----------------");
            }
            /* 1. if zeroCount > oneCount then gammaRate is zero and
            epsilon rate is one for that index
            2. Convert epilsonRate 11001101 and gammaRate 00110010 from binary to decimal
            and multiply them together */
        }

    }

}
