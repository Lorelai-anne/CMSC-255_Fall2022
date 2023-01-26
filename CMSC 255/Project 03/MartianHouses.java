/***********************************************************
* Project 3 - Living on Mars
************************************************************
* Project Description
* This program calculates the base cost of the house wanting
* to be built based on the length of the side of the house
* Lorelai Anne
* September 23, 2022
**********************************************************/
import java.util.Scanner;
public class MartianHouses{
	public static void main(String[]args){
		
		/***************************
		 * Creating the constant variable for the base price
		 * per square foot at $14.50
		 *******************************/
		final double BASE_COST = 14.50;
		Scanner input = new Scanner(System.in);
		
		/***************************
		 * declares the string variable option beforehand so it
		 * can be used for the while condition
		 ********************************/
		String option;

		/***************************
		 * starts the do while loop, first completing the body of the code
		 * and then checking the while statement
		 ********************************/
		do {
			
			/***************************
			 * asks the user to input the settler name and
			 * the specific length in feet for a side of
			 * the house
			 *******************************/

			System.out.println("Enter the settler's name: ");
			String name = input.nextLine();
			System.out.println("Enter the length of a side of the house: ");
			double s = input.nextDouble();

			/***************************
			 * uses the user input to calculate the area's of the floor,
			 * roof, and outerwall's
			 * which is then used to find the overall surface area
			 * and general cost of the entire house
			 ********************************/
			double areaFloor = (2*Math.pow(s,2))*(1+Math.sqrt(2));
			double areaRoof = areaFloor;
			double areaOuterWall = 8*12*s;
			double surfaceArea = areaFloor + areaOuterWall + areaRoof;
			double cost = surfaceArea * BASE_COST;

			/****************************
			 * prints out the settler name and the exact surface area and cost
			 * of the house in the correct format
			 *********************************/
			System.out.printf(name+ " has a house surface area of %,.2f and cost of $%,.2f",surfaceArea,cost);
			
			/****************************
			 * asks the user if they would like to enter another house
			 *********************************/
			System.out.printf("%nWould you like to enter another house? Enter no to exit.%n");
			input.nextLine();
			option=input.nextLine();

		/****************************
		 * checks if the condition is true, that being 
		 * if the user inputted yes. If so it will loop
		 * back to the beginning of the do statement
		 *******************************/
		} while (!"no".equals(option));
	}
}
