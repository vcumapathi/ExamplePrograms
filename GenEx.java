class GenEx{
public static void main(String[] agrs)
{
	Gen<String> g1= new Gen<String>("umapathi");
	g1.show();
	System.out.println(g1.getOb());

	Gen<Integer> g2 = new Gen<Integer>(22);
	g2.show();
	System.out.println(g2.getOb());

	Gen<Double> g3 = new Gen<Double>(5.5);
	g3.show();
	System.out.println(g3.getOb());
}
}