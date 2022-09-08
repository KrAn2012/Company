import java.util.Scanner;


public class ClientRemove {

    public static void Remove() {

        System.out.println("Enter the name of the client to remove: ");
        Scanner scanner = new Scanner(System.in);
        ClientList clientList = new ClientList();
        int indexPosition = scanner.nextInt();
        clientList.remove(--indexPosition);
    }


}
