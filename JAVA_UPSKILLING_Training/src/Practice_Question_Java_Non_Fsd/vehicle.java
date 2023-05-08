package Practice_Question_Java_Non_Fsd;

public class vehicle {
	  
		  void run()
		  {System.out.println("Vehicle is running");}  
		}  
		  
		class Bike extends vehicle{  
		    
			  void run()
			  {
				  System.out.println("Bike is running safely");}  
			  public static void main(String args[]){ 
		  vehicle obj = new Bike();  
		   
		  obj.run();  
		  }  
		}  
