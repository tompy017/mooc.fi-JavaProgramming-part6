
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class Stack {
    private ArrayList<String> stack;
    
    //Constructor
    public Stack() {
        this.stack = new ArrayList<>();
    }
    
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public void add(String value) {
        this.stack.add(value);
    }
    
    public ArrayList<String> values() {
        return this.stack;
    }
    
    public String take() {
        int index = this.stack.size() - 1;
        String lastValue = this.stack.get(index);
        this.stack.remove(index);
        return lastValue;
        /* a simpler way would be to return the remove method directly
            return this.stack.remove(this.stack.size() - 1);
        */
    }
}
