
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class Suitcase {
    private ArrayList<Item> items;
    private int maxWeight;
    
    //Constructor
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }
    
    
    public void addItem(Item item) {
        if (this.maxWeight - item.getWeight() >= 0) {
            this.maxWeight -= item.getWeight();
            this.items.add(item);
        }
    }
    
    
    public String toString() {
        int totalItems = items.size();
        
        int weight = 0;
        for (Item item : items){
            weight += item.getWeight();
        }
        
        if (totalItems == 0) {
            return "no items (0 kg)";
        }
        
        if (totalItems == 1) {
            return "1 item (" + weight + " kg)";
        }
        
        return totalItems + " items (" + weight + " kg)";
    }
    
    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : this.items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item heaviest = this.items.get(0);
        for (Item item: this.items) {
            if (heaviest.getWeight() < item.getWeight()){
                heaviest = item;
            }   
        }
        return heaviest;
    }
    
    public String listItems() {
        for (Item item : this.items) {
            System.out.println(item.getName());
        }
        return "";
    }
}
