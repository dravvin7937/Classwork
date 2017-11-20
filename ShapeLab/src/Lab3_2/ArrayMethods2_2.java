package Lab3_2;

public class ArrayMethods2_2 {
	
	public static void main(String[] args)
	{
		String[] list1 = {"a", "b", "c", "e"};
		String[] list2 = {"a", "d", "e"};
		// merged list should print: a , a , b, c, d, e, e
		
		String[] mergedListt = merge(list1,list2);
		
		for (String letter : mergedListt)
		{
			System.out.println(letter);
		}
		
//		for (int i = 0 ; i<mergedListt.length; i++)
//		{
//			System.out.println(mergedListt[i]);
//		}
		
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] mergedList = new String[list1.length+list2.length];
		
		int listIndex = 0;
		int i = 0;
		int x = 0;
		
		String check1 = list1[i];
		String check2 = list2[x];
		
		while(mergedList[mergedList.length-1] == null)
		{
			if (i == list1.length)
			{
				i--;
			}
			if (x == list2.length)
			{
				x--;
			}
			
//			if (check1.compareTo(check2) == 0)
//			{
//				mergedList[listIndex] = check1;
//				listIndex++;
////				mergedList[listIndex] = check2;
////				listIndex++;
//				check1 = list1[i++];
////				check2 = list2[x++];
//			}
			if (check1.compareTo(check2) <= 0)
			{
				//check1 is closer to a than check2
				mergedList[listIndex] = check1;
				listIndex++;
				check1 = list1[i++];
			}
			else if (check1.compareTo(check2) > 0)
			{
				//check2 is closer to a than check1
				mergedList[listIndex] = check2;
				listIndex++;
				check2 = list2[x++];
			}
		}
		
		return mergedList;
	}
	
}