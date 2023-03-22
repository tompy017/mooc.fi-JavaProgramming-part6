
/**
 *
 * @author tom
 */
public class Item {
    
    private String name;
    private int weight;
    
    //Constructor
    public Item(String name, int kg) {
        this.name = name;
        this.weight = kg;
    }
    
    //Methods
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.name + " (" + this.weight + "kg)";
    }
    
    
    
}
