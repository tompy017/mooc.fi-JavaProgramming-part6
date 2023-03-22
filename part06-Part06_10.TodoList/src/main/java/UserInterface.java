
import java.util.Scanner;


/**
 *
 * @author tom
 */
public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")){
                break;
            }
            
            if (command.equals("add")) {
                System.out.print("To add: ");
                list.add(scanner.nextLine());
            }
            
            if (command.equals("list")) {
                this.list.print();
            }
            
            if (command.equals("remove")) {
                System.out.print("Which one is removed? ");
                int option = scanner.nextInt();
                
                list.remove(option);
            }
        }
    }
}
