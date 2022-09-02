package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayOnePartTwo {

    public static void main(final String args[]) {
        List<Integer> measurements = new ArrayList<>();
        //List<Integer> increases = new ArrayList<>();

        try {
            String strCurrentLine;
            BufferedReader objReader = null;

            //reads file in
            objReader = new BufferedReader(new FileReader("src/main/resources/input.txt"));

            while ((strCurrentLine = objReader.readLine()) != null) {
                measurements.add(Integer.parseInt(strCurrentLine));
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int count = 0;
        int a = 0;
        int b = 0;
        int c = 0;
        int combinedTotal = 0;
        int previous = 0;
        int previousTotal = 0;

        // Create an array to store combined values
        // Iterate through combinedValues list

        for (int i = 0; i <= measurements.size() - 3; i++) {
            previous = measurements.get(i);
            a = measurements.get(i + 1);
            b = measurements.get(i + 2);
            c = measurements.get(i + 3);
            previousTotal = previous + a + b;
            combinedTotal = a + b + c;

            if(i >= 1995) {
                System.out.println(previousTotal = previous + a + b);
                System.out.println(combinedTotal = a + b + c);
            }
            if(combinedTotal > previousTotal) {
                count++;
            }

        }
        System.out.println(count);
    }


}
