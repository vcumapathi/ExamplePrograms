import java.util.*;

class ReverseString2{
public static void main(String[] agrs){
	String input = " i love you vandana ";
	char[] hello =input.toCharArray();
	List<Character> al = new ArrayList<>();
	
	for(char c:hello){
		al.add(c);
	}	
	Collections.reverse(al);
	ListIterator li= al.listIterator();
	while(li.hasNext()){
	System.out.print(li.next());
	}
}
}