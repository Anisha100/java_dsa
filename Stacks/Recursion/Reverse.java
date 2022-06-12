
import java.util.*;
public class Main
{
    public static void pushatbottom(int data,Stack<Integer>s)//10 20
    {
        if(s.isEmpty()){
        s.push(data);//10
        return;
        }
       int top= s.pop();//pop 10
        pushatbottom(data,s);
        s.push(top);
    }
    
   public static void reverse(Stack<Integer>s)
    {
        if(s.isEmpty())
        return;
        int top=s.pop();
        reverse(s);//30    20   10
        pushatbottom(top,s);//10
    }
    
	public static void main(String[] args) {
	Stack<Integer>sll=new Stack<>();
	sll.push(10);
        sll.push(20);
        sll.push(30);
        reverse(sll);
        while(!sll.empty())
        {
           System.out.println(sll.peek());
           sll.pop();
        }
		
	}
}
