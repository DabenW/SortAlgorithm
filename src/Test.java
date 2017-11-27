import java.util.Arrays;
import java.util.Scanner;

public class Test {

	randomArray randomArray;
    QuickSort quickSort;
    InsertionSort insertionSort;
    InsertionSort2 insertionSort2;
    MergeSort mergeSort;
    
	public Test() {
		quickSort=new QuickSort();
		insertionSort=new InsertionSort();
		insertionSort2=new InsertionSort2();
		mergeSort=new MergeSort();
	}
	
	public static void main(String[] args) {
		Test test=new Test();
		
		System.out.println("Generate a random unsorted set of integers--Input the size of the set:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		test.randomArray=new randomArray(num);
		int[] array=test.randomArray.getRandomArray();
		
		/*Quick sort*/
		System.out.println(" quicksort Original:"+Arrays.toString(array));

		int last=array.length-1;
		
		test.quickSort.sort(array, 0, last);
		System.out.println("sorted:"+Arrays.toString(array));
		
		System.out.println();
		
		/*insertionsort1*/
		int[] array2= test.randomArray.getRandomArray();
		System.out.println("insertionsort1 Original:"+Arrays.toString(array2));
		test.insertionSort.sort(array2);
		System.out.println("sorted:"+Arrays.toString(array2));
		
		
		System.out.println();
		
		
		/*insertionsort2*/
		int[] array3= test.randomArray.getRandomArray();
		System.out.println("insertion2 Original:"+Arrays.toString(array3));
		test.insertionSort2.sort(array3);
		System.out.println("sorted:"+Arrays.toString(array3));
		
		
		System.out.println();
		
		/*Merge sort*/
		int[] array4=test.randomArray.getRandomArray();
		System.out.println(" MergeSort Original:"+Arrays.toString(array4));

		int end=array4.length-1;
		
		test.mergeSort.sort(array4, 0, end);
		System.out.println("sorted:"+Arrays.toString(array4));
		
	}

}
