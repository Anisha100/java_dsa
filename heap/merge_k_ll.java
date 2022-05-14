import java.io.*;
import java.util.*;
class Node{
    int data;
    Node next;

    Node(int key)
    {
        data=key;
        next=null;
    }

}


    class GfG {
        public static void printList(Node node)
{
    while(node!=null)
    {
        System.out.print(node.data+" ");
         node=node.next;
    }
}
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0){
        int N=sc.nextInt();
        Node[]a=new Node[N];

        for(int i=0;i<N;i++)
        {
            int n=sc.nextInt();
            Node head=new Node(sc.nextInt());
            Node tail=head;
        
        for(int j=0;j<n-1;j++)
        {
            tail.next=new Node(sc.nextInt());
            tail=tail.next;
        }
        a[i]=head;
    }
  
     
     Solution g=new Solution();
     Node res=g.merge(a,N);
     if(res!=null)
      printList(res);
      System.out.println();
    }
}
}

class NodeComparator implements Comparator<Node>{

    public int compare(Node K1, Node K2)
    {
        if(K1.data>K1.data)
        return 1;
        else if(K2.data>k1.data)
        return -1;
        return 0;
    }
}

class Solution{

    static Node merge(int[]arr, int K)
    {
        PriorityQueue<Node> pq=new PriorityQueue<>(new NodeComparator());
        Node at[]=Node[k];
         Node head=Node(0);
         Node last=head;

         for(int i=0;i<K;i++)
         { if(arr[i]!=null)
             pq.add(arr[i]);
         }
    

    if(pq.isEmpty())
    {
       return null;
    }
    while(!pq.isEmpty())
    {
        Node curr=pq.poll();
        last.next=curr;
        last=last.next;
        if(curr.next!=null)
        pq.add(curr.next)
    }
return head.next;    }
}




















