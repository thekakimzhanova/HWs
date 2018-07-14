
package furniture;

/**
 *
 * @author Алия
 */


public class Bedroom extends Furniture {
    private String bedroomType; //kids, teenager, adult
    private String setName;
    /**
     * @return the bedroomType
     */
    public String getBedroomType() {
        return bedroomType;
    }

    /**
     * @param bedroomType the bedroomType to set
     */
    public void setBedroomType(String bedroomType) {
        this.bedroomType = bedroomType;
    }

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
        return "Bedroom{" + "bedroomType=" + bedroomType + 
                ", setName=" + setName + '}';
    }
    
}
