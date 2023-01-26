package Labs.Lab14;

import Projects.Project7.Moon;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *   DaysPerMonth
 *   VCU - Computer Science Department
 *   A program that prompts the user for a month and year (both as integers)
 *   then displays the number of days in that month.
 **/

public class DaysPerMonth {

    public static void main(String[] args){
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
        File outputFile = new File(outputFileName);

        try{
            processFile(inputFile,outputFile);
        }catch(FileNotFoundException e){
            System.out.println("Bad File Name");
        }
    }


    public static void processFile(File inputFile, File outputFile) throws FileNotFoundException, NumberFormatException {
        try{
            Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFile);

            while(in.hasNextLine()){
                String nextLine = in.nextLine();
                String[] nextLineData = nextLine.split(",");

                int month = Integer.parseInt(nextLineData[0]);
                int year = Integer.parseInt(nextLineData[1]);

                if(month > 12 && month < 1){
                    out.println("Month must be between 1 and 12");
                    if(year < 0){
                        out.println("Year cannot be negative");
                        try{
                            getDays(month,year);
                        }catch(NumberFormatException e){
                            out.println("Not an Integer");
                        }
                    }
                }else{
                    out.println("There are "+getDays(month,year)+" days in this month.");
                }
            }
            out.close();
        }catch (FileNotFoundException ignored){
        }
    }

    /**
     * method to determine the days for the given month and year
     **/
    private static int getDays(int mon, int yr) {
        int numDays = 0;

        switch(mon) {
            case 2: // February
                numDays = 28;
                if (yr % 4 == 0) {
                    numDays = 29;
                    if (yr % 100 == 0 && yr % 400 != 0) {
                        numDays = 28;
                    }
                }
                break;

            case 4:   //April
            case 6:   // June
            case 9:   // September
            case 11:  // November
                numDays = 30;
                break;

            default: numDays = 31;  // all the rest
        }
        return numDays;
    }

}
