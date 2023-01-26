/*******************
 * Project 4 - Moon Search
 * this code uses a series of methods and arrays that determines the best location
 * Lorelai Anne
 * 2022 October 16
 */
package Projects.Project4;

import java.util.Arrays;
import java.util.Scanner;
public class MoonSearch {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        /**
          declares and initializes the main arrays needed
         */
        String[] moonNames = {"Phobus","Deimos","Adrastea","Aitne","Amalthea","Ananke","Aoede","Arche"};
        double[] radii = {11.3,6.2,68.9,33.6,71.2,26.8,255.9,47.4};
        double[] density = {1.8,1.4,14.2,33.3,16.4,68.1,121.3,38.2};
        double[] distance = {3.7,23.4,550391.6,227894.9,778893.6,143323.5,287223.5,449655.1};

        /**
          calls the methods needed and prints them out in correct format
         */
        System.out.printf("The average radius is: %.1f%n",calcAvg(radii));
        System.out.printf("The average density is: %.1f%n",calcAvg(density));
        System.out.println("The highest radius is: "+findHighValue(radii));
        System.out.println("The lowest distance is: "+findLeastValue(distance));

        /**
          prints out the arrays given by the methods findHighestTwo and
          findLowestTwo in their own lines
         */
        System.out.println("The highest two moons for radii are: ");
        String[] h2 = findHighestTwo(moonNames,radii);
        for (String k:h2){
            System.out.println("\t"+k);
        }
        System.out.println("The lowest two moons for density are: ");
        String[] l2 = findLowestTwo(moonNames,density);
        for (String i:l2){
            System.out.println("\t"+i);
        }

        /**
          prompts user to enter a moon name to check if
          the name is in the array moonNames
         */
        System.out.println("Enter a moon: ");
        String name = input.nextLine().trim();

        /**
          if/else method to print out a certain string depending
          on the value of the method being called
          in this case true/false.
         */
        if(findMoon(moonNames, name)== true){
            System.out.println(name+" is a moon in the array.");
        }else{
            System.out.println(name+" is not a moon in the array.");
        }
    }


    /**
     * calculates the average of an array after being called
     */
    public static double calcAvg(double [] values){
        double sum = 0;
        for (double value : values) {
            sum = sum + value;
        }
        return sum/values.length;
    }

    /**********
     * finds the highest value of a double array
     */
    public static double findHighValue(double[] values){
        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    /*************
     * finds the lowest value of a double array and returns the min
     */
    public static double findLeastValue(double[] values){
        double min = values[0];
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    /**********
     * the next two methods find the highest two and the lowest two
     * values in a double array and then returns the corresponding
     * string array values
     */
    public static String[] findHighestTwo (String[] names, double[] values){
        double largest = values[0];
        double second = -1;
        String stringLargest = names[0];
        String stringSecond = names[0];

        for (int i=0;i<values.length;i++){
            if (values[i]>largest){
                second = largest;
                largest = values[i];
                stringSecond = stringLargest;
                stringLargest = names[i];
            }
            else if (values[i]>second && values[i] != largest){
                second = values[i];
                stringSecond = names[i];
            }
        }
        return new String[]{stringLargest,stringSecond};
    }

    public static String[] findLowestTwo (String[] names,double[] values){
        double lowest = values[0];
        double second = -1;
        String stringLowest = names[0];
        String stringSecond = names[0];

        for (int i=0;i<values.length;i++){
            if (values[i]<lowest){
                second = lowest;
                lowest = values[i];
                stringSecond = stringLowest;
                stringLowest = names[i];
            }
            else if (values[i]<second && values[i] != lowest){
                second = values[i];
                stringSecond = names[i];
            }
        }
        return new String[]{stringLowest,stringSecond};
    }

    /************
     * a boolean method that will return true or false depending
     * on if the name input for the string moon is in
     * the names array. If it is it will return the value true.
     */
    public static boolean findMoon (String[] names, String moon){
        boolean moonName = false;
        for (String name : names) {
            if (moon.equals(name)) {
                moonName = true;
                break;
            } else {
                moonName = false;
            }
        }
        return moonName;
    }
}
