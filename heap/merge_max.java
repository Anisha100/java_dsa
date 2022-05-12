public int[] mergeHeaps(int[] a , int[] b, int n, int m){
    PriorityQueue<Integer> pq =new PriorityQueue<>(Collections.reverseOrder());
    for(int i=0;i<a.length;i++{
       pq.add(a[i];)
    }
    for(int i=0;i<b.length;i++)
    {
        pq.add(b[i]);
    }
    int res=new int[n+m];
    int index=0;
while(!pq.isEmpty())
{
    res[index]=pq.remove();
    index++;
}
return res;
}
