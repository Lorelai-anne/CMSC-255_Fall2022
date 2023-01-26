/***********************************************************
* Lab 05 - String Comparisons
************************************************************
* Project Description
* This code asks the user to input three words and then compares them
* lexicographically and prints out the word that is in the middle
* Lorelai Davis
* September 21, 2022
* CMSC 255 Section number 001
**********************************************************/

import java.util.Scanner;

public class MiddleString {
 public static void main(String [] args) {
  Scanner scnr = new Scanner(System.in);
  
  System.out.println("Enter three strings:");
  String str1 = scnr.next();
  String str2 = scnr.next();
  String str3 = scnr.next();

  /*************************
   * checks if the first string is the first alphabetically
   * when compares to both str2 and str3
   * among the three and then checks whether str2 and str3
   * is the last
   ******************************/
  if(str1.compareTo(str2)<=0 && str1.compareTo(str3)<=0){
    if(str2.compareTo(str3)<=0){
        System.out.println(str2);
    }else{
        System.out.println(str3);
    }

    /************************
     * if str1 is not the first, checks if str2 is the first
     * alphabetically. Since previous code is not first if it has moved
     * to this, we only check if str2 is first alphabetically when compared
     * to str3
     ****************************/
  }else if (str2.compareTo(str3)<=0){
    if(str1.compareTo(str3)<=0){
        System.out.println(str1);
    }else{
        System.out.println(str3);
    }
  
    /***********************
     * if str1 or str2 is not first alphabetically, str3 is so it will move to this
     * which will then check between str2 and str1 to
     * see which is the middle string
     ****************************/
  }else{
    if (str1.compareTo(str2)<=0){
        System.out.println(str1);
    }else{
        System.out.print(str2);
    }
  }
 }
}