
public class InsertionSort2 {

	public void sort(int[] array) {
		int temp,j;
		for(int i=1;i<array.length;i++) {
			temp=array[i];//number we insert
			j=i-1;
			while(j>=0) {
				if(array[j]>temp) {
					array[j+1]=array[j];//array[j+1]=array[j]
				}else {
					break;
				}
				j--;
			}
			j+=1;
			array[j]=temp;
		}
	}
}
