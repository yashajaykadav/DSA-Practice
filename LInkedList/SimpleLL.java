
class Node{
    int data;
    Node next;
    Node(int data1 , Node next){
        this.data = data1;
        this.next = next;
    }
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
 class SimpleLL{

     public  Node insertAtHead(Node Head , int newData){
        return new Node(newData,Head); 
      }

      public  void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
      }

    public static void main(String[] args) {
        SimpleLL s = new SimpleLL();
            Node head = new Node(1);
            head.next = new Node(2);

            System.out.println("Original List");
            s.printList(head);

            head  = s.insertAtHead(head,3);

            System.out.println("After Inserting Node at Head");
            s.printList(head);


    }
}