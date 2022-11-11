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
        int d = 0;
        int previousTotal = 0;

        // Create an array to store combined values
        // Iterate through combinedValues list

        for (int i = 0; i <= measurements.size() - 4; i++) {
            a = measurements.get(i);
            b = measurements.get(i + 1);
            c = measurements.get(i + 2);
            d = measurements.get(i + 3);
            previousTotal = a + b + c;
            combinedTotal = b + c + d;

            if(i >= 1990) {
                System.out.println(a);
                System.out.println(b);
                System.out.println(c);
                System.out.println(d);
                System.out.println(previousTotal = a + b + c);
                System.out.println(combinedTotal = b + c + d);
            }
            if(combinedTotal > previousTotal) {
                count++;
                if(count >= 1466) {
                    System.out.println("count = " + count);
                }
            }

        }
        System.out.println(count);
    }


}
