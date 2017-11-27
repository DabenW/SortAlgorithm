
public class QuickSort {

	public void sort(int[] array,int first,int last) {
		if(first<last) {
			int splitPoint=Split(array,first,last);
			sort(array,first,splitPoint-1);
			sort(array,splitPoint+1,last);
		}
	}

	private int Split(int[] array, int left, int right) {
		// split the array by splitPoint
		int privot=array[left];
		while(left<right) {//when left==right that means get the splitpoint
			while(left<right&&array[right]>=privot) {
				right--;
			}
			array[left]=array[right];//put number smaller than privot to the left side

			while(left<right&&array[left]<=privot) {//put number bigger than privot to the right side
				left++;
			}
			array[right]=array[left];
		}
		array[left]=privot;
		
		return left;//here left=right=splitpoint
	}
}
