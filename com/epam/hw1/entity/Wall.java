
package furniture;

/**
 *
 * @author Алия
 * 
 */

//стенка в гостинной
public class Wall extends LivingRoom {
    private boolean separateModules;
    private int height;
    private int length;
    private int width;

    /**
     * @return the separateModules
     */
    public boolean isSeparateModules() {
        return separateModules;
    }

    /**
     * @param separateModules the separateModules to set
     */
    public void setSeparateModules(boolean separateModules) {
        this.separateModules = separateModules;
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
        return "Wall{" + "separateModules=" + separateModules + 
                ", height=" + height + ", length=" + length + 
                ", width=" + width + '}';
    }
    
}
