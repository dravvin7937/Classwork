package arrayLists;

import java.util.List;

public class basics {
	
	public static void main(String[] args)
	{
		//List<Integer> list = new List<Integer>;
	}
	
	public static List<Integer> removeDupes(List<Integer> nums)
	{
		for (int i = 0; i < nums.size()-1; i++)
		{
			for (int x = 0; x < nums.size(); x++)
			{
				if (nums.get(i) == nums.get(x))
				{
					nums.remove(x);
				}
			}
		}
		return nums;
	}
	
}
