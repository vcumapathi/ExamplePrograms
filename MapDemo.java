
import java.util.*;
class MapDemo{
public static void main(String[] agrs){
	Map m = new HashMap();
	m.put(1,"prathyu");
	m.put(2,"usha");
	m.put(3,"deekshi");
	System.out.println(m);
	Set s=m.keySet();
	System.out.println(s);
	Collection c=m.values();
	System.out.println(c);
	Set s2=m.entrySet();
	System.out.println(s2);
	Iterator itr=s2.iterator();
	while(itr.hasNext()){
	Map.Entry m2=(Map.Entry)itr.next();
	//System.out.println(m2);
	System.out.println(m2.getKey()+">>>"+m2.getValue());
	}
}
}