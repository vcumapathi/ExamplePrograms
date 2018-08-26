class Test{
static int n1=0,n2=1,n3=0,count;
static void printFab(int count){
	if(count>0){
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(" "+n3);
	printFab(count-1);
	}
}
public static void main(String[] agrs){
	int count =20;
	System.out.print(n1+" "+n2);
	printFab(count-2);
	
}
}