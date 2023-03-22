
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class Package {
    private ArrayList<Gift> gifts;
//    private int totalWeight;
    
    //Constructor
    public Package(){
        this.gifts = new ArrayList<>();
 //       this.totalWeight = 0;
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
//        this.totalWeight += gift.getWeight();
    }
    
    /*
    public int totalWeight() {
        return totalWeight;
    }
    */
    
    public int totalWeight() {
        int weight = 0;
        for (Gift gift : gifts) {
            weight += gift.getWeight();
        }
        return weight;
    }
}
