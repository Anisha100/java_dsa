import java.util.*;
public class Main
{
/*ArrayList<Integer> list=new ArrayList<>();
public boolean isnull()
{
    return list.size()==0;
    
}
public void push(int d)
{
    list.add(d);
    
}
public int pop(){
    int val=list.get(list.size()-1);
    list.remove(list.size()-1);
    return val;
}
public int peek(){
    return list.get(list.size()-1);
    
    
}
   */public static void main(String args[])
    {
       Stack<Integer> s = new Stack<>();
        //Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.pop() + " Popped from stack");
        System.out.println("Top element is :" + s.peek());
        System.out.print("Elements present in stack :");
     
    }
}
