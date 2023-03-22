
import java.util.Scanner;


/**
 *
 * @author tom
 */
public class TextUI {
    private Scanner scan;
    private SimpleDictionary sd;
    
    
    public TextUI(Scanner scanner, SimpleDictionary sd) {
        this.scan = scanner;
        this.sd = sd;
    }
    
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scan.nextLine();
            
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
                
            } else if (command.equals("add")) { 
                System.out.print("Word: ");
                String word = scan.nextLine();
                System.out.print("Translation: ");
                String translation = scan.nextLine();
                
                this.sd.add(word, translation);
                
            } else if (command.equals("search")) {
                System.out.print("To be translated: ");
                String translate = scan.nextLine();
                
                String translation = sd.translate(translate);
                
                if (translation == null) {
                    System.out.println("Word " + translate + " was not found");
                } else {
                
                System.out.println("Translation: " + translation);
                }
                
            } else {
                System.out.println("Unknown command");
            }
            
        }
        
    }
}
