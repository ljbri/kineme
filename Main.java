package dsafinalproj;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Select an option:");
            System.out.println("[1] Singly Linked List");
            System.out.println("[2] Doubly Linked List");
            System.out.println("[3] Linked List Class in Java");
            System.out.println("[0] Back to Main Menu");
            System.out.print("Please enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                	System.out.println("Now running Singly Linked Class.");
                    SinglyLinkedList.main(args);
                    break;

                case 2:
                	System.out.println("Now running Doubly Linked Class.");
                    DoublyLinkedList.main(args);
                    break;

                case 3:
                	System.out.println("Now running Linked List Class in Java.");
                    JavaClassLLMain.main(args);
                    break;

                case 0:
                    System.out.println("Returning to Main Menu...");
                    return;

                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }
    }
}

