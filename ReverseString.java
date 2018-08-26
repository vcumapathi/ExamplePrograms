class RevString{
	String reverse="";

	public String reverseString(String str){
		if(str.length() ==1){
			return str;
		}else {
            reverse += str.charAt(str.length()-1)
                    +reverseString(str.substring(0,str.length()-1));
            return reverse;
	}

}
public class ReverseString{
	public static void main(String[] args) {
		RevString rst= new RevString();
		System.out.println("result:"+rst.reverseString("Umapathi"));

	}
}