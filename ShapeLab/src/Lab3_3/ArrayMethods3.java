package Lab3_3;

public class ArrayMethods3 {
	
	public static void main(String[] args)
	{
		int[] list = {1, 2, 4, 3, 2, 7, 1};
		String[] list2 = {"a", "b", "c", "e", "d"};
		double[] list3 = {11, 16, 4, 8};
		
//		bubbleSort(list2);
//		
//		for (String letter : list2)
//		{
//			System.out.println(letter);
//		}
		
		selectionSort(list3);
		for (double num : list3)
		{
			System.out.println(num);
		}
	}

	public static void insertionSort(int [] list1)
	{	
		//start with second element, check against first, move to the front if smaller
		//if the number is greater than all behind it, don't move
		for (int i = 0; i<list1.length; i++)
		{
			
		}
	}
	
	public static void swapS(String[] arr, int i, int j)
	{
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void swapD(double[] arr, int i, int j)
	{
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void bubbleSort(String[] list1)
	{
		for(int i = 0; i<list1.length-1; i++) 
		{
			if(list1[i+1].compareTo(list1[i]) <= 0)
			{
				swapS(list1,i,i+1);
				bubbleSort(list1);
			}
		}
	}
	
	public static void selectionSort( double [] list1)
	{
		//index of the smallest number
		int lowPosition = 0;
		
		for(int count = 0; count < list1.length-1; count++)
		{
			//sets the smallest number position to 0 to begin with, and then skips after a swap
			lowPosition = count;
			
			//goes through the remaining numbers in the list
			for (int start = count+1; start < list1.length; start++)
			{
				//compares the smallest number to the others, if it's larger the smallest number changes
				if (list1[start] < list1[lowPosition])
				{
					lowPosition = start;
				}
			}
			swapD(list1, lowPosition, count);
		}
	}
	
	
}
