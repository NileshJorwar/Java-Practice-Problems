
public class HeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {12,1,2,15,4,4,6,1,0};
		int heap_size=array.length;
		sort(array,heap_size);
		
	}
	public static void sort(int array[],int heap_size)
	{
		for(int i=heap_size/2 -1; i>=0; i--)
		{
			heapify(array,heap_size,i);
		}
		
		for(int i=heap_size-1;i>=0;i--)
		{
			int tmp=array[0];
			array[0]=array[i];
			array[i]=tmp;
			heapify(array,i,0);
		}
		display(array);
	}
	public static void heapify(int array[], int heap_size,int i)
	{
		int largest=0;
		int l=2*i+1;
		int r=2*i+2;
		
		if(l<heap_size && array[l]>array[largest])
			largest=l;
		else
			largest=i;
		if(r<heap_size && array[r]>array[largest])
			largest=r;
		if(largest!=i)
		{
			int tmp=array[i];
			array[i]=array[largest];
			array[largest]=tmp;
			heapify(array,heap_size,largest);
		}
	}
	public static void display(int array[])
	{
		for(int i=0;i<array.length;++i)
		{
			System.out.println(array[i]+" ");
		}
	}
	
}
