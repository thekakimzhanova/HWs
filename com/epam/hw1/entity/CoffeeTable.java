
package furniture;

/**
 *
 * @author Алия
 */


public class CoffeeTable extends LivingRoom{
    private boolean transformable;
    private int height;
    private int length;
    private int width;

    /**
     * @return the transformable
     */
    public boolean isTransformable() {
        return transformable;
    }

    /**
     * @param transformable the transformable to set
     */
    public void setTransformable(boolean transformable) {
        this.transformable = transformable;
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
        return "CoffeeTable{" + "transformable=" + transformable + 
                ", height=" + height + ", length=" + length + 
                ", width=" + width + '}';
    }
    
}
