
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author tom
 */
public class JokeManager {
    private ArrayList<String> jokes = new ArrayList<>();
    
    
    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }
        //Get a random number between 0 and size of this.jokes (-1)
        Random random = new Random();
        int i;
        i = random.nextInt(this.jokes.size());
        
        return this.jokes.get(i);
    }
    
    public void printJokes() {
        for (String joke : this.jokes) {
            System.out.println(joke);
        }
    }
}
