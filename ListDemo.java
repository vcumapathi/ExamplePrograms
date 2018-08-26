import java.util.*;
class ListDemo{
public static void main(String[] agrs){
	List l=new ArrayList();
	l.add(1);
	l.add(44);
	l.add("um");	
	l.add("a");	
	l.add(43);
	
	System.out.println(l);
	
	List l2=Collections.synchronizedList(l);
	System.out.println(l2);
	
}
}