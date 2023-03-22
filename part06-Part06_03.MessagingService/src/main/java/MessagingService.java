
import java.util.ArrayList;


/**
 *
 * @author tom
 */
public class MessagingService {
    private ArrayList<Message> messages;
    private static final int MAX_MESSAGE_LENGHT = 280;
    
    //Constructor
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    
    public void add(Message message) {
        if (message.getContent().length() <= MAX_MESSAGE_LENGHT) {
            this.messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.messages;
    }
}
