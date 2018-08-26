class RepeateElements2{
	public void findRepeatElements(int[] arr,int size){
	int i,j;
	for(i=0;i<size;i++){
		for(j=i+1;j<size;j++)
		{
			if(arr[i]==arr[j]){
			System.out.println(arr[i]+" ");
			}
		}
	}
	}
public static void main(String[] args){
	int[] arr={41,51,34,33,24,23,23,221,35,46,33};
	int arrsize = arr.length;
	RepeateElements2 re= new RepeateElements2();
	re.findRepeatElements(arr,arrsize);
}
}