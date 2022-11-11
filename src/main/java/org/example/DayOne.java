package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayOne {

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
        for (int i = 0; i <= measurements.size() - 2; i++) {
            a = measurements.get(i);
            b = measurements.get(i + 1);

            if(b > a) {
                count++;
            }
        }
        System.out.println(count);
    }


}

