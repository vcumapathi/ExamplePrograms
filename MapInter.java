import java.util.*;
class MapInter{
public static void main(String[] agrs){
	Employee emp;	
	Map<Employee,String> map=new HashMap<Employee,String>();
	map.put(new Employee("1"),"1");
	map.put(new Employee("21"),"over");
	map.put(new Employee("1"),"override");
	
	System.out.println(map.get(Employee("1")));
}
}
class Employee{

}
