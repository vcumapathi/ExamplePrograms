import java.util.concurrent.ConcurrentHashMap;
import java.util.*;
class ConcerrentDemo{
public static void main(String[] agrs){
	Map m1=new ConcurrentHashMap();
	m1.put("1","1");
	m1.put("2","1");
	m1.put("3","1");
	m1.put("4","1");
	m1.put("5","1");
	m1.put("6","1");
	m1.put("7","1");

	System.out.println(m1);
}
}