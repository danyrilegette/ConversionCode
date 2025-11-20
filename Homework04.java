//myName: Danyri Legette
import java.util.Scanner;
public class Homework04 {
	
	//converting meters to kilometers
	public static void showKilometers(double meters)
	{
		double kilometers = meters * 0.001;
		System.out.println(meters + " meters is equal to " +kilometers+ " kilometers.");
	}
	
	//converting meters to inches
	public static void showInches(double meters)
	{
		double inches = meters * 39.37;
		System.out.println(meters + " meters is equal to " +inches+ " inches.");
	}
	
		
	//converting meters to feet
		public static void showFeet(double meters)
		{
			double feet = meters * 3.281;
			System.out.println(meters + " meters is equal to " +feet+ " feet.");
			
	}
		
		//main method
		public static void main(String[] args)
		{
			Scanner key = new Scanner(System.in);
			
			System.out.println("Enter a distance in meters: ");
			
			double meters = key.nextDouble();
			
			//valid input
			if(meters < 0)
			{
				System.out.println("Invalid value entered! Exiting the program!");
				System.exit(0); //exits the program
			}
			
			//storing menu selections
			int choice;
			
			//loop to display the menu selection
			
			do
			{
				System.out.println("1. Convert to kilometers");
	            System.out.println("2. Convert to inches");
	            System.out.println("3. Convert to feet");
	            System.out.println("4. Quit the program");
	            System.out.print("Enter your choice (1-4): ");
	            
	            choice = key.nextInt();
			
	            
	            //the user's choice is executed here
	            switch(choice)
	            {
	            case 1:
                    showKilometers(meters);
                    break;
                    
                case 2:
                    showInches(meters); 
                    break;
                    
                case 3:
                    showFeet(meters); 
                    break;
                    
                case 4:
                    System.out.println("Quitting the Program!");
                    break;
                    
                default:
                    System.out.println("Invalid choice! Enter a number between 1 and 4.");
	            }
	            
	          //allows the user to choose until they quit
	            }while(choice != 4);
			
		}
		

}
