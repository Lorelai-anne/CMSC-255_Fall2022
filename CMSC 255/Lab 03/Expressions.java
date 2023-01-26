
public class Expressions 
{
  public static void main(String[] args)
  {
    int a = 3;
    int b = 4;
    int c = 5;
    int d = 17;
    
    /**********************************************************
     * 3 and 4 are added with sum 7 first because parenthesis 
     * forces the addition to come first
     * 7 is divided by 5 with 1 the result of integer division
     * The value displayed is 1
     ***********************************************************/
    System.out.println("#1 " + ((a + b) / c));   
    
    /**********************************************************
     * Because division has higher precedence, 4 is divided by 5 
     * with 0 the result of integer division 3 is added to 0 with
     * sum 3
     * The value displayed is 3
     ***********************************************************/
    System.out.println("#2 " + (a + b / c));       
    
    /**********************************************************
     * this is a preincrement and will increase our value by 1
     * and use the new value
     * we increment 3 by 1 which is 4
     * the value displayed is 4
     ***********************************************************/
    System.out.println("#3 " + (++a)); 

    /**********************************************************
     * this is a predecriment so it will decreiment our value by 1
     * and use the new value
     * we decrease 3 by 1
     * the value displayed is 3
     ***********************************************************/      
    System.out.println("#4 " + (--a));

    /**********************************************************
     * this is a postincrement so we increment our value by 1
     * and keep the original value
     * so we would increase 3 by 1
     * the value displayed is 3
     ***********************************************************/
    System.out.println("#5 " + (a++));

    /**********************************************************
     * this is a postdecriment so we decrimate our value by 1
     * and keep the original value
     * so we decrease 3 by 1
     * the value displayed is 4
     ***********************************************************/       
    System.out.println("#6 " + (a--));

    /**********************************************************
     * 1 is added to 3
     * the value displayed is 4
     ***********************************************************/
    System.out.println("#7 " + (a + 1));

    /**********************************************************
     * first 17 is divided by 5
     * this is a remainder operation, so we find the remainder of
     * the division between 17 and 5
     * the value displayed is 2
     ***********************************************************/        
    System.out.println("#8 " + (d % c)); 

    /**********************************************************
     * 17 is divided by 5
     * 5 goes into 17 three times
     * the value displayed is 3
     ***********************************************************/      
    System.out.println("#9 " + (d / c));

    /**********************************************************
     * 17 is divided by 4
     * the remainder of 17 divided by 4 is 1
     * the value displayed is 1
     ***********************************************************/       
    System.out.println("#10 " + (d % b)); 

    /**********************************************************
     * 17 is divided by 4
     * 4 goes into 17 4 times
     * the value displayed is 4
     ***********************************************************/  
    System.out.println("#11 " + (d / b));

    /**********************************************************
     * division takes precedence over addition so 3 is divided by 17
     * with the result of 0 from integer division
     * we then go left to right and add 17 to 0, resulting in 17
     * we then add 4 to 17
     * the value displayed is 21
     ***********************************************************/       
    System.out.println("#12 " + (d + a / d + b)); 

    /**********************************************************
     * with anything in parenthesis taking precedence over anything
     * 17 plus 3 is calculated which comes out to 20
     * we then add 17 and 4 which comes to 21
     * with parenthesis out of they way be divide 20 by 21 which
     * gives us a 0
     * the value displayed is 0
     ***********************************************************/      
    System.out.println("#13 " + ((d + a) / (d + b)));

    /**********************************************************
     * this helps us find the square root
     * for this we find the square root of 4 which gives us a 2
     * the value displayed is a 2.0
     ***********************************************************/       
    System.out.println("#14 " + (Math.sqrt(b)));

    /**********************************************************
     * this helps us solve to the power problems
     * with 3 being before 4, we will find 3 to the 4th power
     * by mutliplying 3 by itself 4 times
     * the value displayed is 81.0
     ***********************************************************/       
    System.out.println("#15 " + (Math.pow(a, b))); 

    /**********************************************************
     * this code helps us find the absolute value of -3
     * the value displayed is 3
     ***********************************************************/      
    System.out.println("#16 " + (Math.abs(-a)));

    /**********************************************************
     * This code will return to us the larger of two numbers
     * with the numbers being given being 3 and 4
     * the valye displayed is 4
     ***********************************************************/
    System.out.println("#17 " + (Math.max(a, b)));    
  } 
} 
