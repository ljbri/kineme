package dsafinalproj;

import java.util.Scanner;

public class DoublyLinkedList {  // main class for doubly linked list

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLinkedList list = new DLinkedList();

        list.insert("CHK01", "Chicken Wings - Fresh", "1 kg", 199.95, 10);
        list.insert("CHK02", "Chicken Thighs - Fresh", "1 kg", 209.95, 10);
        list.insert("BEF01", "Beef - Ground", "1 kg", 229.79, 5);
        list.insert("EGG01", "Chicken Eggs - Dozen", "1 tray", 192.49, 0);
        list.insert("EGG02", "Quail Eggs - Dozen", "1 tray", 94.29, 10);

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

