package Lab3_1;

public class ArrayMethods {
	
	public static void main (String[] args)
	{
		int[] list = {1,2,3,1,2};
		
		removeDuplicates(list);
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int[] newArr = new int[3];
		for (int x = 0; x<list.length-1;x++)
		{
			for (int i = x+1; i<list.length; i++)
			{
				if (!(list[x]==list[i]))
				{
					newArr[x] = list[x];
				}
			}
		}
		return newArr;
	}

}
