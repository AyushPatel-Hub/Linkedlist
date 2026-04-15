public class RR {
    Node head;
    private int size;

    RR() {
        size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    // Helper to add data since java.util.LinkedList won't work here
    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public Node reverseListRecursion(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseListRecursion(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    // Corrected Iterative Reverse
    public void reverseList() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = null; 
        Node currNode = head;

        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode; // Reverse the link
            
            // Move pointers forward
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode; // Update head to the new front
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        RR list = new RR();
        list.addLast("1");
        list.addLast("5");
        list.addLast("7");

        System.out.println("Original List:");
        list.printList();

        list.reverseList();

        // System.out.println("Reversed List:");
        // list.printList();
        list.reverseListRecursion(null);
        list.printList();
    }
}