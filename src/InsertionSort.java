
public class InsertionSort {

	public void sort(int[] array) {
		int temp,j;
		for(int i=1;i<array.length;i++) {
			j=i-1;
			while(j>=0 && array[j]>array[j+1]) {
				temp=array[j+1];
				array[j+1]=array[j];
				array[j]=temp;
				j--;
			}
		}
	}
}
