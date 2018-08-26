class TightEncap{
	public static void main(String[] args) {
		EmpBean eb1 = new EmpBean();

		eb1.setEmpNo(123);
		eb1.setEName("Umapathi");

		int eId = eb1.getEmpNo();
		String empName = eb1.getEName();

		System.out.println(eId);

		System.out.println(empName);
	}
}