class Test{
public static Test getInstance =null;
String s; 
private Test(){
s="hello java";
}
public static Test getObj(){
	if(getInstance == null){
		getInstance = new Test();
	}
	return getInstance;
}
}
class Singleton{
public static void main(String[] agrs){
Test x =Test.getObj();
x.s =(x.s).toUpperCase();
System.out.println(x.s );
Test y = Test.getObj();
System.out.println(y.s);
Test z = Test.getObj();
System.out.println(z.s);

z.s =(z.s).toLowerCase();
System.out.println(z.s);
System.out.println(x.s);

}
}