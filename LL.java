class LL{
    Node head;
    //size is created to see size of the list
    private int size;
    //this is the constructor which initializes size with 0
    LL(){
        this.size=0;
    }
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    //to add first
    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        
    }
    //to add in last
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode= head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //to print
    public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node currNode= head;
        while(currNode != null){
            System.out.print(currNode.data + " --> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        size--; // yahen pe likhenge verna eske nechew wale case skip ho jayenge 
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast = head;
        Node lastNode=head.next;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public int getsize(){
        return size;
    }
    public static void main(String[] args) {
        LL list=new LL();
        list.addFirst(2);
        list.addFirst(3);
        list.addLast(103);
        list.printList();
        list.deleteFirst();
        list.printList();
        list.deleteLast();
        list.printList();
        System.out.println(list.getsize());
    }
}