 
package furniture;

/**
 *
 * @author Алия
 */


public class KitchenFurniture extends Kitchen{
    private String kitchenType; //corner, straight, with island
    private int size;

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    } 
    
    /**
     * @param kitchenType the kitchenType to set
     */
    public void setKitchenType(String kitchenType) {
        this.kitchenType = kitchenType;
    }

    /**
     * @return the kitchenType
     */
    public String getKitchenType() {
        return kitchenType;
    }

    @Override
    public String toString() {
        return "KitchenFurniture{" + "kitchenType=" + kitchenType + ", size=" + size + '}';
    }
    
}
