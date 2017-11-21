package Lab3_3;

public class ArrayMethods3 {
	
	public static void main(String[] args)
	{
		int[] list = {1, 2, 4, 3, 2, 7, 1};
		
		bubbleSort(list);
		
		for (int num : list)
		{
			System.out.println(num);
		}
	}

	public static void insertionSort(int [] list1)
	{	
		for (int i = 0; i<list1.length; i++)
		{
			
		}
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public static void bubbleSort(int[] list1)
	{
		for(int i = 0; i<list1.length-1; i++) 
		{
			if(list1[i+1] < list1[i])
			{
				swap(list1,i,i+1);
				bubbleSort(list1);
			}
		}
		
	}
	public static void selectionSort( double [] list1)
	{
		
	}
	
	
}
