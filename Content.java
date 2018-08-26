import java.util.*;
class Content{
public static void main(String[] agrs){
	IdentityHashMap m=new IdentityHashMap();
	
	Integer it1= new Integer(10);
	Integer it2= new Integer(10);
	m.put(it1,"siva");
	m.put(it2,"raju");
	System.out.println(m);
	//System.out.println(it1==it2);
	//System.out.println(it1.equals(it2));
//	String i1="prathyu";
//	String i2="prathyu";

//	System.out.println(i1==i2);
//	System.out.println(i1.equals(i2));
}
}