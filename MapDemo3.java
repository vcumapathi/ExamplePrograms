import java.util.*;
class MapDemo3{
public static void main(String[] args){
Map m=new HashMap();
m.put(1,"ganesha");
m.put(2,"siva");
System.out.println(m);
Set s1=m.keySet();
System.out.println(s1);
Set s2=m.entrySet();
Iterator itr=s2.iterator();
while(itr.hasNext()){
Map.Entry m2=(Map.Entry)itr.next();

System.out.println(m2);
}
}
}