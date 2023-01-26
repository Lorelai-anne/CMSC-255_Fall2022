package Projects.Project6;
/*******************
 * Project 6 - Housing on Mars
 * this object is used to represent individual house objects
 * Lorelai Anne
 * 2022 November 15
 */

/**
 * import statements, decimal format is later used to format our decimals
 * in a print statement
 */
import java.text.DecimalFormat;

public class House {
    /**
     * declaring private instance variables and initializing
     * our enum classes as instance variables
     */
    private String owner;
    private int lotNumber;
    private double squareFootage;
    private Bedrooms bedrooms;
    private Baths baths;
    private Color color;

    /**
     * default and parameterized constructor, the default giving specific
     * values to out instance variables if needed
     * @param owner - string
     * @param lotNumber - integer
     * @param squareFootage - double
     * @param bedrooms - enum
     * @param baths - enum
     * @param colors - enum
     */
    public House(String owner,int lotNumber, double squareFootage,Bedrooms bedrooms,Baths baths,Color colors){
        this.owner = owner;
        this.lotNumber = lotNumber;
        this.squareFootage = squareFootage;
        this.bedrooms = bedrooms;
        this.baths = baths;
        this.color = colors;
    }
    public House(){
        owner = "";
        lotNumber = 1;
        squareFootage = 500.00;
        bedrooms = Bedrooms.ONE_BEDROOM;
        baths = Baths.ONE;
        color = Color.WHITE;
    }

    /**
     * setter and getter methods for instance variables above
     */
    public void setOwner(String owner){
        this.owner = owner;
    }
    public void setLotNumber(int lotNumber){
        this.lotNumber = lotNumber;
    }
    public void setSquareFootage(double squareFootage){
        this.squareFootage = squareFootage;
    }
    public void setBedrooms(Bedrooms bedrooms){
        this.bedrooms = bedrooms;
    }
    public void setBaths(Baths baths){
        this.baths = baths;
    }
    public void setColor(Color color){
        this.color = color;
    }

    public String getOwner(){
        return owner;
    }
    public int getLotNumber(){
        return lotNumber;
    }
    public double getSquareFootage(){
        return squareFootage;
    }
    public Bedrooms getBedrooms(){
        return bedrooms;
    }
    public Baths getBaths(){
        return baths;
    }
    public Color getColor(){
        return color;
    }

    /**
     * to string method for the object House
     * @return - returns a string variable
     */
    public String toString(){
        DecimalFormat df = new DecimalFormat("0.00");
        String house = ("\n\t"+owner+"\n\t"+lotNumber+"\n\t"+df.format(squareFootage)+"\n\t"+bedrooms+"\n\t"+baths+"\n\t"+color+"\n");
        return house;
    }
}
