/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

class Main{
  static Node head1, head2;
  static class Node{
    Node next;
    int data;
    Node(int d)
    {
       data=d;
      next=null;
    }
  }
  static int getNode()// get the merged node
  {
   int c1=countNode(head1);
    int c2=countNode(head2);
   
    if(c1>c2){
      int d=c1-c2;
      return getNodeinter(head1,head2,d);
    }
    else{
     int d=c2-c1;
     return getNodeinter(head2,head1,d);
      }
     
  }
  static int countNode(Node node)
  {
      int c=0;
    Node current=node;
    while(current!=null)
    {
      current=current.next;
      c++;
      }
    return c;
  }
   
  static int getNodeinter(Node current1,Node current2,int d)
  {
    for(int i=0;i<d;i++)
    { 
        if(current1==null)
        
         return -1;
      
      current1=current1.next;
    }
    while(current1!=null && current2!=null)
      {
        if(current1.data==current2.data)
          return current1.data;
        current1=current1.next;
        current2=current2.next;
    }
    return -1;
  }
  public static void main(String args[])
  {
    Main ll=new Main();
    ll.head1=new Node(3);
    ll.head1.next=new Node(6);
    ll.head1.next.next=new Node(9);
    ll.head1.next.next.next=new Node(15);
    ll.head1.next.next.next.next=new Node(30);
    ll.head2=new Node(10);
    ll.head2.next=new Node(15);
    ll.head2.next.next=new Node(30);
    System.out.println(getNode());
  }
}
