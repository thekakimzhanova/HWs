
package furniture;

/**
 *
 * @author Алия
 */


public class Main {
    
    public static void main(String[] args) {
       KitchenFurniture unit1 = new KitchenFurniture();
       unit1.setKitchenType("corner");
       unit1.setSize(2500); //in mm
       unit1.setColor("ivory");
       unit1.setFullName("Cornered Kitchen Furniture Ivory");
       
       ArmChair armchair = new ArmChair();
       armchair.setNumOfSeats(1);
       armchair.setSetname("Jakonda");
       
       Sofa sofa = new Sofa();
       sofa.setNumOfSeats(3);
       sofa.setLandingDepth(600); //in mm
       sofa.setSetName("Jakonda");
       
       Bed bed = new Bed();
       bed.setSizeOfBed(2);
       bed.setProperties("soft bedhead");
       bed.setProperties("on legs");
       
       System.out.println(unit1);
       System.out.println(armchair);
       System.out.println(sofa);
       System.out.println(bed);
    }
}
