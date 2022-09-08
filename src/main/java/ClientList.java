import java.util.ArrayList;

public class ClientList  {

    public static ArrayList<Client> clientList = new ArrayList<>();

    public static void add(String customerName , double customerNumber , double orderNumber){
        clientList.add(new Client(customerName,customerNumber,orderNumber));
    }
    public void remove(int i) {
        clientList.remove(i);
    }
    public static void info() {
        System.out.println(" ");
        int indexPosition = 1;
        {  for(Client info : clientList )
            System.out.println("No.: "+indexPosition++ + "    Client Name: " + info.customerName + "   Client Number: "
                    + info.customerNumber + "   Order Number: " + info.orderNumber);
        }
        System.out.println(" ");
    }


}



