package Lab3_2;

public class ArrayMethods2_2 {
	
	public static void main(String[] args)
	{
		String[] list1 = {"a", "b", "c", "e"};
		String[] list2 = {"a", "d", "e","f"};
		// merged list should print: a, a, b, c, d, e, e
		
		String[] mergedListt = merge(list1,list2);
		
		for (String letter : mergedListt)
		{
			System.out.println(letter);
		}
		
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] mergedList = new String[list1.length+list2.length];
		
		int listIndex = 0;
		int i = 0;
		int x = 0;
		
		String check1 = list1[i];
		String check2 = list2[x];
		
		while(i < list1.length && x < list2.length)
		{
			System.out.println("i: " + i + " x: " + x + " listIndex: " + listIndex + " check1: " + check1 + " check2: " + check2);
			
//			if (i == list1.length)
//			{
//				i--;
//			}
//			if (x == list2.length)
//			{
//				x--;
//			}
			
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
		
		if (list1.length > list2.length)
		{
			for (int j = list2.length; j<list1.length; j++)
			{
				mergedList[listIndex] = list1[j];
			}
		}
		
		if (list1.length < list2.length)
		{
			for (int j = list1.length; j<list2.length; j++)
			{
				mergedList[listIndex] = list2[j];
			}
		}
		
		return mergedList;
	}
	
}