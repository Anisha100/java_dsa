import java.util.*;
import java.io.*;
public class DSA
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int range[];
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int arr[] =new int[k][n];
            for(int i=0;i<k;i++)
            {
                for(int j=0;j<n;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
                range=new Solution().findSmallestRange(arr,n,k);
                System.out.println(range[0]+" "+range[1]);
            }

        }

    }



    
}
class Solution{
    static int[] findSmalletRange(int[][] arr, int n, int k)
    {
        int[] ans=new int[2];
        int max=Integer.MIN_VALUE;
        ans[0]=arr[0][0];
        PriorityQueue<pair> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++)
        {
            ans[0]=Math.min(ans[0],arr[i][0]);
            max=Math.max(ans[0],arr[i][0]);
            pair p=new pair(i,0,arr[i,0]);
            pq.add(p);
        }
        int d=max-ans;
        ans[1]=max;
        while(!pq.isEmpty)
        {
            pair r=pq.poll();
            if(d>max-r.val)
            {
                ans[0]=r.val;
                ans[1]=max;
                d=max-r.val;
            }
            r.di++;
            if(r.di<n)
            {
                r.val=arr[r.li][r.di];
                max=Math.max(max,r.val);
                pq.add(r);
            }
            else break;
        }
        return ans;
    }
    static class pair implements Comparable<pair>{
        int li;
        int di;
        int val;
        pair(int li, int di, int val){
            this.li=li;
            this.di=di;
            this.val=val;
        }
        public int compareTo(pair o){
            return this.val-o.val;
        }
    }
}

