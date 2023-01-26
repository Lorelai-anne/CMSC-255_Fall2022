/***********************************************************
* Project 2 - Money on Mars
************************************************************
* Project Description
* This code helps us understand money denominations
* on mars in relation to Earth's money
* Lorelai Davis
* September 15, 2022
* CMSC 255 Section number 001
**********************************************************/
import java.util.Scanner;
public class MartianMoney{
	public static void main(String[]args){
		

		/*********************
		 * inputs a new scanner input to ask user whether they
		 * want a random number or to input a number on their own
		 *************************/
		Scanner input = new Scanner(System.in);
		System.out.println("Would you like to randomly enter a dollar amount (1) or enter it yourself (2)?");
		
		/********************
		 * creates a variable for our user created input
		 *************************/
		int answer = input.nextInt();

		/********************
		 * an if statment that outputs a random number if
		 * the user inputs the number 1
		 *************************/
		if (answer == 1){

			/********************
			 * generates a random number between 80 and
			 * 10 million
			 **************************/
			int dollarInput = (int)(Math.random()*10_000_000)+80;
			System.out.println(dollarInput);

		/********************
		 * Calculates the amount of tintinas, suttons, knorrs,
		 * and wernickes in the random dollar number 
		 * given by the code
		 *************************/
			int tintinaAmount = dollarInput / 80;
		
		/********************
		 * Calculates the amount of money left after previous equation
		 * to calculate the next type of money. It is divided
		 * by the previous amount but with remainder divison
		 ************************/
			int dollarRemainder = dollarInput % 80;
		
			int suttonAmount = dollarRemainder / 16;
			dollarRemainder = dollarRemainder % 16;

			int knorrAmount = dollarRemainder / 8;
			dollarRemainder = dollarRemainder % 8;

		/*********************
		 * the amount of dollars left is equal to the amount of
		 * wernicke
		 ************************/
			int wernickeAmount = dollarRemainder;

		/***********************
		 * prints out statment variable values if the variable
		 * does not equal 0
		 ******************************/
			System.out.print (dollarInput+ " is "+tintinaAmount+" tintina ");
			if (suttonAmount != 0){
				System.out.print (suttonAmount+" sutton ");
			}if (knorrAmount != 0){
				System.out.print (knorrAmount+" knorr ");
			}if (wernickeAmount != 0){
				System.out.print (wernickeAmount+" wernicke");
			}
		
			
		/********************
		 * an else if statement that asks the user to input a random number
		 * between 80 and 10 million if the user inputs 2
		*************************/
		}else if (answer == 2){
			System.out.println("Enter a dollar amount between $80 and $10,000,000.");
			int dollarInput = input.nextInt();

			/**********************
			 * if/else statement that checks if the number inputted
			 * is correct and between 80 and 10 million, if it 
			 * is not it will print Incorrect Input
			**************************/
			if (dollarInput < 80){
				System.out.println ("Incorrect input");
			}else if (dollarInput > 10_000_000){
				System.out.println("Incorrect input");
			}else{
				
				/**********************
				 * next lines of code calculate the amount of each
			 	* type of martian money based on the amount of money
			 	* inputted by the user that is between 80 and
			 	* 10 million
				 ***************************/
				int tintinaAmount = dollarInput / 80;
				int dollarRemainder = dollarInput % 80;
		
				int suttonAmount = dollarRemainder / 16;
				dollarRemainder = dollarRemainder % 16;

				int knorrAmount = dollarRemainder / 8;
				dollarRemainder = dollarRemainder % 8;

				int wernickeAmount = dollarRemainder;

				/***********************
		 		* prints out statment variable amounts if the variable
		 		* does not equal 0
		 		******************************/
				System.out.print (dollarInput+ " is "+tintinaAmount+" tintina ");
				if (suttonAmount != 0){
					System.out.print (suttonAmount+" sutton ");
				}if (knorrAmount != 0){
					System.out.print (knorrAmount+" knorr ");
				}if (wernickeAmount != 0){
					System.out.print (wernickeAmount+" wernicke");
				}
					}
		
		/*************************
		 * else statement that prints Incorrect Input
		 * if the user inputs any number other than 2 or 1
		 ****************************/
		}else if (answer != 1 || answer != 2){
			System.out.println("Incorrect input");
		}
	}
}