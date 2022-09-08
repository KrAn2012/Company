public class ClientAdd {
    public static void add() {
        System.out.println("Enter the name of the client: ");
        String customerName = ValidationClientAdd.validationName();

        System.out.println("Order number: ");
        double customerNumber = ValidationClientAdd.validationCustomerNumber();

        System.out.println("Order number: ");
        double orderNumber = ValidationClientAdd.validationOrderNumber();


        ClientList.add(customerName, customerNumber, orderNumber);

    }
}