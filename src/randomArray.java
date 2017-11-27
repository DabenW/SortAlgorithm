
public class randomArray {

	private int[] array;
	
	public randomArray(int num) {
		array=new int[num];
	}
	
	public int[] getRandomArray() {
		for(int i=0;i<array.length;i++) {
			int j=(int)(Math.random()*100);
			array[i]=j;
		}
		return array;
	}
}
