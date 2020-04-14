
import java.util.ArrayList;
import java.util.List;

public class Rocket 
{
	
	//DECLARING COMMON VARIABLES
    private String model;   
    //---------------------------------------
    
    //DECLARING THE ARRAYLIST OF PROPELLERS
    private List<Propeller>propellers = new ArrayList<Propeller>();;
    //-------------------------------------
   
    
    //GETTER & SETTER FOR THE MODEL
    public String getModel() 
    {
        return model;
    }
    public void setModel(String model) 
   {
        this.model = model;
    }
    //--------------------------

    
    //GETTER & SETTER FOR THE PROPELLER´S ARRAYLIST
    public List<Propeller> getPropellers() 
    {
        return propellers;
    }
    public void setPropellers(List<Propeller> propellers) 
    {
        this.propellers = propellers;
    }
    //---------------------------------------------

   
    //METHOD TO ADD A PROPELLER TO THE ROCKET WITH EXCEPTION
    public void addPropeller(int maxPower) throws Exception 
    {
        Propeller propeller = new Propeller(maxPower);
        this.propellers.add(propeller);

    }
    //------------------------------------------------------
    

   

    //METHOD TO INCREASE POWER
    public void increasePower(int targetPower)
    {
    	for (Propeller propeller : propellers) 
    	{
			propeller.setTargetPower(targetPower);
			Thread thread = new Thread(propeller);
			thread.start();
		}
    }

	@Override
	public String toString() 
	{
		return "Rocket [model=" + model + ", propellers=" + propellers + "]";
	}
    
   
  	

  	
}
