class Solution
{
    static int findSmallest(int[] arr)
    {
        int min=Integer.MAX_VALUE;
        int minpos=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
                minpos=i;
            }
        }
        return minpos;
    }
    
    public static ArrayList<Integer> mergeKArrays(int[][] arr,int K) 
    {
        int ptr[]=new int[K];
        int vals[]=new int[K];
        for(int i=0;i<ptr.length;i++) ptr[i]=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(res.size()<K*K)
        {
            for(int i=0;i<K;i++)
            {
                try
                {
                    vals[i]=arr[i][ptr[i]];
                }
                catch(ArrayIndexOutOfBoundsException excep)
                {
                    vals[i]=Integer.MAX_VALUE;
                }
            }
            int sm=findSmallest(vals);
            res.add(arr[sm][ptr[sm]]);
            ptr[sm]++;
            
        }
        return res;
    }
}
