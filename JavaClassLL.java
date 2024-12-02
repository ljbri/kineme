package dsafinalproj;
import java.util.Scanner;
import java.util.LinkedList;

public class JavaClassLL {
    LinkedList<Node> list = new LinkedList<>();

    public void insert(String itmno, String itmdesc, String qty, double uprice, double disc) {
        Node newNode = new Node(itmno, itmdesc, qty, uprice, disc);
        list.add(newNode);
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String itmno = sc.nextLine();
        System.out.print("Enter Item Description: ");
        String itmdesc = sc.nextLine();
        System.out.print("Enter Quantity: ");
        String qty = sc.nextLine();
        System.out.print("Enter Unit Price: ");
        double uprice = sc.nextDouble();
        System.out.print("Enter Discount: ");
        double disc = sc.nextDouble();
        sc.nextLine();

        insert(itmno, itmdesc, qty, uprice, disc);
        System.out.println("Item added successfully.");
    }

    public void delete(String itmno) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = null;
        for (Node node : list) {
            if (node.itmno.equals(itmno)) {
                temp = node;
                break;
            }
        }

        if (temp != null) {
            list.remove(temp);
            System.out.println("Item code " + itmno + " deleted.");
        } else {
            System.out.println("Item code " + itmno + " not found.");
        }
    }

    public void edit(String itmno) {
        Scanner sc = new Scanner(System.in);

        Node temp = null;
        for (Node node : list) {
            if (node.itmno.equals(itmno)) {
                temp = node;
                break;
            }
        }

        if (temp == null) {
            System.out.println("Item with code " + itmno + " not found.");
            return;
        }

        System.out.println("Now editing item " + itmno);
        System.out.print("Enter new Item Description (current: " + temp.itmdesc + "): ");
        temp.itmdesc = sc.nextLine();
        System.out.print("Enter new Quantity (current: " + temp.qty + "): ");
        temp.qty = sc.nextLine();
        System.out.print("Enter new Unit Price (current: ₱" + temp.uprice + "): ");
        temp.uprice = sc.nextDouble();
        System.out.print("Enter new Discount (current: " + temp.disc + "%): ");
        temp.disc = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Item " + itmno + " updated.");
    }

    public void display() {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        for (Node temp : list) {
            System.out.println("Item Code: " + temp.itmno);
            System.out.println("Description: " + temp.itmdesc);
            System.out.println("Quantity: " + temp.qty);
            System.out.println("Unit Price: ₱" + temp.uprice);
            System.out.println("Discount: " + temp.disc + "%");
            System.out.println("----------------------------");
        }
    }
}

