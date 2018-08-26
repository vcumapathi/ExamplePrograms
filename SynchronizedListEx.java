import java.util.*;
class SynchronizedListEx{
public static void main(String[] args){
	ArrayList<String> al=new ArrayList<String>();
	al.add("1");
	al.add("2");
	al.add("3");
	al.add("4");
	al.add("5");
	al.add("6");

	System.out.println("Non Synchronized List: "+al);
	
	List<String> synlist=Collections.synchronizedList(al);
	System.out.println("Synchronized List: "+synlist);

}
}