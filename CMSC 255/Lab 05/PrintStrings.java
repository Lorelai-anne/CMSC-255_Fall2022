/***********************************************************
* Lab 05 - String Comparisons
************************************************************
* Project Description
* This code asks the user to input two words and then compares the two
* and prints them out lexicographically
* Lorelai Davis
* September 21, 2022
* CMSC 255 Section number 001
**********************************************************/

import java.util.Scanner;
public class PrintStrings{
	public static void main(String[] args){
		
		/************************
		 * Imports a new scanner class, asks the user to input two words
		 * and initializes the input variables
		 * for later use
		 ****************************/
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter two words");
		String string1 = scnr.next();
		String string2 = scnr.next();

		
		/************************
		 * this checks if string1 is first alphabetically when compared
		 * to string2 and prints the strings alphabetically
		 ****************************/
		if (string1.compareTo(string2)<0){
			System.out.println(string1+" "+string2);
		}else{
			System.out.println(string2+" "+string1);
		}
	}
}