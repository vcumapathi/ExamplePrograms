import java.util.*;
class LinkedListDemo{
public static void main(String[] agrs){
	LinkedList l=new LinkedList();
	l.add(22);
	l.add(32);
	l.add("uma");
	l.add("pathi");
	System.out.println(l);
	l.addFirst("prathyu");
	System.out.println(l);
	l.addLast("sha");
	System.out.println(l);
	System.out.println(l.getFirst());

	System.out.println(l.getLast());
	
	System.out.println(l.removeFirst());
	
	System.out.println(l);
	System.out.println(l.removeLast());
	
	System.out.println(l);
}
}