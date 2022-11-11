package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayTwo {

    public static void main(final String args[]) {
        List<Integer> measurements = new ArrayList<>();
        //List<Integer> increases = new ArrayList<>();

        int horizontal = 0;
        int depth = 0;
        int total = 0;
        String currentNumber = "";

        try {
            String strCurrentLine;
            BufferedReader objReader = null;

            //reads file in
//            objReader = new BufferedReader(new FileReader("/Users/jasonmann/IdeaProjects/advent-of-code/src/main/resources/input.txt"));

            objReader = new BufferedReader(new FileReader("src/main/resources/input.txt"));


            while ((strCurrentLine = objReader.readLine()) != null) {
                String[] parts = strCurrentLine.split(" " );
                currentNumber = parts[1];

                // If forward, we will add to the horizontal
                if(strCurrentLine.contains("forward")) {
                    horizontal += Integer.parseInt(currentNumber);
                    System.out.println("currentNumber = " + currentNumber);
                    System.out.println("horizontal = " + horizontal);
                }
                // If down, we will add to the depth
                if(strCurrentLine.contains("down")) {
                    depth += Integer.parseInt(currentNumber);
                    System.out.println("currentNumber = " + currentNumber);
                    System.out.println("depth = " + depth);
                }
                // If up, we will subtract from the depth
                if(strCurrentLine.contains("up")) {
                    depth -= Integer.parseInt(currentNumber);
                    System.out.println("currentNumber = " + currentNumber);
                    System.out.println("depth = " + depth);
                }
                // At end, multiply horizontal times depth
                total = horizontal * depth;
                System.out.println(total);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
