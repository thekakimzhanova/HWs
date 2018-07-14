
package furniture;

/**
 *
 * @author Алия
 */


public class Chair extends Kitchen{
    private String chairSet;
    private boolean transformable;
    private boolean upholstery; //мягкая обивка

    /**
     * @return the chairSet
     */
    public String getChairSet() {
        return chairSet;
    }

    /**
     * @param chairSet the chairSet to set
     */
    public void setChairSet(String chairSet) {
        this.chairSet = chairSet;
    }

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
     * @return the upholstery
     */
    public boolean isUpholstery() {
        return upholstery;
    }

    @Override
    public String toString() {
        return "Chair{" + "chairSet=" + chairSet + 
                ", transformable=" + transformable + 
                ", upholstery=" + upholstery + '}';
    }
    
}
