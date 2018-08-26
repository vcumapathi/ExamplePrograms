class Test4{
int rollNo;
String name;
public Test4(int rollNo,String name){
this.rollNo = rollNo;
this.name = name;
}
public String toString(){
return getClass().getName+"@"+toHexString(hashCode());
}
public static void main(String[] agrs){

Test4 test1=new Test4(1,"testone");
Test4 test2= new Test$(2,"testtwo");
System.out.println(test1);
System.out.println(test2);
}
}