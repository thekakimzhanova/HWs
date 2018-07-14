
package furniture;

/**
 *
 * @author Алия
 */


public class CushionedFurniture extends LivingRoom{
    private int landingDepth;
    private int backrestHeight;
    private int length;
    private int height;
    /**
     * @return the landingDepth
     */
    public int getLandingDepth() {
        return landingDepth;
    }

    /**
     * @param landingDepth the landingDepth to set
     */
    public void setLandingDepth(int landingDepth) {
        this.landingDepth = landingDepth;
    }

    /**
     * @return the backrestHeight
     */
    public int getBackrestHeight() {
        return backrestHeight;
    }

    /**
     * @param backrestHeight the backrestHeight to set
     */
    public void setBackrestHeight(int backrestHeight) {
        this.backrestHeight = backrestHeight;
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

    @Override
    public String toString() {
        return "CushionedFurniture{" + "landingDepth=" + 
                landingDepth + ", backrestHeight=" + backrestHeight + 
                ", length=" + length + ", height=" + height + '}';
    }
    
}
