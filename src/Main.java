import javax.swing.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
//      GUI gui = new GUI();
        Scanner input = new Scanner(System.in);
        System.out.println("*******************************");
        System.out.println("*****       Welcome       *****");
        System.out.println("*****  Metro Rail Ticket  *****");
        System.out.println("*******************************");

        int i = 1;
        while(i!=0){
            System.out.println("\n1) Login\n0)Exit\n");
            System.out.print("Your option: ");
            i = input.nextInt();
            if(i==1){
                while(i==1) {
                    String User, Pass;
                    System.out.println("Enter Username: ");
                    User = input.next();
                    System.out.println("Enter Password: ");
                    Pass = input.next();
                    Login log = new Login(User, Pass);
                    log.login(User, Pass);
                }
            }
            else{
                System.out.println("\nInvalid Choice!\n Please try again.\n");
            }

        }
        i =1;
        while (i != 0) {
            System.out.println("\n**** Please select an option:");
            System.out.println("1) Buy Ticket\n2) See Destinations\n3) See Purchase History\n0) Exit");
            System.out.print("Your option: ");
            i = input.nextInt();
            System.out.print("\n");
            Options.actions(input, i);
        }

        input.close();
    }
}
