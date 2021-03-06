package Lab3_2;

public class ArrayMethods2_2 {
	
	public static void main(String[] args)
	{
		String[] list1 = {"a", "b", "c", "e"};
		String[] list2 = {"a", "d", "e"};
		// merged list should print: a, a, b, c, d, e, e
		
		int[] plist1 = {5,1,7,8,9,6,2};
		int[] plist2 = {5,8,2,9};
	
		String[] mergedListt = merge(list1,list2);
		
		for (String letter : mergedListt)
		{
			//System.out.println(letter);
		}
		
		
		System.out.println("final pivot index: " + partition(plist1)); // should return 2 
		System.out.println("final pivot index: " + partition(plist2)); // should return 1
		
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] mergedList = new String[list1.length+list2.length];
		
		int listIndex = 0;
		int i = 0;
		int x = 0;
		
		String check1 = list1[i];
		String check2 = list2[x];
		
		while(i < list1.length && x < list2.length-1)
		{
			//System.out.println("i: " + i + " x: " + x + " listIndex: " + listIndex + " check1: " + check1 + " check2: " + check2);
			
			if (check1.compareTo(check2) <= 0)
			{
				//check1 is closer to a than check2
				mergedList[listIndex] = check1;
				listIndex++;
				i++;
				check1 = list1[i];
			}
			else
			{
				//check2 is closer to a than check1
				mergedList[listIndex] = check2;
				listIndex++;
				x++;
				check2 = list2[x];
			}
		}
		
		while (i < list1.length)
		{
			mergedList[listIndex] = list1[i];
			i++;
			listIndex++;
		}
		
		while (x < list2.length)
		{
			mergedList[listIndex] = list2[x];
			x++;
			listIndex++;
		}
		
		return mergedList;
	}
	
	public static String[] mergeSort(String[] list)
	{
		//initializes the two halves
		String[] list1 = new String[list.length/2];
		String[] list2 = new String[list.length/2];
		
		//sets the values into the new arrays
		for (int i = 0; i < list.length/2; i++)
		{
			list1[i] = list[i];
		}
		for (int i = list.length/2; i < list.length; i++)
		{
			list2[i] = list[i];
		}
		
		//completes the recursive separation
		while (list1.length > 1 || list2.length > 1)
		{
			mergeSort(list1);
			mergeSort(list2);
		}
		
		
		return merge(list1, list2);		
		
	}
	
//	public static int partition( int[] list)
//	{
//		//number that is meant to go in the middle
//		int pivot = list[0];
//		//index of the pivot
//		int pidx = 0;
//		//index that starts at front
//		int front = 1;
//		//index that starts at back
//		int back = list.length-1;
//		
//		//until back passes front & vice-versa
//		while (back-2 >= front)
//		{
//			System.out.println("pivot: " + pivot + " against: " + list[back]);
//			while ( pivot != list[back])
//			{
//				System.out.println(" pivot1: " + pidx);
//				swap(list, pidx, back );
//				pidx = back;
//				System.out.println("Back: " + back + " front: " + front + " pivot1: " + pidx);
//			}
//			while ( pivot != list[front])
//			{
//				System.out.println(" pivot2: " + pidx);
//				swap(list, pidx, front);
//				pidx = front;
//				System.out.println("Back: " + back + " front: " + front + " pivot2: " + pidx);
//			}
//			System.out.println("back3: " + back + " front3: " + front);
//			back--;
//			front++;
//			System.out.println("back4: " + back + " front4: " + front);
//		}
//		
//		return pidx; 
//	}
	
	public static int partition( int[] list)
	{
		int counter = 0;
		int pivot = list[0];
		
		for (int i = 0; i<list.length; i++)
		{
			if(pivot > list[i])
			{
				for (int j = 0; j<i-counter; j++)
				{
					swap(list,i-j,i-j-1);
				}
				counter++;
			}
		}
		return counter;
	}
	
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}