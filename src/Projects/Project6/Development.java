package Projects.Project6;
/*******************
 * Project 6 - Housing on Mars
 * This object is used to represent the housing developments
 * that hold houses
 * Lorelai Anne
 * 2022 November 15
 */

import java.util.ArrayList;
public class Development {
    /**
     * declaring our instance variables we will use later, along with our
     * array list houses for our House object
     */
    private String name,location;
    private int yearEst,numLots;
    private ArrayList<House> houses;

    /**
     * parameterized constructor for our instance variables that also creates
     * or initializes the arrayList houses
     * @param name - String for landowner
     * @param location - String for location
     * @param yearEst - integer parameter
     * @param numLots - integer parameter for the number of lots
     */
    public Development(String name,String location,int yearEst,int numLots){
        this.name = name;
        this.location = location;
        this.yearEst = yearEst;
        this.numLots = numLots;
        houses = new ArrayList<>();
    }

    /**
     * default constructor for our instance variables that
     * gives them default values
     */
    public Development(){
        name = "";
        location = "";
        yearEst = 0;
        numLots = 0;
        houses = new ArrayList<>();
    }

    /**
     * setter and getter methods that update and
     * return values for our instance variables
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }
    public void setLocation(String location){
        this.location = location;
    }
    public void setYearEst(int yearEst){
        this.yearEst = yearEst;
    }
    public void setNumLots(int numLots){
        this.numLots = numLots;
    }
    public String getName(){
        return name;
    }
    public String getLocation(){
        return location;
    }
    public int getYearEst(){
        return yearEst;
    }
    public int getNumLots(){
        return numLots;
    }

    /**
     * method that adds objects to the arrayList houses
     * @param newHouse - house object parameter so we can add new objects
     */
    public void addHouse(House newHouse){
        houses.add(newHouse);
    }

    /**
     * returns the number of objects in our development houses
     * array list
     * @return - returns the arraylist's size
     */
    public int getNumHouses(){
        return houses.size();
    }

    /**
     * returns the objects in the arraylist
     * @return - returns the arraylist houses objects
     */
    public ArrayList<House> getHouses(){
        return this.houses;
    }

    /**
     * a toString method to print out the instance variables
     * as well as each individual object in the arraylist houses
     * @return - returns the string printer
     */
    public String toString(){
        String printer = "";
        printer = (name+"\n"+location+"\n"+yearEst+"\n"+numLots+"\nHouses:");
        printer += "\n";
        for(House home : houses){
            printer += (home.toString());
        }
        return printer;
    }
}
