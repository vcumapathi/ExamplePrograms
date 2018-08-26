import java.io.*;
class SerialDemo2{
public static void main(String[] agrs)throws IOException,ClassNotFoundException{
	User userObj=new User();
	FileOutputStream fos=new FileOutputStream("abc.txt");
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(userObj);
	oos.flush();
	System.out.println("done...");
	oos.close();
}
}