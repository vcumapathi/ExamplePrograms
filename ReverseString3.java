import java.util.*;
class ReverseString3{
public static void main(String[] agrs)
{
	String name="Hello Java World";
	char[] charArr = name.toCharArray();
	List<Character> al=new ArrayList<>();
	for(char ch: charArr){
	al.add(ch);
	}
	Collections.reverse(al);
	ListIterator li = al.listIterator();
	while(li.hasNext()){
	System.out.println(li.next());
	}
}
}