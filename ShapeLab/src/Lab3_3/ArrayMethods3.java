package Lab3_3;

public class ArrayMethods3 {
	
	public static void main(String[] args)
	{
		int[] list = {1, 2, 4, 3, 2, 7, 1};
		String[] list2 = {"a", "b", "c", "e", "d"};
		
		bubbleSort(list2);
		
		for (String letter : list2)
		{
			System.out.println(letter);
		}
	}

	public static void insertionSort(int [] list1)
	{	
		for (int i = 0; i<list1.length; i++)
		{
			
		}
	}
	
	public static void swap(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	//make into string 
	public static void bubbleSort(String[] list1)
	{
		for(int i = 0; i<list1.length-1; i++) 
		{
			if(list1[i+1].compareTo(list1[i]) <= 0)
			{
				swap(list1,i,i+1);
				bubbleSort(list1);
			}
		}
	}
	
	public static void selectionSort( double [] list1)
	{
		int start = 0;
		double lowest = 0;
		while(start<list1.length) 
		{
			lowest = list1[start];
			if(list1[start+1] < list1[start])
			{
				
			}
		}
		
	}
	
	
}
