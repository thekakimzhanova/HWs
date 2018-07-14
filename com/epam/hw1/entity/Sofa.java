 
package furniture;

/**
 *
 * @author Алия
 */


public class Sofa extends CushionedFurniture{
    private int numOfSeats;//2,3,4,5   
    private String setName;

    /**
     * @return the numOfSeats
     */
    public int getNumOfSeats() {
        return numOfSeats;
    }

    /**
     * @param numOfSeats the numOfSeats to set
     */
    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }

    /**
     * @return the setName
     */
    public String getSetName() {
        return setName;
    }

    @Override
    public String toString() {
        return "Sofa{" + "numOfSeats=" + numOfSeats + 
                ", setName=" + setName + '}';
    }
    
    
}
