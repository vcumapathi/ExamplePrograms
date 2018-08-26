import java.util.*;
class MapDemo2{
public static void main(String[] agrs){
	Map m8=new HashMap();
	m8.put(5,"jagan");
	m8.put(6,"venkat");
	
	Map m1=new HashMap();
	m1.put(1,"darling");
	m1.put(2,"prathyu");
	m1.putAll(m8);
	System.out.println(m1.get(2));
	
	System.out.println(m1);
	System.out.println(m1.remove(5));
	System.out.println(m1.containsKey(2));
	System.out.println(m1.isEmpty());
	System.out.println(m1.containsValue("prathyu"));
	System.out.println(m1.size());
	System.out.println(m1.clear());
	
	Set s=m1.keySet();
	
	System.out.println(s);
	Collection c=m1.values();
	System.out.println(c);
	Set s2=m1.entrySet();
	System.out.println(s2);
	Iterator itr=s2.iterator();
	while(itr.hasNext()){
	Map.Entry m2=(Map.Entry)itr.next();
	System.out.println(m2.getKey()+">>>"+m2.getValue());
	//System.out.println(m2);
	}
}
}