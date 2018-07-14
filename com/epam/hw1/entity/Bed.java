
package furniture;

import java.util.ArrayList;

/**
 *
 * @author Алия
 */


public class Bed extends Bedroom {
    
    private int sizeOfBed; //90, 120, 160, 180
    private ArrayList<String> properties = new ArrayList<>(); //drawers, soft bedhead, on legs, hoist

    /**
     * @return the sizeOfBed
     */
    public int getSizeOfBed() {
        return sizeOfBed;
    }

    /**
     * @param sizeOfBed the sizeOfBed to set
     */
    public void setSizeOfBed(int sizeOfBed) {
        this.sizeOfBed = sizeOfBed;
    }

    /**
     * @return the properties
     */
    public ArrayList<String> getProperties() {
        return properties;
    }

    /**
     */
    public void setProperties(String property) {
        this.properties.add(property);
    }    

    @Override
    public String toString() {
        return "Bed{" + "sizeOfBed=" + sizeOfBed + ", properties=" + properties + '}';
    }
    
    
}
