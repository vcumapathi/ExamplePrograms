abstract class SuperClass {
	abstract void doSomething();
}
class ClassA extends SuperClass {
	public void doSomething()
	{
		System.out.println("Class A super class impl");
	}
	//classA method
	void print();
}
class classB extends SuperClass{
	public void doSomething(){
		System.out.println("Class B super class impl");
	}
	public void methodB();	
}
class ClassC extends ClassA,ClassB{
	public void toTest(){
		doSomething();
	}
}