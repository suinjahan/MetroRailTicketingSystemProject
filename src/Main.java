import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("*****       Welcome       *****");
        System.out.println("*****  Metro Rail Ticket  *****");
        int i = 1;
        while (i != 0) {
            System.out.println("\n**** Please select an option:");
            System.out.println("1) Buy Ticket\n, 2) See Destinations\n3) See Purchase History\n, 0) Exit");
            System.out.print("Your option: ");
            i = input.nextInt();
            System.out.print("\n");
            Options.actions(input, i);
        }
        input.close();
    }
}
