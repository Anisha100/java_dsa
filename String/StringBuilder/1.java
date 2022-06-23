import java.util.*;
public class Main
{
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("Hello");
		s.setCharAt(0,'P');//Pello
		System.out.println(s);
		s.insert(0,'S');//SPello
		System.out.println(s);
		s.delete(2,3);//SPllo
		System.out.println(s);
		s.append("abcd");//SPlloabcd
		System.out.println(s);
		
	}
}
