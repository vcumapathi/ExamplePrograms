import java.io.*;
class DeserialDemo2{
public static void main(String[] agrs)throws IOException,ClassNotFoundException{
	FileInputStream fis=new FileInputStream("abc.txt");
	ObjectInputStream ois=new ObjectInputStream(fis);
	User user=(User)ois.readObject();
	ois.close();
	System.out.println(user.userId+"..."+user.userName+"..."+user.classId);
}
}