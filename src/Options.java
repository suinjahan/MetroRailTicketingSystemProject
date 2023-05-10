import java.util.Scanner;

public class Options {
    static void buy(Scanner input) {
        System.out.print("Select your destination: \n");
        for(int i = 0 ; i <5 ;i++){
            System.out.println(i+1 + ") " + Tickets.destinations[i]);
        }

        int d = input.nextInt();
        d--;
        if (d > Tickets.destinations.length) {
            System.out.println("Invalid destination! Try again!");
            buy(input);
            return;
        }
        System.out.print("Enter ticket amount: ");
        int t = input.nextInt();
        while(t >4){
            System.out.println("Sorry! You can not purchase more than 4 tickets at a time\n");
            System.out.print("Enter ticket amount: ");
            t = input.nextInt();
        }
        if (t > Tickets.availableTickets[d]) {
            System.out.println("Sorry! That much ticket is not available!");
            return;
        }
        int tp = Tickets.ticketPrices[d] * t;
        System.out.println("Total Price: " + tp + " taka");
        System.out.println("Do you want to buy?");
        System.out.println("1) Yes  2) No");
        int confirmation = input.nextInt();

    }

    static void actions(Scanner input, int i) {

    }
}
