import java.util.*;
public class Main
{ static ArrayList<Integer>findmax(Integer[] arr, int k,int n)
{
    
    ArrayList <Integer> res=new ArrayList<>();
    int i=0;
    Arrays.sort(arr,Collections.reverseOrder());
    for( i=0;i<n;i++)
    {
        res.add(arr[i]);
    }
    return res;
}
	public static void main(String[] args) {
	    Integer arr[]=new Integer[]{1,5,10,6,8,9,44,76,34};
	    int k=4,n=arr.length;
	    List<Integer>res=findmax(arr,k,n);
	    for(int i=0;i<3;i++){
	        System.out.println(arr[i]);
	    }
}
}
