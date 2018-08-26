import java.util.*;
class StackDemo{
public static void main(String[] agrs){
	Stack s=new Stack();
	s.push("prathyu");
	s.push("umapathi");
	s.push("love");
	System.out.println(s);
	System.out.println(s.search("prathyu"));
	System.out.println(s.search("lovers"));

}
}