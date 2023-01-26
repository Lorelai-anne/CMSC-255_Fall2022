package Projects.Project7;

/*******************
 * Project 7 - Moon Study
 * This program accept at the command line two filenames and
 * processes them with methods
 * Lorelai Anne
 * 2022 December 3
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class MoonStudy {

    /**
     * openFile method reads the input file line by line and
     * produces a String arrayList from the input file
     * @param inputFile
     * @return ArrayList</String>
     * @throws FileNotFoundException
     */
    public static ArrayList<String> openFile(File inputFile) throws FileNotFoundException{
        Scanner in = new Scanner(inputFile);
        ArrayList<String> list = new ArrayList<String>();

        /**
         * reads each line and add them to arraylist
         */
        while(in.hasNextLine()) {
            String nextLine = in.nextLine();
            list.add(nextLine);
        }
        /**
         * closes input scanner
         */
        in.close();

        return list;
    }

    /**
     * creates objects from the arraylist by using the parseDouble method
     * and splitting the arrayList by tabs so
     * each object will have a name, a radius, a density, and a distance
     * @param lines
     * @return ArrayList</Moon>
     */
    public static ArrayList<Moon> createObjects(ArrayList<String> lines){
        ArrayList<Moon> moons = new ArrayList<>();
        String name;
        double radius, density, distance;

        /**
         * splits the arraylist by tabs
         */
        for (String line:lines) {
            String[] moon = line.split("\t");
            /**
             * assigns the first line to names
             */
            name = moon[0];

            /**
             * using parseDouble to assign the second index or line
             * to the radius value
             */
            try {
                radius = Double.parseDouble(moon[1]);
                /**
                 * checks if radius is negative, if so
                 * radius is set to 0.0
                 */
                if (radius < 0) {
                    radius = 0.0;
                }
                /**
                 * catch method for if a number format
                 * exception is found, if so radius is again
                 * set to zero
                 */
            } catch (NumberFormatException e) {

                radius = 0.0;
            }

            try {
                /**
                 * assigns second index to density
                 */
                density = Double.parseDouble(moon[2]);

                /**
                 * checks if negative
                 */
                if (density < 0) {
                    density = 0.0;
                }
                /**
                 * checks if zero
                 */
            } catch (NumberFormatException e) {
                density = 0.0;
            }

            /**
             * assigns third index to distance
             */
            try {
                distance = Double.parseDouble(moon[3]);
                /**
                 * checks if negative
                 */
                if (distance < 0) {
                    distance = 0.0;
                }
                /**
                 * checks if zero
                 */
            } catch (NumberFormatException e) {
                distance = 0.0;
            }

            /**
             * creates an object for moons, since in for loop still
             * it creates an object for each row
             */
            moons.add(new Moon(name, radius, density, distance));
        }return moons;
    }

    /**
     * calculates the average of a specific attribute
     * of the moon objects
     * @param moons
     * @param attribute
     * @return double
     */
    public static double findMean(ArrayList<Moon> moons,MoonAttributes attribute){
        double mean = 0.0;

        /**
         * for loop for each object and if/else if statements for
         * checking which attribute to calculate
         */
        for(Moon m : moons){
            if(attribute == MoonAttributes.DENSITY){
                mean += m.getDensity();
            }else if(attribute == MoonAttributes.DISTANCE){
                mean += m.getDistance();
            }else if(attribute == MoonAttributes.RADIUS){
                mean += m.getRadius();
            }
            /**
             * returns and calculates the average by dividing the mean
             * by the moon objects size
             */
        }return mean/moons.size();
    }

    /**
     * calculates the highest value a specific attribute in
     * the moon object
     * @param moons
     * @param attribute
     * @return double
     */
    public static double findHighValue(ArrayList<Moon> moons,MoonAttributes attribute){
        double highestValue = 0.0;

        /**
         * for loop to check each object and if/else if loops
         * to check which attribute is given to
         * accurately calculate the highest valye
         */
        for(Moon m : moons) {
            if (attribute == MoonAttributes.DENSITY) {
                /**
                 * checks if current attribute value is highest value, if so
                 * highest value is now the new value and will continue
                 * until the end of the object
                 */
                if (m.getDensity() > highestValue) {
                    highestValue = m.getDensity();
                }
            } else if (attribute == MoonAttributes.DISTANCE) {
                if (m.getDistance() > highestValue) {
                    highestValue = m.getDistance();
                }
            } else if (attribute == MoonAttributes.RADIUS) {
                if (m.getRadius() > highestValue) {
                    highestValue = m.getRadius();
                }
            }
        }return highestValue;
    }

    /**
     * finds and returns the moon object with the value for a specific attribute
     * that is closest to the mean of the specific attribute
     * @param moons
     * @param attribute
     * @param meanValue
     * @return Moon
     */
    public static Moon findMeanMoon(ArrayList<Moon> moons, MoonAttributes attribute, double meanValue){
        double difference = 0.0;
        Moon closestMoon = null;

        for(Moon m : moons){
            /**
             * if/elseif statements to determine needed attribute
             */
            if(attribute == MoonAttributes.DISTANCE){
                /**
                 * checks if the moon mean, closestMoon, is empty or if
                 * the meanValue minus the distance is less than the current
                 * difference
                 * if it is the closestMoon variable is changed and the difference
                 * variable is changed
                 */
                if(closestMoon == null || Math.abs(meanValue - m.getDistance()) < difference){
                    closestMoon = m;
                    difference = Math.abs(meanValue - m.getDistance());
                }
            } else if(attribute == MoonAttributes.DENSITY){
                if(closestMoon == null || Math.abs(meanValue - m.getDensity()) < difference){
                    closestMoon = m;
                    difference = Math.abs(meanValue - m.getDensity());
                }
            } else if(attribute == MoonAttributes.RADIUS){
                if(closestMoon == null || Math.abs(meanValue - m.getRadius()) < difference){
                    closestMoon = m;
                    difference = Math.abs(meanValue - m.getRadius());
                }
            }
        }return closestMoon;
    }

    /**
     * finds the moon objects below the value given for a specific attribute
     * @param moons
     * @param value
     * @param attribute
     * @return ArrayList</Moon>
     */
    public static ArrayList<Moon> findLowestMoons(ArrayList<Moon> moons, double value, MoonAttributes attribute){
        /**
         * creating a new arrayList to help calculating
         */
        ArrayList<Moon> temp = new ArrayList<>();

        for(Moon m : moons){
            /**
             * checks for specific attribute and if the attribute at m is less than
             * the value given
             */
            if(attribute == MoonAttributes.DENSITY && m.getDensity() < value){
                temp.add(m);
            }else if(attribute == MoonAttributes.DISTANCE && m.getDistance() < value){
                temp.add(m);
            }else if(attribute == MoonAttributes.RADIUS && m.getRadius() < value){
                temp.add(m);
            }
            /**
             * returns the arraylist with objects that have a
             * value lower than the given value in a
             * specific attribute
             */
        }return temp;
    }


    /**
     * output method to print an array list of values
     * @param outputMessage
     * @param moons
     * @param out
     */
    public static void outputToFile(String outputMessage, ArrayList<Moon> moons, PrintWriter out){
        /**
         * prints the output message
         */
        out.print(outputMessage);
        for(Moon m : moons){
            out.print(m+ " ");
        }
        /**
         * prints on new line separated by a line
         */
        out.println();
        out.println();
    }

    /**
     * prints one moon object
     * @param outputMessage
     * @param moon
     * @param out
     */
    public static void outputToFile(String outputMessage, Moon moon, PrintWriter out){
        /**
         * prints the output message and
         * calls the toString method to
         * print the moon object
         */
        out.print(outputMessage);
        out.print(moon.toString());
        out.println();
        out.println();
    }

    /**
     * prints a double value
     * @param outputMessage
     * @param value
     * @param out
     */
    public static void outputToFile(String outputMessage, double value, PrintWriter out){
        /**
         * formats the print statement to two decimal values
         * and prints the output message and value
         */
        out.printf("%s%.2f", outputMessage,value);
        out.println();
        out.println();
    }


    public static void main(String[] args) throws FileNotFoundException{
        String inputFileName;
        String outputFileName;
        Scanner in = new Scanner(System.in);

        /**
         * if the command line is zero, the user is asked to
         * manually input the file names
         */
        if(args.length == 0){
            System.out.println("Enter input filename: ");
            inputFileName = in.next();
            System.out.println("Enter output filename: ");
            outputFileName = in.next();

            /**
             *if the input file is in the command line or the
             * command line is 1, the user is asked to
             * manually input the output file
             */
        }else if(args.length == 1){
            inputFileName = args[0];
            System.out.println("Enter output filename: ");
            outputFileName = in.next();
            /**
             * if both input and output files are in the command line
             * this is where the code will lead to
             */
        }else{
            inputFileName = args[0];
            outputFileName = args[1];
        }in.close();

        File inputFile = new File(inputFileName);
        ArrayList<String> lines = null;
        ArrayList<Moon> moons = null;

        try{
            lines = openFile(inputFile);
            moons = createObjects(lines);
            System.out.println("Input file is correct");
            /**
             * if given wrong file name exception is caught
             */
        }catch(FileNotFoundException e){
            System.out.println("Incorrect input filename.");
        }

        PrintWriter out = null;

        try{
            out = new PrintWriter(outputFileName);
            System.out.println("Output file correct");
            /**
             * prints the output file if the moons object is not empty
             */
            if(moons != null){
                outputToFile("The mean of radii is: ", findMean(moons,MoonAttributes.RADIUS),out);
                outputToFile("The highest density value is: ",findHighValue(moons,MoonAttributes.DENSITY),out);
                outputToFile("The moon closest to the mean is: ", findMeanMoon(moons, MoonAttributes.RADIUS, findMean(moons, MoonAttributes.RADIUS)), out);
                outputToFile("The moons below the mean value of radii are: ", findLowestMoons(moons, findMean(moons, MoonAttributes.RADIUS), MoonAttributes.RADIUS), out);
            }
        }catch(FileNotFoundException e){
            System.out.println("Incorrect output filename");
        }
        if(out != null){
            out.close();
        }
    }
}
