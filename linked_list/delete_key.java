class Ll{
    Node head;
    class Node{
        
        String data;
        Node next;

        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
        void add(String data)
        {
            Node newNode=new Node(data);
            if(head==null){
                head=newNode;
            return;
            }
            Node currnode=head;
            while(currnode.next!=null)
            {
                currnode=currnode.next;
            }
            currnode.next=newNode;
        }

        
        void delete(String data)
        {
            
            if(head==null)
            return;
            Node curr =head;
            Node prev=null;
           
            if(curr.data==data )
            {
                head=curr.next;
            }
            while(curr.data!=data){
                prev=curr;
                curr=curr.next;
            }
            if(curr==null)
            return;
           prev.next=curr.next;
           
        }
        void printList()
        {
            Node t=head;
            while(t!=null){
            System.out.println(t.data);
            t=t.next;

        }
        }

     public static void main(String[] args)
    {
        Ll list=new ll();
        list.add("is");
        list.add("This");
        list.add("Patna");
        list.printList();
        list.delete("This");
        list.printList();

    }
}
