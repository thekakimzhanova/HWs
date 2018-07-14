 
package furniture;

/**
 *
 * @author Алия
 */


public class LivingRoom extends Furniture{
    private String setName;

    /**
     * @return the setName
     */
    public String getSetName() {
        return setName;
    }

    /**
     * @param setName the setName to set
     */
    public void setSetName(String setName) {
        this.setName = setName;
    }

    @Override
    public String toString() {
        return "LivingRoom{" + "setName=" + setName + '}';
    }
    
}
