/***********************************************************
* Lab 04 - Selection
************************************************************
* Project Description
* The prupose of the code is to take input of a single letter 
* and display the corresponding digit on a telephone
* Lorelai Davis
* September 14, 2022
* CMSC 255 Section number 001
**********************************************************/
import java.util.Scanner;
public class PhoneSelection{
	public static void main(String[]args){
		
		/****************************
		 * Initial declaration of the variable digit
		 *******************************/
		int digit = 0;
		
		/****************************
		 * Create new scanner input and variable
		 * to ask the user for a letter
		 * Scanner input = new Scanner(System.in);
		 * System.out.print out question for user
		 * char letter= scnr.next().charAt(0);
		 *******************************/
			Scanner scnr = new Scanner(System.in);
			System.out.println("Enter a single letter, and I will tell you what the corresponding digit is on the telephone");
			char letter = scnr.next().charAt(0);

		/****************************
		 * convert lowercase letters in the
		 * variable letter into uppercase letters
		 ********************************/
		letter = Character.toUpperCase (letter);
		
		/*****************************
		 * if/else statements that will assign a new value to the variable 
		 * digit depending on the letter inputted by the user and outputs
		 * the matching digit and letter as well as check if input is a letter
		 * if letter=a||b||c
		 * 		digit =2;
		 * else if d,e,f
		 * 		digit =3;
		 * g,h,i=4
		 * j,k,l = 5
		 * m,n,o = 6
		 * p,q,r,s =7
		 * y,u,v =8
		 * w,x,y,z =9
		 * System.out.println("the digit "+digit+"corresponds to the letter "+letter+" on the telephone");
		 ********************************/
		if (Character.isLetter(letter)){
			if (letter == 'A'||letter=='B'||letter=='C'){
				digit = 2;
			}else if (letter == 'D'||letter=='E'||letter=='F'){
				digit = 3;
			}else if (letter=='G'||letter=='H'||letter=='I'){
				digit = 4;
			}else if (letter=='J'||letter=='K'||letter=='L'){
				digit = 5;
			}else if (letter=='M'||letter=='N'||letter=='O'){
				digit = 6;
			}else if (letter=='P'||letter=='Q'||letter=='R'||letter=='S'){
				digit = 7;
			}else if (letter=='T'||letter=='U'||letter=='V'){
				digit = 8;
			}else if (letter=='W'||letter=='X'||letter=='Y'||letter=='Z'){
				digit = 9;
			}
			System.out.println("The digit "+digit+" corresponds to the letter "+letter+" on the telephone.");
		}
		/*****************************
		 * Prints out an error message if the user inputs
		 * a non-alphabetic character
		 * else(){
		 * 	System.out.println(letter+" has no matching digit");
		 * }
		 ********************************/
		else{
			System.out.println(letter+" has no matching digit");
		}
	}
}