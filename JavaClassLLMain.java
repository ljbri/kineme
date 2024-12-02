package dsafinalproj;

import java.util.Scanner;

public class JavaClassLLMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JavaClassLL list = new JavaClassLL();

        list.insert("VCT01", "VCut Potato Chips BBQ", "65 g", 29.95, 0);
        list.insert("VCT02", "VCut Potato Chips Cheese", "65 g", 29.95, 0);
        list.insert("PTS01", "Piattos Potato Chips Cheese", "65 g", 24.79, 0);
        list.insert("PTS02", "Piattos Potato Chips BBQ", "65 g", 24.79, 0);

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

