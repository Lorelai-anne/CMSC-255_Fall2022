package Projects.Project7;

/*******************
 * Project 7 - Moon Study
 * this is a moon object that will be used in the
 * program MoonStudy
 * Lorelai Anne
 * 2022 December 3
 */

public class Moon {
    /**
     * instance variables name,radius,density,and distance
     */
    private String name;
    private double radius, density, distance;

    /**
     * default constructor
     */
    public Moon(){
        name = "";
        radius = 0.0;
        density = 0.0;
        distance = 0.0;
    }

    /**
     * parameterized constructor
     */
    public Moon(String name,double radius,double density,double distance){
        this.name = name;
        this.radius = radius;
        this.density = density;
        this.distance = distance;
    }

    /**
     * a series of getter and setter methods for our
     * instance variables
     */
    public String getName() {
        return name;
    }public double getRadius() {
        return radius;
    }public double getDensity() {
        return density;
    }public double getDistance() {
        return distance;

    }public void setName(String name) {
        this.name = name;
    }public void setRadius(double radius) {
        this.radius = radius;
    }public void setDensity(double density) {
        this.density = density;
    }public void setDistance(double distance) {
        this.distance = distance;
    }

    /**
     * A toString method that uses the String.format() method
     * to found the variables to two decimal points
     * @return String
     */
    public String toString(){
        return String.format("%s %.2f %.2f %.2f",name,radius,density,distance);
    }

}
