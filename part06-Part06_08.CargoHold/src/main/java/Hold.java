
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class Hold {
    private ArrayList<Suitcase> onHold;
    private int maxWeight;
    
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.onHold = new ArrayList<>();
    }
    
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.maxWeight - suitcase.totalWeight() >= 0) {
            onHold.add(suitcase);
            this.maxWeight -= suitcase.totalWeight();
        }
    }
    
    @Override
    public String toString() {
        int suitcasesQty = this.onHold.size();
        int totalWeight = 0;
        for (Suitcase suitcase : this.onHold) {
            totalWeight += suitcase.totalWeight();
        }
        return suitcasesQty + " suitcases (" + totalWeight + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitcase : this.onHold) {
            suitcase.printItems();
        }
    }
}
