class Fab1{
	static int n1=0,n2=1,n3=0;
	static void printFab(int count){
		if(count>0){
			n3=n1+n2;
			n1=n3;
			n2=n3;
			System.out.print(" "+n3);
			printFab(count-1);
		}
	}
	public static void main(String[] args) {
		int count=10;
		System.out.print(n1+" "+n2);
		printFab(count-2);
	}
}