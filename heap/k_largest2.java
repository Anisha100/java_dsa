class Solution {
    int[] kLargest(int[] arr, int n, int k) { 
      
      
      //PriorityQueue to build min heap
        PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();

        //add data in heap
        for (int i =0 ; i<n;i++) {
            numbers.add((-1)*arr[i]);
        }

        int[] array = new int[k] ;
        int i = 0 ;

        if (k<=numbers.size()){

            while (!numbers.isEmpty()&&k>i){
                array[i]=numbers.poll()*(-1);
                i++;
            }
        }


      return array ;
      
        
    }  
}
