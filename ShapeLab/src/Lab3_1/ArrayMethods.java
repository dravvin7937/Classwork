package Lab3_1;

public class ArrayMethods {
	
	public static void main (String[] args)
	{
		int[] list = {1,3,3,5};
		
		removeDuplicates(list);
	}
	
	public static int[] removeDuplicates(int[] list)
	{
//		int[] newArr = new int[list.length];
//		for (int x = 0; x<list.length;x++)
//			//x =0, i = 1, 
//		{
//			boolean unique = true;
//			
//			for (int i = x+1; i<list.length; i++)
//			{
//				if (list[x]==list[i])
//				{
//					unique = false;
//					break;
//				}
//
//				if (unique)
//				{
//					newArr[x] = newArr[i];
//				}
//			}
//			
//		}
//		for ( int y = 0 ; y<newArr.length; y++)
//		{
//			System.out.println(newArr[y]);
//		}
//		return newArr;
		
		int[] bitMask = new int[list.length];
		int counter = 0;
		for (int x = 0; x < list.length; x++)
		{
			for (int y = x+1; y < list.length; y++)
			{
				if (list[x] == list[y])
				{
					bitMask[x] = 0;
					break;
				}
					
			}
			bitMask[x] = 1;
			counter++;
		}
		
		int[] newArr = new int[counter];
		for (int x = 0; x< list.length; x++)
		{
			if (bitMask[x]==1)
			{
				newArr[x] = list[x];
			}
		}
		for ( int y = 0 ; y<newArr.length; y++)
			{
				System.out.println(bitMask[y]);
			}
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
