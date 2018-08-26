import java.util.*;
class ArrayListDemo{
public static void main(String[] args){
	ArrayList li= new ArrayList();
	li.add("uma");
	li.add("prathyu");
	li.add(34);
	li.add(null);
	System.out.println(li);
	li.remove(2);
	System.out.println(li);
	li.add("vandu");
	li.add(44);
	System.out.println(li);
	li.set(4,"deekshi");
	System.out.println(li);
	
}
}