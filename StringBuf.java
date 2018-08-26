class StringBuf{
public static void main(String[] agrs){
StringBuffer sb= new StringBuffer();
//sb.concat("v c");
System.out.println(sb.capacity());
sb.append("abcdefghijklmnop");
System.out.println(sb.capacity());
sb.append("q");
System.out.println(sb.capacity());
}
}