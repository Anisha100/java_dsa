import java.util.*;
public class Main
{
static Node head;
static class Node{
    int data;
    Node next;
    public Node(int d)
    {
        data=d;
        next=null;
    }
}
    public boolean isnull(){
     return head==null;
    }
     public void push(int data)
     {
         Node newNode=new Node(data);
         if(isnull())
         {
             head=newNode;
             return;
         }
             newNode.next=head;
             head=newNode;
         
     }
     public int pop()
     {
         if(isnull())
         return -1;
         int popped=head.data;
         head=head.next;
         return popped;
        
         
     }
     public int peek()
     {
          if(isnull())
         return -1;
         return head.data;
     }
     public static void main(String[] args)
    {
 
        Main sll = new Main();
 
        sll.push(10);
        sll.push(20);
        sll.push(30);
 
        System.out.println(sll.pop()
                           + " popped from stack");
 
        System.out.println("Top element is " + sll.peek());
    }
}
        
