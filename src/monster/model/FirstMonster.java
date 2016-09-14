package monster.model;

public class FirstMonster
{

	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	
	public FirstMonster()
	{
		
		this.name = "no name here";
		this.antennaCount = 2.5;
	    this.eyeCount = 2;
	    this.hasBellyButton = true;
		this.armCount = 6;
		this.noseCount = 2;
	}
	
	public FirstMonster(String name, 
			           double antennaCount, 
			           int eyeCount, 
			           boolean hasBellyButton, 
			           int armCount,
			           int noseCount)
			           
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount; 
		this.noseCount = noseCount;
		
	}
	
	public String toString()
	{
	String description = "Name is " + this.name;
	
	return description;
	}
}

