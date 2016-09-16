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
	
	public String getName()
	{
		return name;
	}
	public double getantennaCount()
	{
		return antennaCount;
	}
    public int getEyeCount()
    {
	return eyeCount;
    }
    public boolean gethasBellyButton()
    {
    	return hasBellyButton;
    }
    public int getarmCount()
    {
    	return armCount;
    	
    	}
    public int getnoseCount()
    {
    	return noseCount;
    }
    public void setName(String name)			
    {
      this.name = name;
    }
    
      public void setantennaCount(int eyeCount)	
      {
         this.antennaCount = antennaCount;  
      }
       public void setEyeCount(int eyeCount)
      { 
         this.eyeCount = eyeCount;
    	  
      }
      
    	  
       public void sethasBellyButton(boolean hasBellyButton)
      
      {
         this.hasBellyButton = hasBellyButton;
    	  
      }
    	public void setarmCount(int armCount)
    	  
      {
    	  this.armCount = armCount;
      }
    	public void setnoseCount(int noseCount)
    	
    	{
    	  this.noseCount = noseCount;
    	}  
      
}


