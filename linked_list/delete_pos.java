class Ll
{
  Node head;
  class Node
   {
     Node next;
     String data;
     Node(String data)
     {
         this.data=data;
         this.next=null;
     }
     
  }

 void add(String data)
 { Node Newnode=new Node(data); 
     if(head==null)
     {
         head=Newnode;
         return;
     }
     Node currval=head;
     while(currval.next!=null)
     {
      currval=currval.next;
     }
     currval.next=Newnode;
 }
     void delete(int pos)

    {
       if(head==null)
     {
        return;
     }
    if(pos==0)
    {
        head=head.next;
        return;
    }
     Node Currnode= head;
     Node prev=null;
     int count=0;
  while(count!=pos && Currnode.next!=null)
  {
      prev=Currnode;
     Currnode=Currnode.next;
     count++;

  }
 prev.next=Currnode.next;

 }

  void printlist()
   {
    Node t=head;
    while(t!=null)
    {
        System.out.println(t.data);
        t=t.next;
    }
    }
    public static void main(String args[])
    {
        Ll list=new Ll();
        list.add("This ");
        list.add("is");
        list.add("Patna");
        list.printlist();
        list.delete(1);
        list.printlist();
    }
 }
