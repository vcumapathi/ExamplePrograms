import java.util.*;
class SortName{
     
    // Driver method
    public static void main(String[] args)
    {
        String inputString = "geeksforgeeks";
	char[] ch= inputString.toCharArray();
	Arrays.sort(ch);
	String s = Character.toString(ch);
        System.out.println("Input String : " + inputString);
        System.out.println("Output String : " + s);
    }

}