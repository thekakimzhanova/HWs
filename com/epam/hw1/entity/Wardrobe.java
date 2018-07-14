
package furniture;

/**
 *
 * @author Алия
 */


public class Wardrobe extends Bedroom{
    private int length;
    private int width;
    private int height;
    private int doorNum; //1-2-3-4-5 дверный
    private boolean mirror;

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
     * @return the doorNum
     */
    public int getDoorNum() {
        return doorNum;
    }

    /**
     * @param doorNum the doorNum to set
     */
    public void setDoorNum(int doorNum) {
        this.doorNum = doorNum;
    }

    /**
     * @return the mirror
     */
    public boolean isMirror() {
        return mirror;
    }

    /**
     * @param mirror the mirror to set
     */
    public void setMirror(boolean mirror) {
        this.mirror = mirror;
    }

    @Override
    public String toString() {
        return "Wardrobe{" + "length=" + length + 
                ", width=" + width + ", height=" + height + 
                ", doorNum=" + doorNum + ", mirror=" + mirror + '}';
    }
    
}
