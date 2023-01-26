package Labs.Lab13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Team {
    private String name;
    private int numGoals;
    private double numShots;

    public Team(){
        name = "";
        numGoals = 0;
        numShots = 0;
    }
    public Team(String name,int numGoals, double numShots){
        this.name = name;
        this.numGoals = numGoals;
        this.numShots = numShots;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumGoals(int numGoals) {
        this.numGoals = numGoals;
    }
    public void setNumShots(double numShots) {
        this.numShots = numShots;
    }
    public String getName(){
        return name;
    }
    public int getNumGoals(){
        return numGoals;
    }
    public double getNumShots(){
        return numShots;
    }

    public FileNotFoundException ex(){
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException{
        try{
            String inputFileName = "C:/Users/ladav/IdeaProjects/CMSC255/SoccerStats.txt";
            File inputFile = new File(inputFileName);
            Scanner in = new Scanner(inputFile);
            String outputFileName = "C:/Users/ladav/IdeaProjects/CMSC255/src/Labs/Lab13/SoccerSummary.txt";
            PrintWriter out = new PrintWriter(outputFileName);

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
