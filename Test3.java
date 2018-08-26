class Test3{
int rollNo;
String name;
public Test3(int rollNo,String name){
this.rollNo = rollNo;
this.name = name;
}
public String toString(){
return name+"";
}
public static void main(String[] agrs){
Test3 test1= new Test3(101,"uma");
Test3 test2= new Test3(102,"test");

System.out.println(test1);
System.out.println(test2);
}
}