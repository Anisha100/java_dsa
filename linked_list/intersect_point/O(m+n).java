class Main{
 static Node head1,head2;
 static class Node{
   int data;
   Node next;
   Node(int d)
   {
     data=d;
     next=null;
   }
 }
  static int getNode(Node head1,Node head2)
  {
    Node current1=head1;
    Node current2=head2;
    if(current1==null || current2==null)
      return -1;
    while(current1.data!=current2.data)
    {
      current1=current1.next;
      current2=current2.next;
      if(current1==current2)
        return current1.data;
    
    if(current1==null)
      current1=head1;
      if(current2==null)
        current2=head2;
  }
  return current1.data;
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
    System.out.println(getNode(head1,head2));
  }
}
      
      
