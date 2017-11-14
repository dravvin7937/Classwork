package Lab3_1;

public class ArrayMethods {
	
	public static void main (String[] args)
	{
		int[] list = {1,3,3,5};
		
		removeDuplicates(list);
	}
	
	public static int[] removeDuplicates(int[] list)
	{
		int[] bitMask = new int[list.length];
		int counter = 0;
		for (int x = 0; x < list.length; x++)
		{
			for (int y = x+1; y <= list.length; y++)
			{
				if (y == list.length)
				{
					bitMask[x] = 1;
				}
				else if (list[x] == list[y])
				{
					bitMask[x] = 0;
					break;
				}
				else
				{
					//counter++;
					bitMask[x] = 1;
					counter++;
				}
			}	
		}
		
		
		int[] newArr = new int[counter-1];
		
		int idx = 0;
		
		for (int x = 0; x< list.length; x++)
		{
			if (bitMask[x]==1)
			{	
				newArr[idx] = list[x];
				idx ++;
				
			}
		}
		
		for ( int y = 0 ; y<bitMask.length; y++)
		{
			System.out.println(bitMask[y]);
		}
		
		System.out.println("Counter: " + counter);
		
		for ( int y = 0 ; y<newArr.length; y++)
		{
			System.out.println(newArr[y]);
		}
		
		return newArr;
	}
	
	public static int[][] productArray(int[] arr1, int[] arr2)
	{
		int [] [] Arr3 = new int[arr1.length + 1] [arr2.length+1];
		for( int y = 0; y<Arr3.length; y++)
		{
			for ( int x = 0; x<Arr3.length; x++)
			{
				Arr3[y][x] = arr1[x] * arr2[y];
			}
			
		}
		return Arr3;
	}
	
	

}
