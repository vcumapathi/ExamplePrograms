import java.util.*;
public class SwapTwoNumbers{
	public static void main(String[] args)
	{
	Scanner scr = new Scanner(System.in);
	System.out.println("Enter X Value");
	int x=scr.nextInt();
	System.out.println("Enter Y value");
	int y=scr.nextInt();

	//x=x+y;
	//y=x-y;
	//x=x-y;
	
	//x= x^y;
	//y=x^y;
	//x=x^y;

	x=x*y;
	y=x/y;
	x=x/y;

	System.out.println("After x value:"+x);
	System.out.println("After Y value:"+y);
	}
}