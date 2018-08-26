class Abcd{
public static void main(String[] agrs){
	int i=1 , j=10;
	do{
	if(i>j--){
		continue ;
	}
	}while(i<5);
	System.out.println(i +": " + j);	
}
}