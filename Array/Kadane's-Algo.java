import java.util.*
class Main{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   n=sc.nextInt()l
   for(int i=0;i<n;i++)
   {
   arr[i]=sc.nextInt();
   }
   Solution obj=new Solution();
   System.out.println(obj.maxsubarray(arr,n));
   }
   class Solution
   {
    int maxarray(arr[],n)
    {
     int sum=0,max_sum=arr[0];
     for(int i=0;i<n;i++)
       {
        sum+=arr[i];
        if(sum<0)
         sum=0;
        if(sum>max_sum)
         max_sum=sum;
       }
       return max_sum;
    }
    }
    
