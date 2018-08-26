class T1 extends Thread{
public void start(){
System.out.println("st1 5.014 6.25");
}
public void start(){

System.out.println("st2");
}
public void run(){

System.out.println("r1");
}
public void run(){

System.out.println("r2");
}
}
class Td{
public static void main(String[] agrs){
T1 t1 = new T1();
T1 t2 = new T1();
t1.start();
t2.start();
}
}