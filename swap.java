public class swap{
    Node head;
     class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void Swap(){
        if(head==null || head.next==null){
            return;
        }
         Node First=head;
         Node second = head.next;

         First.next=second.next;
         second.next=First;
         head=second;
        
    }
    public static void main(String[] args) {
        swap list= new swap();
    }
    


}