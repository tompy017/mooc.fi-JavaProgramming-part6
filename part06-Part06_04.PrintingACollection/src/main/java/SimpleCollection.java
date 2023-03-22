
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String msg = "";
        if (this.elements.isEmpty()) {
            msg = "The collection " + this.name + " is empty.";
        } else if (this.elements.size() == 1) {
            msg = "The collection " + this.name + " has 1 element:\n"
                    + this.elements.get(0) ;
        } else {
            msg = "The collection " + this.name + " has "
                    + this.elements.size() + " elements:\n";
            for (String element : this.elements) {
                msg += element + "\n";
            }
        }
        return msg;
    }
}
