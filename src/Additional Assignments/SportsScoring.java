package MidtermCorrections;

import java.util.Scanner;
public class SportsScoring {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a point value: ");
        double pointValue = input.nextDouble();
        String diveStatus;

        if (pointValue < 6.0){
            diveStatus = "Needs Improvement";
        }
        else if (pointValue>= 6.0 && pointValue<=7.99){
            diveStatus = "Good";
        }
        else if(pointValue>= 8.0 && pointValue<= 8.99){
            diveStatus = "Very Good";
        }
        else {
            diveStatus = "Excellent";
        }
        System.out.println("The point value is "+diveStatus);
    }
}
