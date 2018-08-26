import java.util.*;
class Test{
	public String getWinnerName(String[] votes){
		Map<String,Integer> map =new TreeMap<>(Collections.reverseOrder());
		for(String vote : votes){
		if(map.containsKey(vote)){
			map.put(vote,map.get(vote)+1);
		}
		else{
			map.put(vote,1);
		}
		}
	//String str = Collections.max(map.entrySet(),map.Entry.comparingByValue()).getKey();
	String str2 =Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey();
	return str2;	
	}
}
class Election2{
public static void main(String[] agrs){
	String[] arr = {"deekshi","uma","deekshi","uma","uma","vandu","deekshi"};
	Test t = new Test();
	String winner = t.getWinnerName(arr);
	System.out.println(winner);
	
}
}