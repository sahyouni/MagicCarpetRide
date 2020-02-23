
/**
 * 
 * we need to brainstorm about this. Why is this class called CarpetCalculator? It seems to just calculate areas. Nothing specific to carpets I feel.
 * 
 * Class CarpetCalculator to provide info to calculate carpet cost
 *
 * @author (cherry cui)
 * @version (2020-02-22)
 */
public class CarpetCalculator {
    // instance variables
    private double pricePerSquareFoot;
    private Room room;

    /**
     * Parameterized Constructor for objects of class CarpetCalculator
     * 
     * Rami: Do we really want to input a "Room" here or is it just a "rectangle"?
     */
    public CarpetCalculator(double inputPricePerSquareFoot, Room inputRoom) {
        setPricePerSquareFoot(inputPricePerSquareFoot);
        setRoom(inputRoom);
    }

    /**
     * Accessor getPricePerSquareFoot
     * 
     * @return pricePerSquareFoot
     */
    public double getPricePerSquareFoot() {
        return pricePerSquareFoot;
    }

    /**
     * Accessor getRoom
     * 
     * @return room
     */
    public Room getRoom() {
        return room;
    }

    /**
     * Mutator setPricePerSquareFoot
     * 
     * @param inputPricePerSquareFoot A parameter to set value of price per square
     *                                foot
     */

    public void setPricePerSquareFoot(double inputPricePerSquareFoot) {

        if (inputPricePerSquareFoot <= 0) {
            throw new IllegalArgumentException();
        }

        pricePerSquareFoot = inputPricePerSquareFoot;

        // dont play these games of accepting wrong input
        /*
         * if (inputPricePerSquareFoot > 0) { pricePerSquareFoot =
         * inputPricePerSquareFoot; } else { pricePerSquareFoot = 0.0; }
         */
    }

    /**
     * Mutator setRoom
     * 
     * @param inputRoom A parameter to set value of room
     */

    public void setRoom(Room inputRoom) {
        room = inputRoom;
    }

    /**
     * Method calculateTotalCost
     * 
     * @return the total cost of the carpet for that room
     */
    public double calculateTotalCost() {
        double totalCost = pricePerSquareFoot * room.calculateArea();
        return totalCost;
    }

    /**
     * Method displayDetails
     */
    public void displayDetails() {
        System.out.println("Length of the room in ft: " + room.getLengthInFeet());
        System.out.println("Width of the room in ft: " + room.getWidthInFeet());
        System.out.println("Area of the room in sqft: " + room.calculateArea());
        System.out.println("Price per square foot: " + "$" + pricePerSquareFoot);
        System.out.println("Total cost of the carpet: " + "$" + calculateTotalCost());
    }
}
