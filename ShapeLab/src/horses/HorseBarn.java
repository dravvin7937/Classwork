package horses;

public class HorseBarn {

	private Horse[] horses;
	
	public HorseBarn(Horse[] horses) {
		this.horses = horses;
	}

	public int findHorseSpace(String name)
	{
		for (int i = 0; i < this.horses.length; i++)
		{
			if (this.horses[i] != null && name.equals(this.horses[i].getName()))
			{
				return i;
			}
		}
		return -1;
	}
	
	public void consolidate()
	{
		for (int i = 0; i < this.horses.length-1; i++)
		{
			if (this.horses[i] == null)
			{
				for (int j = i+1; j < this.horses.length; j++)
				{
					if (this.horses[j] != null)
					{
						this.horses[i] = this.horses[j];
						this.horses[j] = null;
						j = this.horses.length;
					}
				}
			}
		}
	}
}
