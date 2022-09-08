import java.util.Scanner;

public class Company {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int option;

        do {
            System.out.println("Output - 0");
            System.out.println("Add client enter - 1 ");
            option = scanner.nextInt();
        } while (option != 0 && option != 1);

        switch (option) {
            case (0) -> Company.End();
            case (1) -> ClientAdd.add();
        }

        do {
            System.out.println("Output - 0");
            System.out.println("Add client enter - 1 ");
            System.out.println("View costumers data - 2");
            System.out.println("Remove client - 3");
            Scanner scanner1 = new Scanner(System.in);
            option = scanner1.nextInt();

            switch (option) {
                case (0) -> Company.End();
                case (1) -> ClientAdd.add();
                case (2) -> ClientList.info();
                case (3) -> ClientRemove.Remove();
            }
        } while (option != 0);
    }

    public static void End() {
        System.out.println("End of program");
        System.exit(0);
    }
}