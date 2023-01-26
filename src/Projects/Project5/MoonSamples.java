/*******************
 * Project 5 - Moon Samples
 * this code uses a series of methods and arrays that help analyze soils found on Mars
 * Lorelai Anne
 * 2022 November 1
 */

package Projects.Project5;

import java.util.ArrayList;
public class MoonSamples {
    /**
     * main method that involves initializing and declaeing our main variables
     * as well as calling upon our upcoming methods and printing
     * them out
     * @param args - main method
     */
    public static void main(String[] args){
        String elements = "carbon-dioxide,magnesium,sodium,potassium,chloride,water";
        String samples = "8.3,4.5,6.7,2.3,12.5,4.5<>3.9,1.8,34.7,23.5,1.2,14.3<>6.7,7.4,1.5,18.4,7.2,23.7<>23.4,5.6,2.9,18.5,39.5,18.2<>15.4,5.3,27.4,9.8,3.8,27.4";
        int sampleNum = 1;
        String element = "water";

        String[] elementArray = getElements(elements);
        double[][] sampleArray = getSamples(samples);
        int[] lifeArray = searchForLife(sampleArray);
        System.out.print("The samples that contain life are: ");
        for(int life : lifeArray){
            System.out.print(life+" ");
        }
        System.out.println();
        System.out.println("The highest elements for sample "+sampleNum+" are "+searchHighestElements(sampleArray,elementArray,sampleNum));
        System.out.println("The sample with the highest value of the element "+element+" is "+searchHighestSample(sampleArray,elementArray,element));
    }

    /**
     * method that populated our single array with values
     * from our variable elements
     * @param inputElementString - String parameter
     * @return - returns our string array made by splitting words by the comma
     */
    public static String[] getElements(String inputElementString){
        return inputElementString.split(",");
    }

    /**
     * populates a two dimensional array from the parameter inputSamplesString
     * splits the variable by <> to fill the rows and
     * then by the comma to fill the columns
     * later uses parseDouble() to convert the string array into double values
     * @param inputSamplesString - parameter
     * @return - returns the double two-dimensional array
     */
    public static double[][] getSamples(String inputSamplesString){
       String[] rows = inputSamplesString.split("<>");
       String [][] matrix = new String [(rows.length)][];
       int r=0;
       for(String row : rows){
           matrix[r++] = row.split(",");
       }
       double[][] doubles = new double[matrix.length][];
       for(int i=0;i<matrix.length;i++){
           doubles[i] = new double[matrix[i].length];
           for(int j=0;j<matrix[i].length;j++){
               doubles[i][j] = Double.parseDouble(matrix[i][j]);
           }
       } return doubles;
    }

    /**
     * searches the two-dimensional array Samples for the
     * rows that contain "life" or equal out to 300
     * or more after completing the correct calculations.
     * The method will then determine the sample numbers
     */
    public static int[] searchForLife(double[][] samples){
        ArrayList<Integer> newList = new ArrayList<>();
        double element1,element2,element3,element4,element5,element6;
        int num = 1;

        for(double[] sample : samples){
            element1 = sample[0];
            element2 = sample[1];
            element3 = sample[2];
            element4 = sample[3];
            element5 = sample[4];
            element6 = sample[5];

            double formula = (8*element1)+(2*element2)+(element3)+(4*element4)+element5+(5*element6);

            if(formula >= 300){
                newList.add(num);
            }
            num++;
        }
        /**
         * used to change array size and delete any null values
         * by creating an array list
         */
        int[] lifeFoundin = new int[newList.size()];

        for(int k=0;k<newList.size();k++){
            lifeFoundin[k] = newList.get(k);
        }return lifeFoundin;
    }

    /**
     * searches the two-dimensional array for the highest values in each column
     * which will then be used to determine which two elements
     * contain the highest values
     * @param samples - two-dimensional array parameter, what we're searching
     * @param elements - what where going to use to determine which elements contain high values
     * @param sampleNum - row index plus one basically, samples[0][] would be sampleNum 1
     * @return - returns a string
     */
    public static String searchHighestElements (double[][] samples,String[] elements,int sampleNum){
        double largest = samples[sampleNum-1][0];
        double second = -1;
        String stringLargest = elements[0];
        String stringSecond = elements[0];
        /**
         * for determining which is the max value. If value is larger it becomes the
         * new max and the former max will become second and visa-versa
         */
        for(int i=0;i<samples[sampleNum].length;i++){
            if(samples[sampleNum-1][i]>largest){
                second = largest;
                largest = samples[sampleNum-1][i];
                stringSecond = stringLargest;
                stringLargest = elements[i];
            }
            else if (samples[sampleNum-1][i]>second && samples[sampleNum-1][i] != largest){
                second = samples[sampleNum-1][i];
                stringSecond = elements[i];
            }
        }
        /**
         * initializes and declares our return string with our
         * highest and lowest values
         */
        String finalString = (stringLargest + " and "+stringSecond);
        return finalString;
    }

    /**
     * searches a specific column for the highest element and returns the sample number
     * @param samples - two-dimensional array containing double values, which is what were going to be
     *                checking for the highest values
     * @param elements - a string array containing element names
     * @param element - a string containing the element we want searched
     * @return - returns a sample number integer
     */
    public static int searchHighestSample(double[][] samples,String[] elements,String element){
        int column = 1;
        /**
         * used to find the corresponding integer
         * column index that is the same as the string element
         * variable
         */
        for(int i=0;i<elements.length;i++){
            if(elements[i].equals(element)){
                column = i;
            }
        }
        int sampleNum = 0;
        double max = samples[0][column];
        for(int j=1;j<samples.length;j++){
            if(samples[j][column] > max){
                max =samples[j][column];
                sampleNum = j;
            }else {
                sampleNum = -2;
            }
            /**
             * returns the sample number with the highest value
             * adding one since the sample number is generally the row number index
             * since sample numbers start at one, they are one number after the index
             */
        }return sampleNum+1;
    }
}
