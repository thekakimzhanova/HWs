
package furniture;

/**
 *
 * @author Алия
 */


public class ArmChair extends CushionedFurniture {
    private int numOfSeats;
    private String setname;

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
     * @return the setname
     */
    public String getSetname() {
        return setname;
    }

    /**
     * @param setname the setname to set
     */
    public void setSetname(String setname) {
        this.setname = setname;
    }

    @Override
    public String toString() {
        return "ArmChair{" + "numOfSeats=" + numOfSeats + ", setname=" + setname + '}';
    }
    
}
