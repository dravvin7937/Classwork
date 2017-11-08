package Lab3_1;

public class ArrayMethods {
	
	public static void main (String[] args)
	{
		int[] list = {1,2,2,3,4,5};
		
		removeDuplicates(list);
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int[] newArr = new int[list.length];
		for (int x = 0; x<list.length-1;x++)
			//x =0, i = 1, 
		{
			for (int i = x+1; i<list.length; i++)
			{
				if (!(list[x]==list[i]))
				{
					newArr[x] = list[x];
					//System.out.println(newArr);
				}
			}
		}
		
		for ( int y = 0 ; y<newArr.length; y++)
		{
			System.out.println(newArr[y]);
		}
		return newArr;
		
	}

}
