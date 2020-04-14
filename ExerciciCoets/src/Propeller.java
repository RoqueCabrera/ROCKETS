public class Propeller implements Runnable
{
	private static int COUNTER =1;
	
	//LOCAL VARIABLES OF THE PROPELLER
	private int propellerId;
    private int currentPower;
    private int maxPower;
    private int targetPower;
    private boolean powerValue = false;
    //--------------------------------
    
        
    //CREATING THE BUILDER OF THE PROPELLER
    public Propeller(int maxPower) throws Exception 
    {
    	this.propellerId = COUNTER;
    	COUNTER++;
        this.currentPower = 0;
        this.targetPower = 0;
        
        if (maxPower <= 0)
            throw new Exception("The value cannot be negative");
        this.maxPower = maxPower;
    }
    //-------------------------------------
    
    
    //GETTTER FOR CURRENT POWER
    public int getCurrentPower() 
    {
        return currentPower;
    }
    //-----------------------------
    
    //GETTER & SETTER FOR TARGET POWER
    public int getTargetPower() 
    {
		return targetPower;
	}
	public void setTargetPower(int targetPower) 
	{
		if(targetPower>maxPower)
		{
			this.targetPower = maxPower;
			powerValue = true;
		}
		else
		{
			this.targetPower = targetPower;
			powerValue = false;
		}
	}
	//----------------------------
	

	//GETTER & SETTER FOR MAXIMUM POWER (WITH EXCEPTION IF NEGATIVE)
    public int getMaxPower() 
    {
        return maxPower;
    }
    public void setMaxPower(int maxPower) throws Exception 
    {
    	if (maxPower <= 0)
    	{
            throw new Exception("Not a valid number");
    	}
        this.maxPower = maxPower;
    }
    //--------------------------------------------------------------
    
              
    //METHOD TOSTRING TO SHOW THE COMPLETE IDENITY OF THE PROPELLER
	@Override
	public String toString() 
	{
		return "Propeller [id=" + propellerId + ", currentPower=" + currentPower + ", maxPower=" + maxPower + ", targetPower="
				+ targetPower + ", propellerOn=" + "]";
	}
	//------------------------------------------------------------
	
	
	//METHOD TO START THE SEQUENCE WITH 3 SECONDS DELAY BETWEEN STEPS
	@Override
	public void run() 
	{
		try 
		{
			if(currentPower < targetPower)
			{
				do 
				{
					currentPower++;
					System.out.println("PROPELLERID: " + propellerId + " POWER: " + currentPower + " TARGET: " + targetPower);
					Thread.sleep(500);
				} 
				while (currentPower != targetPower);				
				
				if(powerValue = true)
				{
					System.out.println("ID: " + propellerId + " couldn´t reach target power.");
				}
				else
				{
					System.out.println("ID: " + propellerId + " reached target power.");
				}
			}
			else if(currentPower > targetPower)
			{
				do 
				{
					currentPower--;
					System.out.println("PROPELLERID: " + propellerId + " POWER: " + currentPower + " TARGET: " + targetPower);
					Thread.sleep(500);
				} 
				while (currentPower != targetPower);
				System.out.println("PROPELLERID: " + propellerId + " reached target power.");
			}
			else
			{
				System.out.println("The propeller has reached its maxium power.");
			}
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//-------------------------------------------------------------

	
	
    
    
}