
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class Room {
    private ArrayList<Person> people;
    
    public Room() {
        this.people = new ArrayList<>();
    }
    
    
    public void add(Person p) {
        this.people.add(p);
    }
    
    public boolean isEmpty() {
        return this.people.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return people;
    }
    
    public Person shortest() {
        if (people.isEmpty()) {
            return null;
        }
        
        Person shortest = this.people.get(0);
        
        for (Person p : this.people) {
            
            if (shortest.getHeight() > p.getHeight()) {
                shortest = p;
            }
        }
        return shortest;
    }
    
    
    public Person take() {
        Person shortest = this.shortest();
        this.people.remove(shortest);
        
        return shortest;
    }
}
