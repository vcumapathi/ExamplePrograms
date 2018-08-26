class Gen<T>{
	T obj;
	Gen(T obj)
	{
	this.obj=obj;
	}
	public void show(){
	System.out.println("Type of gen object:"+obj.getClass().getName());
	}
	
	public T getOb(){
		return obj;
	}
}