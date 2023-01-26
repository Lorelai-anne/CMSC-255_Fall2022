/***********************************************************
* Lab 06 - Iteration Lab
************************************************************
* Project Description
* This code computes and then prints the sum of all integers
* from 1 to the user's inputted number
* Lorelai Davis
* September 28, 2022
* CMSC 255 Section number 001
**********************************************************/
import java.util.Scanner;
public class CountLoop{
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		int sum = 0;
		int num = 0;
		System.out.println("Enter a positive integer: ");
		int user = input.nextInt();
		
		/************************
		 * calculates the sum of 1 up to the user inputted number
		 *******************************/
		while (num <= user){
			sum += num;
			num++;
		}
		System.out.println("the sum is "+sum);
		System.out.println();

		sum = 0;
		for(num=0;num<=user;num++){
			sum+=num;
		}
		System.out.println("the sum is "+sum);
		System.out.println();

		sum = 0;
		num = 0;
		do{
			sum+=num;
			num++;
		}while(num <= user);
		System.out.println("the sum is "+sum);
		System.out.println();
	}
}