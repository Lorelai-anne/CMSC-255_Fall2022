/***********************************************************
* Lab 06 - Iteration Lab
************************************************************
* Project Description
* This code will create a triangle out of aterisks using
* a nested loop
* Lorelai Davis
* September 28, 2022
* CMSC 255 Section number 001
**********************************************************/
public class NestedLoopTriangle{
	public static void main(String[]args){
		int rows=0;
		int column=1;
		
		/*****************
		 * outer oop that handles the number of rows
		 ***************************/
		for(rows=1;rows<=10;rows++){
			
			/*********************
			 * loop for the number of spaces before
			 * the row of aterisks start
			 ***************************/
			for(column=1;column<=rows;column++){
				System.out.print("* ");
			}
		
		/*******************
		 * ends each row to the next line
		**************************/
		System.out.println();
		}
		System.out.println();
		rows=0;
		column=1;
		/*****************
		 * outer loop that handles the number of rows
		 ***************************/
		for(rows=1;rows<=10;rows++){

			/*********************
			 * loop for the number of spaces before
			 * the row of aterisks start
			 ***************************/
			for(column=10;column>rows;column--){
				System.out.print(" ");
			}
			/**********************
			 * handles number of columns and prints out an aterisk for each
			 * column in the row. dependent on the
			 * outerloop and the number of rows
			 * increments the value column by 1 after each loop
			 ***************************/
			for(column=1;column<=rows;column++){
				System.out.print("* ");
			}
			
			/*******************
			 * ends each row to the next line
			 **************************/
			System.out.println();
		}
	}
}