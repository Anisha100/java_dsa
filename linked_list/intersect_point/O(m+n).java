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
     if(Current1==null)
                Current1=headA;
            if(Current2==null)
                Current2=headB;
            if(Current1==Current2)
                return Current1.data;
            Current1=Current1.next;
            Current2=Current2.next;
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
      
      
