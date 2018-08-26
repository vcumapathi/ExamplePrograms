import java.util.*;
class Testing1{
public static void main(String[] args){
	String str="prathyusha";
	char[] charArray=str.toCharArray();
	List<Character> li=new ArrayList<>();
	for(char ch: charArray){
	li.add(ch);
	}
	Collections.reverse(li);
	ListIterator lr=li.listIterator();
	while(lr.hasNext()){
	System.out.print(" "+lr.next());
	}	
}
}