 package furniture;

/**
 *
 * @author Алия
 */


public class Commode extends Bedroom {
    private int height;
    private int width;

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
        return "Commode{" + "height=" + height + ", width=" + width + '}';
    }
    
    
}
