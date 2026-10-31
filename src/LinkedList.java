class Node{
    int data;
    Node next;
    Node(int d)
    {
        data = d;
        next = null;
    }
}
public class LinkedList{
    Node head = null;
    void addFirst(int d)
    {
          Node newnode = new Node(d);
          if(head == null)
          {
              head = newnode;
              return;
          }
          newnode.next = head;
          head = newnode;
    }
    void addMid(int d, int key){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.data != key && temp.next != null)
        {
            temp=temp.next;
        }
        if(temp.data == key){
            newNode.next = temp.next;
            temp.next = newNode;
        }
        else{
            System.out.println("Key not found");
        }
    }
}