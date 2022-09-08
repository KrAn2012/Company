import java.util.*;

public class Options {
    static void options() {


        Scanner scanner = new Scanner(System.in);
        //ArrayList<Client> option;
        {


            //Client client = new Client(Client );

            ArrayList<Object> clients = new ArrayList<>();


            int option;
            do {
                System.out.println("Enter the name of the client: ");
                //   client.setCustomerName(scanner.next());

                System.out.println("Order number: ");
                //   client.setCustomerNumber(scanner.nextDouble());

                System.out.println("Quantity: ");
                //  client.setQuantity(scanner.nextDouble());

                System.out.println("Output - 0");
                System.out.println("Add client enter - 1 ");
                System.out.println("View costumers data - 2");

                //       clients.add(new Client(client.customerName, client.customerNumber, client.quantity));
                scanner.nextLine();
                option = scanner.nextInt();


            } while (option == 1);

            if (option == 0) {
                System.out.println("Exit of program");
                scanner.close();
            } else if (option == 2) {
                System.out.println("Quantity qustomers: " + clients.size());
                System.out.println("");
                System.out.println("List of customers:");

                for (int i = 0 ; i < clients.size() ; i++){
                    System.out.println(clients.get(i));
                }
            }
            scanner.close();


        }

    }
}