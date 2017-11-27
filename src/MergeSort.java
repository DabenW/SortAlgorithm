
public class MergeSort {

	public void sort(int[] array,int first,int last) {
		if(first<last) {
			int mid=(first+last)/2;
			sort(array,first,mid);
			sort(array,mid+1,last);
			Merge(array,first,mid,last);
		}
	}
	
	public void Merge(int[] array,int first,int mid,int last) {
		int i=first;
		int j=mid+1;//second part
		int count=0;
		int temp[]=new int[last-first+1];
		
		while((i<=mid)&&(j<=last)) {
			if(array[i]<array[j]) {
				temp[count]=array[i];
				i++;
				count++;
			}else {
				temp[count]=array[j];
				j++;
				count++;
			}
		}
		
		
		//if the first part is longer than second 
		while(i<=mid) {
			temp[count++]=array[i++];
		}
		//is the second  part is longrt
        while(j<=last) {
        	temp[count++]=array[j++];
        }
        
        int m=0;
        while(first<=last) {
        	array[first++]=temp[m++];
        }
	}
}
