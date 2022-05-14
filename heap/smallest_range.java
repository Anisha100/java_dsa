static int[] findSmallestRange(int[][] arr,int n,int k)
{
    //add your code here2
    int[] ans= new int[2];
    int max=Integer.MIN_VALUE;
    ans[0]=arr[0][0];
    
    PriorityQueue<pair> pq = new PriorityQueue<>();
    for(int i=0;i<k;i++){
        ans[0]=Math.min(ans[0],arr[i][0]);
        max=Math.max(max,arr[i][0]);
        pair p = new pair(i,0,arr[i][0]);
        pq.add(p);
    }
    int d=max-ans[0];
    ans[1]=max;
    while(!pq.isEmpty()){
        pair r= pq.poll();
        if(d>max-r.val){
               ans[0]=r.val;
               ans[1]=max;
               d=max-r.val;
        }
        r.di++;
        if(r.di<n){
            r.val=arr[r.li][r.di];
            max=Math.max(max,r.val);
            pq.add(r);
        }
        else
           break;
    }
    return ans;
}
