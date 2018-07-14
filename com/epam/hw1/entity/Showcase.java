
package furniture;

/**
 *
 * @author Алия
 */


public class Showcase extends LivingRoom{
    private int numOfDoors;
    private int height;
    private int length;
    private int width;   

    /**
     * @return the numOfDoors
     */
    public int getNumOfDoors() {
        return numOfDoors;
    }

    /**
     * @param numOfDoors the numOfDoors to set
     */
    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the length
     */
    public int getLength() {
        return length;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @return the width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width the width to set
     */
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Showcase{" + "numOfDoors=" + numOfDoors + 
                ", height=" + height + ", length=" + length + 
                ", width=" + width + '}';
    }

}
