 
package furniture;

/**
 *
 * @author Алия
 */


public class Table extends Kitchen {
    private int width;
    private int length;
    private int tableSet;
    private boolean transformable;

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
     * @return the tableSet
     */
    public int getTableSet() {
        return tableSet;
    }

    /**
     * @param tableSet the tableSet to set
     */
    public void setTableSet(int tableSet) {
        this.tableSet = tableSet;
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

    @Override
    public String toString() {
        return "Table{" + "width=" + width + 
                ", length=" + length + ", tableSet=" + 
                tableSet + ", transformable=" + transformable + '}';
    }
    
}
