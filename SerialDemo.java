import java.io.*;

class SerialDemo{
public static void main(String[] agrs) throws Exception{
	Prathyu prathyu = new Prathyu();
	ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.txt"));
	oos.writeObject(prathyu);

	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.txt"));
	Prathyu prathyu1=(Prathyu)ois.readObject();

	System.out.println(prathyu1.eId+"----"+prathyu1.name);
}
}
class Prathyu implements Serializable{
	int eId=23;
	static transient String name="prathyu";
}