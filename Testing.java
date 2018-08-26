class Testing{
	public void findRepeatNumbers(int arr[],int size){
	int i,j;
	for(i=0;i<size;i++){
	for(j=i+1;j<size;j++){
		if(arr[i]==arr[j]){
		System.out.print(" "+arr[i]);
		}
	}
	}
	}
public static void main(String[] agrs)
{
	int[] arr={34,32,34,23,12,23,46,45,43,46};
	int arrsize=arr.length;
	Testing ti=new Testing();
	ti.findRepeatNumbers(arr,arrsize);
}
}