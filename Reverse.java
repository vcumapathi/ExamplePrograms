import java.util.*;
class Reverse{

	int revNum=0;
	public int revNumber(int number){

	while(number>0){
		revNum= (revNum*10)+(number%10);
		number =number/10;
	}
	return revNum;
}
public static void main(String[] args){
	Reverse rev= new Reverse();
	Scanner scr = new Scanner(System.in);

	int number =scr.nextInt();
	System.out.println("Result :"+rev.revNumber(number));
}
}