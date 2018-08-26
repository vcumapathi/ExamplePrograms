import java.util.*;
class DuplicateNumber{
	public int findDuplicateNumber(List<Integer> number){
	int highestNumber =number.size()-1;
	int total=getSum(number);
	int duplicate =total - (highestNumber*(highestNumber+1)/2);
	return duplicate;	
	}
	public int getSum(List<Integer> number){
		int sum=0;
		for(int num : number){
		sum +=num;
		}
		return sum;
	}
public static void main(String[] agrs){
	List<Integer> li= new ArrayList<>();
	for(int i=1;i<30;i++){
	li.add(i);
	}

	DuplicateNumber dpl =new DuplicateNumber();
	//add duplicate numbers
	li.add(20);
	
	System.out.println("duplicate number:"+dpl.findDuplicateNumber(li));
}
}