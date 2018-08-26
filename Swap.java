import java.util.*;
class Swap{
public static void main(String [] agrs)
{Scanner scr=new Scanner(System.in);
	int x =scr.nextInt();
	int y =scr.nextInt();
	System.out.println("before x value "+x);
	System.out.println("before y value "+y);

//	x=x+y;
//	y=x-y;
//	x=x-y;
//	x=x*y;
//	y=x/y;
//	x=x/y;
	x=x^y;
	y=x^y;
	x=x^y;
	System.out.println("after swap x value "+x);
	System.out.println("after swap y value "+y);
}
}