/***********************************************************
* Lab 05 - String Comparisons
************************************************************
* Project Description
* This code compares two initilaized strings to check if they are the same
* and equal in their string values and print out if they are or not
* Lorelai Davis
* September 21, 2022
* CMSC 255 Section number 001
**********************************************************/

public class StringsEqual{
	public static void main(String[]args){
		
		/************************
		 * initializes three strings we will use later on
		 **************************/
		String str1 = "abcd";
		String str2 = "abcdefg";
		String str3 = str1 + "efg";

		/************************
		 * prints out the values of str2 and str3
		 ***************************/
		System.out.println("str2 = "+str2);
		System.out.println("str3 = "+str3);

		
		/*************************
		 * checks if str2 is the same value as str3
		 * which will then print out that they are the same.
		 * If not it will print out they are not the same
		 ****************************/
		if (str2 == str3){
			System.out.println("The Strings sare equal.");
		}else {
			System.out.println("The Strings str2 and str3 are not the same.");
		}
	}
}