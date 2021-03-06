
/**
 * Class Room to provide info to calculate the room area.
 *
 * @author (Cherry Cui)
 * @version (2020-02-22)
 */
public class Room
{
    // instance variables
    private double lengthInFeet;
    private double widthInFeet;

    /**
     * No args constructor for objects of class Room
     */
    public Room()
    {
        // initialise instance variables to the default value
        lengthInFeet = 0.0;
        widthInFeet = 0.0;
    }
    
    /**
     * Parameterized constructor for objects of class Room
     */
    public Room(double inputLengthInFeet, double inputWidthInFeet)
    {
        setLengthInFeet(inputLengthInFeet);
        setWidthInFeet(inputWidthInFeet);
      
    }

    /**
     * Accessor getLengthInFeet
     * return lengthInFeet
     */
    public double getLengthInFeet(){
        return lengthInFeet;
    }
    
    /**
     * Accessor getWidththInFeet
     * return widthInFeet
     */
    public double getWidthInFeet(){
        return widthInFeet;
    }
    
    /**
     * Mutator setLengthInFeet
     * @param inputLengthInFeet A parameter to set value of length in feet
     */
    public void setLengthInFeet(double inputLengthInFeet){
        if(inputLengthInFeet > 0){
        lengthInFeet = inputLengthInFeet;
        }else {
        throw new IllegalArgumentException ("Length must be positive number");
        };
    }
    
    /**
     * Mutator setWidthInFeet
     * @param inputWidthInFeet A parameter to set value of width in feet
     */
    public void setWidthInFeet(double inputWidthInFeet){
        if(inputWidthInFeet > 0){
        widthInFeet = inputWidthInFeet;
        }else {
        throw new IllegalArgumentException ("Width must be positive number");
        };
    }
    /**
     * Method calculateArea
     * @return the room area in square feet
     */
    public double calculateArea()
    {
        double area = lengthInFeet * widthInFeet;
        return area;
    }
}
