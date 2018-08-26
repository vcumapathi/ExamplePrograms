import java.util.*;
class Election{
public static void main(String[] args){
	String[] votes ={"deekshi","uma","deekshi","uma","uma","vandu","deekshi"};
	Map<String,Integer> map = new TreeMap<String,Integer>(Collections.reverseOrder());
for(String vote : votes){
if(map.containsKey(vote)){
map.put(vote,map.get(vote)+1);
}else{
map.put(vote,1);
}
}
System.out.println(Collections.max(map.entrySet(),Map.Entry.comparingByValue()).getKey());
}
}