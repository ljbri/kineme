package dsafinalproj;

import java.util.Scanner;
class LinkedList { // methods for singly linked list
    Node head;

    public void insert(String itmno, String itmdesc, String qty, double uprice, double disc) { // insert new item to the list
        Node newNode = new Node(itmno, itmdesc, qty, uprice, disc);
        	if (head == null) {
        		head = newNode;
        	} 
        	else {
        		Node temp = head;
        		while (temp.next != null) {
        			temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    public void input() { // user inputs new item
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
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.itmno.equals(itmno)) {
            head = head.next;
            System.out.println("Item code " + itmno + " deleted.");
            return;
        }

        Node temp = head;
        while (temp.next != null && !temp.next.itmno.equals(itmno)) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item code " + itmno + " not found.");
        } 
        else {
            temp.next = temp.next.next;
            System.out.println("Item " + itmno + " deleted.");
        }
    }
    
    public void edit(String itmno) { // edit an item
        Scanner sc = new Scanner(System.in);
        
        Node temp = head;
        while (temp != null && !temp.itmno.equals(itmno)) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Item code " + itmno + " not found.");
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
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println("Item Code: 	" + temp.itmno);
            System.out.println("Description: 	" + temp.itmdesc);
            System.out.println("Quantity: 	" + temp.qty);
            System.out.println("Unit Price: 	₱" + temp.uprice);
            System.out.println("Discount: 	" + temp.disc + "%");
            System.out.println("----------------------------");
            temp = temp.next;
        }
    }
}