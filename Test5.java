import java.util.*;
class Test5{
static int b= 0;
public static void generateValue(String str,String[] strArr){
	for(String st : strArr){
	char[] ch = st.toCharArray();
	for(char c : ch){
	b = str.indexOf(c);
	if(b == -1){
		break;
	}
	}
	if(b >=0){
	System.out.println("word may generate "+st);
	}
	else{
	System.out.println("word not found");
	}
	}
}
public static void main(String[] agrs){
Scanner scr = new Scanner(System.in);
String str ="uamesdpwl";
String[] strArr = {"come","wel","uma","test"};
generateValue(str,strArr);
}
}