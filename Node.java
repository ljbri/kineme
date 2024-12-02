package dsafinalproj;

class Node {
    String itmno, itmdesc, qty;          
    double uprice, disc;      
    Node next;
    Node prev;

    Node(String itmno, String itmdesc, String qty, double uprice, double disc) {
        this.itmno = itmno;
        this.itmdesc = itmdesc;
        this.qty = qty;
        this.uprice = uprice;
        this.disc = disc;
        this.next = null;
        this.prev = null;
    }
}
