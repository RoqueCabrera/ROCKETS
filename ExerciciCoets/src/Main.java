import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) throws Exception
    {
		
		Scanner sc = new Scanner(System.in);
		String decreasePower;
		
    	//CREATING ROCKET1
        Rocket rocket1 = new Rocket();
        rocket1.setModel("32WESSDS");
        rocket1.addPropeller(10);
        rocket1.addPropeller(30);
        rocket1.addPropeller(50);
        //----------------
        
       
        //CREATING ROCKET2
        Rocket rocket2 = new Rocket();
        rocket2.setModel("LDSFJA32");
        rocket2.addPropeller(30);
        rocket2.addPropeller(40);
        rocket2.addPropeller(50);
        rocket2.addPropeller(50);
        rocket2.addPropeller(30);
        rocket2.addPropeller(10);
        //----------------
        
        System.out.println(rocket1);
        System.out.println(rocket2);

        
        System.out.println("----------------");
        System.out.println("START ENGINES");
        System.out.println("---------------");
        
        rocket1.increasePower(29);
        System.out.println("Press any key  to slow down.");
        decreasePower = sc.next();
        if (!decreasePower.isEmpty())
        {
            rocket1.increasePower(3);
        }
       

        


       /*//THE RACE!!       
        //PHASE 1        
        //STARTING THE RACE
        System.out.println("WELCOME TO THE ROCKET RACE!");
  		System.out.println("===========================");
  		System.out.println(".");
  		//-----------------
  		
  		//PHASE 2
  		//SHOWING THE ROCKETS
  		System.out.println("THE ROCKETS ARE IN POSITION!");
		System.out.println("ROCKET1: " + rocket1.getModel() + " PROPELLER NUMBER: " + rocket1.getPropellerNumber() + " MAX POWER: " + rocket1.getMaxPower());
		System.out.println("ROCKET2: " + rocket2.getModel() + " PROPELLER NUMBER: " + rocket2.getPropellerNumber() + " MAX POWER: " + rocket2.getMaxPower());
		//-------------------
		
  		System.out.println("THE RACE IS ABOUT TO BEGIN...");
  		System.out.println(".");
  		  		  		
  		//PHASE 3		
  		System.out.println("THE ENGINES ARE ON...");
  		System.out.println(".");
  			
  		//SHOWING THE POWER OF THE ROCKETS
  		System.out.println("ROCKET1´S POWER IS: " + rocket1.getCurrentPower());
  		System.out.println("ROCKET2´S POWER IS: " + rocket2.getCurrentPower());
  		//----------------------------
  		
  		//PHASE 4
  		System.out.println("3");	
  		System.out.println("2");	
  		System.out.println("1");	
  		System.out.println("THE RACE HAS STARTED!!");
  		System.out.println(".");
  		
  		//INCREASING POWER OF BOTH ROCKETS
  		rocket1.increasePower(2);
  		rocket2.increasePower(2);
  		//--------------------------------
  		
  		//PHASE 5
  		System.out.println("BOTH ROCKETS START WITH THE SAME POWER, BUT ROCKET2 HAS THE ADVANTAGE!");
  		System.out.println("ROCKET1´S POWER IS: " + rocket1.getCurrentPower());
  		System.out.println("ROCKET2´S POWER IS: " + rocket2.getCurrentPower());
  		System.out.println(".");
  		
  		//INCREASING THE POWER OF ROCKET1 AND DECREASING ROCKET2
  		rocket1.increasePower(4);
  		rocket2.decreasePower(3);
  		//------------------------------------------------------
  		
  		//PHASE 6
  		System.out.println("OH NO! ROCKET2´S ENGINES HAVE COMPLETELY STOPPED");
  		System.out.println("ROCKET1´S POWER IS: " + rocket1.getCurrentPower());
  		System.out.println("ROCKET2´S POWER IS: " + rocket2.getCurrentPower());
  		System.out.println(".");
  		
  		//INCREASING POWER OF BOTH ROCKETS
  		rocket1.increasePower(4);
  		rocket2.increasePower(3);
  		//--------------------------------

  		//PHASE 7
  		System.out.println("ROCKET1 HAS ALREADY REACHED MAXIMUM POWER AND ROCKET2 IS PUSHING HARD!");
  		System.out.println("ROCKET1´S POWER IS: " + rocket1.getCurrentPower());
  		System.out.println("ROCKET2´S POWER IS: " + rocket2.getCurrentPower());
  		System.out.println(".");
  		
  		//INCREASING POWER OF BOTH ROCKETS
  		rocket1.increasePower(20);
  		rocket2.increasePower(20);
  		//--------------------------------
  		
  		//PHASE 8
  		//FINISHING THE RACE
  		System.out.println("AND OBVIOUSLY ROCKET2 WINS BECAUSE OF ALL THE ENERGY SPENT!");
 		System.out.println("ROCKET1´S POWER IS: " + rocket1.getCurrentPower());
  		System.out.println("ROCKET2´S POWER IS: " + rocket2.getCurrentPower());
  		System.out.println(".");
  		System.out.println("WHAT A CRAZY RACE!");
  		//------------------      
  		//----------
  		
        rocket2.startRace();
        rocket1.startRace();
        rocket2.stopRace();
        rocket1.stopRace();*/
        
        
    }
}