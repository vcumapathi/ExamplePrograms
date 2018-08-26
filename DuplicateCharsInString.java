import java.util.*;
public class DuplicateCharsInString
{
	public void findDuplicateChars(String str)
	{
		Map<Character,Integer> dupMap = new HashMap<Character,Integer>();
		char[] chars = str.toCharArray();
		for(Character ch: chars)
		{
			if(dupMap.containsKey(ch))
			{
				dupMap.put(ch,dupMap.get(ch)+1);
			}
			else
			{
				dupMap.put(ch,1);
			}
		}
		Set<Character> keys=dupMap.keySet();
		for(Character ch: keys)
		{
			if(dupMap.get(ch) > 1)
			{
				System.out.println(ch+"---->" + dupMap.get(ch));
			}
		}
	}
	public static void main(String[] args)
	{
	DuplicateCharsInString dcs= new DuplicateCharsInString();
	dcs.findDuplicateChars("HelloJavaProgram");

	}
}