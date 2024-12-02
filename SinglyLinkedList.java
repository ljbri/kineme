package dsafinalproj;

import java.util.Scanner;
public class SinglyLinkedList { // main class for SINGLY LINKED LIST

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        list.insert("PLV01", "Palmolive - Intensive Moisture", "350 ml", 129.95, 0);
        list.insert("PLV02", "Palmolive - Anti-Dandruff", "350 ml", 129.95, 0);
        list.insert("DVE01", "Dove - Hairfall Rescue Shampoo", "350 ml", 149.79, 10);
        list.insert("DVE02", "Dove - Straight & Silky Shampoo", "350 ml", 149.79, 10);
        list.insert("DVE08", "Dove - Color Care Conditioner", "350 ml", 139.79, 10);
        
        boolean running = true;

        while (running) {
            System.out.println("[1] Display All Items");
            System.out.println("[2] Add New Item");
            System.out.println("[3] Delete an Item");
            System.out.println("[4] Edit an Item");
            System.out.println("[5] Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    list.display();
                    break;
                case 2:
                    list.input();
                    break;
                case 3:
                    System.out.print("Enter Item Code to delete: ");
                    String deleteItem = sc.nextLine();
                    list.delete(deleteItem);
                    break;
                case 4:
                    System.out.print("Enter Item Code to edit: ");
                    String editItem = sc.nextLine();
                    list.edit(editItem);
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting...");
                    System.out.println("Now back to Linked List Menu.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

    }

    
}
