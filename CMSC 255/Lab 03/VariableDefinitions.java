/***********************************************************
* Lab 03 - Variable Definitions and Expressions
************************************************************
* Project Description
* The prupose of the lab is to get used to variables and data types
* Lorelai Davis
* September 7, 2022
* CMSC 255 Section number 001
**********************************************************/

class VariableDefinitions {
	public static void main(String[] args){

		/*****************************
		 * initial declaration of the numPeople variable
		 **********************************/
			byte numPeople = 3;

		/*****************************
		 * initial declaration of the roomNumber variable
		 **********************************/
			short roomNumber = 207;

		/*****************************
		 * initial declaration of the longNumber variable
		 **********************************/
			Long longNumber = 990123456789L;

		/*****************************
		 * initial declaration of the normalNumber variable
		 **********************************/
			int normalNumber = 177609;

		System.out.println ("The numPeople variable has a value of "+numPeople);
		System.out.println ("The roomNumber variable has a value of "+roomNumber);
		System.out.println ("The longNumber variable has a value of "+longNumber);
		System.out.println ("The normalNumber variable has a value of "+normalNumber); 
		System.out.println ();

		/*****************************
		 * modified value of the numPeople variable
		 **********************************/
			numPeople = 7;

		/*****************************
		 * modified value of the roomNumber variable
		 **********************************/
			roomNumber = 347;

		/*****************************
		 * modified value of the longNumber variable
		 **********************************/
			longNumber = 8802987654321L;

		/*****************************
		 * modified value of the normalNumber variable
		 **********************************/
			normalNumber = 881926;

		System.out.println ("The numPeople variable now has a value of "+numPeople);
		System.out.println ("The roomNumber variable now has a value of "+roomNumber);
		System.out.println ("The longNumber variable now has a value of "+longNumber);
		System.out.println ("the normalNumber variable now has a value of "+normalNumber);
		System.out.println ();
		/*****************************
		 * initial declaeation of numPeople constant
		 **********************************/
			final double numberPeople = 156.735284632;

		/*****************************
		 * initial declaeation of roomNumber Constant
		 **********************************/
			final float numberRoom = 2.168134F;

		/*****************************
		 * initial declaeation of longNumber constant
		 **********************************/
			final int numberLong = 764;

		/*****************************
		 * initial declaeation of normalNumber constant
		 **********************************/
			final long numberNormal = 23_456_789_123L;

		System.out.println ("The numberPeople constant has a value of "+numberPeople);
		System.out.println ("The numberRoom constant has a value of "+numberRoom);
		System.out.println ("the numberLong constant has a value of "+numberLong);
		System.out.println ("the numberNormal constant has a value of "+numberNormal);

		/******************************
		 * numberNormal = 78_456_263_273L;
		 * cannot reassign a constant variable, you will get a 
		 * error saying how you can not assign a value to the final variable
		 * in this case to final variable numberNormal
		 ***********************************/
	}
}