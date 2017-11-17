package Lab3_2;

public class ArrayMethods2 {
	
	public static void main(String[] args)
	{
		String[] list1 = {"a", "b", "c", "e"};
		String[] list2 = {"a", "d", "e"};
		// merged list should print: a , a , b, c, d, e, e
		
		System.out.print(list1[0].compareTo(list2[1]));
	}
	
	public static String[] merge(String[] list1, String[] list2)
	{
		String[] mergedList = new String[list1.length+list2.length];
		
		for (int i = 0; i<mergedList.length; i++)
		{
			if(list1[i].compareTo(list2[i]) == 0)
			{
				mergedList[i] = list1[i];
				mergedList[i+1] = list1[i];
				i++;
			}
			if(list1[i].compareTo(list2[i]) < 0)
			{
				//list1[i] is closer to a than list2[i]
				
			}
		}
	}
	
}
