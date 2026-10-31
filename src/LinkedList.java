import java.sql.SQLOutput;

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
    void addLast(int d){
        Node newNode = new Node(d);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp=temp.next;
        }
        temp.next = newNode;
    }
    void delFirst(){
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }
    void delLast(){
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        if(head.next == null)
        {
            head = null;
            return;
        }
        while(temp.next.next != null )
        {
            temp = temp.next;
        }
        temp.next = null;
    }
    void delMid(int key){
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }
        if(key == 1)
        {
            head.next = head;
            return;
        }
        Node temp = head;
        for(int i = 1;i < key - 1 && temp.next != null;i++)
        {
            temp = temp.next;
        }
        if(temp.next == null)
        {
            System.out.println("Key not found");
        }
        temp.next = temp.next.next;
    }

}