class RepeatElements{
	void printRepeatElements(char arr[],int size)
	{
	int i,j;
	for(i=0;i<size;i++){
		for(j=i+1;j<size;j++){
			if(arr[i] == arr[j]){
			System.out.print(" "+arr[i]);
			}
		}
	}
	}
public static void main(String[] args){
	char[] arr={'h','e','l','l','o','j','a','v','a'};
	int arrsize=arr.length;
	RepeatElements repeat=new RepeatElements();
	repeat.printRepeatElements(arr,arrsize);	
}
}