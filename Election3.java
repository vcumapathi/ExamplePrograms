import java.util.*;
class Election3{
public static void main(String[] args){
String[] votes ={"uma","deek","vny","uma","raj","swa","deek"};
Map<String,Integer> map = new TreeMap<>(Collections.reverseOrder());
for(String vote: votes){
	if(map.containsKey(vote)){
	System.out.println(map.containsKey(vote));
	map.put(vote,map.get(vote)+1);
	}
	else{
	map.put(vote,1);
	}
}
System.out.println(Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey());
}
}