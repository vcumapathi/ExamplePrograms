interface Abc{
	void print();
}
class Testing implements Abc{
	public void print()
	{
		System.out.println("I'm Interface I'm Actived...");
		int x=10;
		int y=20;
		x=x*y;
		y=x/y;
		x=x/y;

		System.out.println("after x:"+x);
		System.out.println("after y:"+y);
		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("after x:"+x);
		System.out.println("after y:"+y);

		x=x^y;
		y=x^y;
		x=x^y;

				System.out.println("after x:"+x);
		System.out.println("after y:"+y);

	}
}
public class InterfaceEx{
public static void main(String[] args)
	{
		Testing t1=new Testing();		
		t1.print();
	}
}