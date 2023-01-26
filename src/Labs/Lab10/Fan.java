package Labs.Lab10;

public class Fan {

    /***********
     * declaring and initializing variables both
     * public and private
     */
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /***************
     * these are getter and setter methods that access and update our
     * private instance variables above this comment block.
     * set methods used to access the variables and set new values
     * and the get methods used to return these values and update them
     */
    public void setSpeed(int speed){
        this.speed = speed;
    }public void setOn (boolean on){
        this.on = on;
    }public void setRadius (double radius){
        this.radius = radius;
    }public void setColor (String color){
        this.color = color;
    }
    public int getSpeed (){
        return speed;
    /************
    * this specific method returns whether
     * the fan is on or off in terms of true or false
     * if the value is true the fan is on and visa-versa
    */
    }public boolean isOn(){
        return on;
    }public double getRadius(){
        return radius;
    }public String getColor(){
        return color;
    }

    /***********
     * this is a parameterized constructor that will
     * assign values to the instance variables
     * depending on the arguments given. If given no arguments
     * this will not be used instead the no arg
     * constructor will be used
     */
    public Fan(int speed,boolean on,double radius,String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    /**************
     * this is a no argument or no arg constructor that
     * will give default fan values
     */
    public Fan(){
        speed = SLOW;
        on = false;
        radius = 5;
        color = "blue";
    }

    /**************
     * this method returns the status of the fan in a string
     * containing the speed, color, and radius given.
     * if the instance variable on is false it will return that
     * the fan is off
     */
    public String toString(){
        String description;
        if (on == true){
            description = ("fan is " +speed+", "+color+", and size "+radius);
        }else{
            description = "fan is off";
        } return description;
    }
}
