package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DayTwoPartTwo {

    public static void main(final String args[]) {
        List<Integer> measurements = new ArrayList<>();
        //List<Integer> increases = new ArrayList<>();

        int horizontal = 0;
        int depth = 0;
        int total = 0;
        int aim = 0;
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


                //if forward, we add to horizontal position and multiply by aim
                //if up, we subtract from the aim
                //if down, we add to the aim

                // If forward, we will add to the horizontal
                if(strCurrentLine.contains("forward")) {
                    horizontal += Integer.parseInt(currentNumber);
                    System.out.println("currentNumber = " + currentNumber);
                    System.out.println("horizontal = " + horizontal);
                    System.out.println("aim = " + aim);
                    //System.out.println("depth = " + depth);
                }
                // If down, we will add to the depth
                if(strCurrentLine.contains("down")) {
                    aim += Integer.parseInt(currentNumber);
                    System.out.println("currentNumber = " + currentNumber);
                    System.out.println("horizontal = " + horizontal);
                    System.out.println("aim = " + aim);
                    //System.out.println("depth = " + depth);
                }
                // If up, we will subtract from the depth
                if(strCurrentLine.contains("up")) {
                    aim -= Integer.parseInt(currentNumber);
                    System.out.println("currentNumber = " + currentNumber);
                    System.out.println("horizontal = " + horizontal);
                    System.out.println("aim = " + aim);
                    //System.out.println("depth = " + depth);
                }
                depth += aim * horizontal;
                System.out.println("depth after loop = " + depth);

            }
            // At end, multiply horizontal times depth
            total = depth * horizontal;
            System.out.println("total is " + total);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
