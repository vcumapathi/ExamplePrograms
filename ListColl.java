import java.util.*;
class ListColl{
	public static void main(String[] args) {
		List ls1 = new ArrayList();
		ls1.add("alpha");
		ls1.add("beta");
		ls1.add("gama");

		System.out.println(ls1);
		Iterator itr = ls1.iterator();
		while (itr.hasNext()) {
			String str =(String) itr.next();
			System.out.println(str);
		}
	}
}