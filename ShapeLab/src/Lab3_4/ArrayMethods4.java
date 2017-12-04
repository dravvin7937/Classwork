package Lab3_4;


public class ArrayMethods4 {
	public static void main(String[] args)
	{
		int[] plist1 = {5,1,7,8,9,6,2};
		//int[] plist2 = {5,8,2,9};
		
		System.out.println("final pivot index: " + partition(plist1,0,6)); // should return 2 
		System.out.println("final pivot index: " + partition(plist1,0,5)); // should return 1
		
		quickSort(plist1, 0, plist1.length-1);
		
		print(plist1);
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static int partition(int[] list1, int front, int back)
	{
		//returns position of the pivot 
		int pivot = list1[front];
		int pivPosition = front;
		
		for (int i = front+1; i <= back; i++)
		{
			if (list1[i]<=pivot)
			{
				for (int j = 0; j<i-pivPosition; j++)
				{
					swap(list1,i-j,i-j-1);
				}
				pivPosition++;
			}
		}
		return pivPosition;
		
//		if(back==front)
//		{
//			return pivPosition;
//		}
//		
//		while(back > front)
//		{
//			//while the back is less than pivot
//			//subtract from the 
//		}
	}
	
	public static void quickSort(int[] list1, int front, int back)
	{
		if (front < back)
		{
			int pivPosition = partition(list1, front, back);
			quickSort(list1,front,pivPosition-1);
			quickSort(list1,pivPosition+1,back);
		}
	}
	
	public static void print(int[] list)
	{
		for (int num : list)
		{
			System.out.print(" " + num + " ");
		}
	}
}
