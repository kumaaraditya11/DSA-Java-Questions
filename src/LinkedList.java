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
}