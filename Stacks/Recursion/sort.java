import java.util.*;
class Main{
    public static void assend(int data,Stack<Integer>s){
    if(s.isEmpty() || s.peek()<data)
    
    {
        s.push(data);
        return;
    }
    int top=s.pop();
    assend(data,s);
    s.push(top);

    }
    
    public static void sort(Stack<Integer>s)
    {
        if(!s.isEmpty()){
        //return;
    
      int top=s.pop();
      sort(s);
      assend(top,s);
        }
    }
      
    
     public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(30);
        s.push(40);
         s.push(20);
        
 
        sort(s);
 while(!s.isEmpty()){
        System.out.println(
            " \n\nStack elements after sorting:"+ s.peek());
        s.pop();
        
    }
}
}
