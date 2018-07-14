 
package furniture;

/**
 *
 * @author Алия
 */


public abstract class Furniture {
        private String fullName;
        private String color;
        private int price;
        private String producedIn;
        private String producer;
        private int year;
        private String style;
        private String material;

    /**
     * @return the type
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param type the type to set
     */
    public void setFullName(String type) {
        this.fullName = type;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * @return the producedIn
     */
    public String getProducedIn() {
        return producedIn;
    }

    /**
     * @param producedIn the producedIn to set
     */
    public void setProducedIn(String producedIn) {
        this.producedIn = producedIn;
    }

    /**
     * @return the producer
     */
    public String getProducer() {
        return producer;
    }

    /**
     * @param producer the producer to set
     */
    public void setProducer(String producer) {
        this.producer = producer;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }

    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * @return the style
     */
    public String getStyle() {
        return style;
    }

    /**
     * @param style the style to set
     */
    public void setStyle(String style) {
        this.style = style;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Furniture{" + "fullName=" + fullName + ", color=" + color +
                ", price=" + price + ", producedIn=" + producedIn + 
                ", producer=" + producer + ", year=" + year + ", style=" + 
                style + ", material=" + material + '}';
    }


}
