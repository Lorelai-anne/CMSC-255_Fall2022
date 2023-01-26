package Labs.Lab13;

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args){
        try{
            String inputFileName = args[0];
            File inputFile = new File(inputFileName);
            Scanner in = new Scanner(inputFile);
            String outputFileName = args[1];
            File outputFile = new File(outputFileName);
            PrintWriter out = new PrintWriter(outputFileName);
            processFile(inputFile,outputFile);

        }catch(FileNotFoundException ignored){
        }
    }
    public static void processFile(File inputFile, File outputFile) throws FileNotFoundException{
        try{
            Scanner in = new Scanner(inputFile);
            PrintWriter out = new PrintWriter(outputFile);

            double maxGoals = 0.0;
            String maxGoalsTeam = "";
            double minGoals = 1000;
            String minGoalsTeam = "";
            double totalNumShots = 0.0;
            double averageShots;
            int numTeams = 0;

            while(in.hasNextLine()){
                String nextLine = in.nextLine();
                String[] nextLineData = nextLine.split(",");

                String curTeam = nextLineData[0];
                double curNumGoals = Double.parseDouble(nextLineData[1]);
                totalNumShots += Double.parseDouble(nextLineData[2]);
                numTeams++;

                if(curNumGoals>maxGoals){
                    maxGoals = curNumGoals;
                    maxGoalsTeam = curTeam;
                }else if(curNumGoals<minGoals){
                    minGoals = curNumGoals;
                    minGoalsTeam = curTeam;
                }
            }
            averageShots = totalNumShots/numTeams;

            out.printf(""+
                    "Maximum goals Scored: %s %.0f\n"+
                    "Minimum goals Scored: %s %.0f\n"+
                    "Average shots per game: %.3f\n",maxGoalsTeam,maxGoals,minGoalsTeam,minGoals,averageShots);
            out.close();
        }catch(FileNotFoundException ignored){
        }
    }
}
