package cs5530;


import java.lang.*;
import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class testdriver2 {

	/**
	 * @param args
	 */
	private static Connector con;
	public static void displayMenu()
	{	
		// Represent this with a switch case that takes in a number to decide which menu to show for the user
    	 	// Keep track of what type of user the user is
		
	    	/*** LIST OF THINGS TO INCLUDE IN OUR MENU ***/
	    	 
		Scanner input = new Scanner(System.in);
	    	/*** MENU 1 ***/
		System.out.println("        Welcome to UUber System     ");
		System.out.println("1) Login");
		System.out.println("2) Sign Up");
		System.out.println("3) Sign Up as Driver");
		System.out.println("4) Quit");
		
		while(!input.hasNextInt())
		{
			System.out.println("Incorrect Input. Please try again.");
			input.next();
		}
		
		int response = input.nextInt();

		
		while (response != 1 && response != 2 && response != 3 && response != 4) {
			//Integer wasn't correct
			if (response != 1 && response != 2 && response != 3 && response != 4) {
				System.out.println("Incorrect Input. Please try again.");
			}
			while(!input.hasNextInt())
			{
				System.out.println("You didn't enter an integer. Please try again.");
				input.next();
			}
			response = input.nextInt();
		}

			switch (response)
			{
			case 1:
				displayMenu2(response);
				break;
			case 2:
				GeneralOperations.signUpUser(input, con.stmt);
				break;
			case 3: 
				GeneralOperations.signUpDriver(input, con.stmt);
				break;
			case 4:
				System.out.println("Goodbye!");
				return;
			default: 
				System.out.println("Invalid Input");
				System.out.println("Please Enter Response");
				return;
			}
	}
	public static void displayMenu2(int response) {
		/* YOU NEED TO CALL THE METHODS RELATED TO THE CHOICE THEY PICKED IN THE FIRST MENU, 
		 * NOT DISPLAY A NEW MENU YET */
		
		/* FOLLOWING THOSE METHOD CALLS, THEN YOU NEED TO DETERMINE WHAT TYPE OF USER THEY ARE
		 * BASED ON WHAT IS RETURNED FROM THOSE METHODS */
		
		/* THEN DISPLAY THE MENU RELATED TO WHO THEY ARE AS A USER... */
		
		GeneralOperations.login(input, con.stmt);
		
				
		//Decide what to do afterword
		Scanner input = new Scanner(System.in);
		int newResponse = 0;
		switch(response)
		{
		//If user is a driver
		case 1: 
			System.out.println("Welcome Driver!");
			System.out.println("Please enter your choice:");
  	 		// Add new car
			System.out.println("1) Add new car");
   	 		// Update car details
			System.out.println("2) Car Details");
   	 		// Browse cars
			System.out.println("3) Browse Cars");
   	 		// Statistics
			System.out.println("4) Statistics");
			// Degree of separation
			System.out.println("5) Degree Of Separation");
   	 		// Exit
			System.out.println("6) Exit");
			checkAnswer(newResponse, input);
			newResponse = input.nextInt();
			parseDriverAnswer(newResponse);

			break;
		//If user is a rider
		case 2:
			System.out.println("Welcome Rider!");
			System.out.println("Please enter your choice:");
   	 		// Reserve Car
			System.out.println("1) Reserve Car");
   	 		// Log a ride
			System.out.println("2) Log a Ride");
   	 		// Give feedback on car
			System.out.println("3) Give Feedback on Ride");
   	 		// Get useful feedbacks
			System.out.println("4) Give Useful Feedbacks");
   	 		// Update trusted users
			System.out.println("5) Update Trusted Users");
   	 		// Update favorite car to hire
			System.out.println("6) Update Favorite Car");
   	 		// Browse cars
			System.out.println("7) Browse Cars");
   	 		// Statistics
			System.out.println("8) Statistics");
			// Degree of separation
			System.out.println("9) Degree Of Separation");
   	 		// Exit
			System.out.println("10) Exit");
			checkAnswer(newResponse, input);
			newResponse = input.nextInt();
			parseRiderAnswer(newResponse);

			break;
		//If user is an admin
		case 3:
			System.out.println("Welcome Admin!");
			System.out.println("Please enter your choice:");
   	 		// Give awards
			System.out.println("1) Give awards");
   	 		// Exit
			System.out.println("2) Exit");
			checkAnswer(newResponse, input);
			newResponse = input.nextInt();
			parseAdminAnswer(newResponse);

			break;
		}
	}
	
	public static void checkAnswer(int response, Scanner input)
	{
		while(!input.hasNextInt())
		{
			System.out.println("Incorrect Input. Please try again.");
			input.next();
		}
	}
	
	public static void parseDriverAnswer(int newResponse)
	{
		Scanner input = new Scanner(System.in);
		
		while (newResponse != 1 && newResponse != 2 && newResponse != 3 && newResponse != 4 && newResponse != 5 && newResponse != 6) {
			//Integer wasn't correct
			if (newResponse != 1 && newResponse != 2 && newResponse != 3 && newResponse != 4 && newResponse != 5 && newResponse != 6) {
				System.out.println("Incorrect Input. Please try again.");
			}
			while(!input.hasNextInt())
			{
				System.out.println("You didn't enter an integer. Please try again.");
				input.next();
			}
			newResponse = input.nextInt();
		}

			switch (newResponse)
			{
			case 1:
				UDOperations.addNewCar(con.stmt);


				break;
			case 2:
				UDOperations.updateCarDetails(con.stmt);


				break;
			case 3: 
				GeneralOperations.howToBrowseCars(con.stmt);


				break;
			case 4: 
				GeneralOperations.getStatistics(con.stmt);


				break;			
			case 5: 
				GeneralOperations.getDegreeOfSeparation(con.stmt);


				break;
			case 6:
				System.out.println("Goodbye!");
				return;
			}
	}
	public static void parseRiderAnswer(int newResponse)
	{
		Scanner input = new Scanner(System.in);
		
		while (newResponse != 1 && newResponse != 2 && newResponse != 3 && newResponse != 4 && newResponse != 5 && newResponse != 6 && newResponse != 7 && newResponse !=  8 && newResponse != 9 && newResponse != 10) {
			//Integer wasn't correct
			if (newResponse != 1 && newResponse != 2 && newResponse != 3 && newResponse != 4 && newResponse != 5 && newResponse != 6 && newResponse != 7 && newResponse !=  8 && newResponse != 9 && newResponse != 10) {
				System.out.println("Incorrect Input. Please try again.");
			}
			while(!input.hasNextInt())
			{
				System.out.println("You didn't enter an integer. Please try again.");
				input.next();
			}
			newResponse = input.nextInt();
		}

			switch (newResponse)
			{
			case 1:
				UUOperations.reserveCar(con.stmt);


				break;
			case 2:
				UUOperations.logARide(con.stmt);


				break;
			case 3: 
				UUOperations.giveFeedback(con.stmt);


				break;
			case 4: 
				UUOperations.getUsefulFeedbacks(con.stmt);


				break;
			case 5: 
				UUOperations.updateTrustedUsers(con.stmt);


				break;
			case 6: 
				UUOperations.updateFavoriteCar(con.stmt);


				break;
			case 7: 
				GeneralOperations.howToBrowseCars(con.stmt);

				break;
			case 8: 
				GeneralOperations.getStatistics(con.stmt);
				break;
			case 9: 
				GeneralOperations.getDegreeOfSeparation(con.stmt);
				break;
			case 10:
				System.out.println("Goodbye!");
				return;
			}
	}
	public static void parseAdminAnswer(int newResponse)
	{
		Scanner input = new Scanner(System.in);
		
		while (newResponse != 1 && newResponse != 2) {
			//Integer wasn't correct
			if (newResponse != 1 && newResponse != 2) {
				System.out.println("Incorrect Input. Please try again.");
			}
			while(!input.hasNextInt())
			{
				System.out.println("You didn't enter an integer. Please try again.");
				input.next();
			}
			newResponse = input.nextInt();
		}

			switch (newResponse)
			{
			case 1:
				GeneralOperations.getAdminAwards(con.stmt);
				break;
			case 2:
				System.out.println("Goodbye!");
				break;
			}
	}
	public static void main(String[] args) {
//		Connector con=null;
//		String choice;
//		String cname;
//		String dname;
//		String sql=null;
//		int c=0;
        
		/*** SKELETON FOR HOW TO TAKE IN THE USERS' CHOICES ***/
//		
	try {
		//con= new Connector();
		displayMenu();

//		        	System.out.println ("Database connection established");
//		 
//		        	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
//		     
//			    while(true) {
//				    	displayMenu();
//				    	while ((choice = in.readLine()) == null && choice.length() == 0);
//				    try {
//				    		c = Integer.parseInt(choice);
//				    }
//				    catch (Exception e) {
//				    		continue;
//				    } 
//			        	if (c<1 | c>3)
//			        		 continue;
//			        	if (c==1)
//			        	{
//			        		 System.out.println("please enter a cname:");
//			        		 while ((cname = in.readLine()) == null && cname.length() == 0);
//			    		 System.out.println("please enter a dname:");
//			    		 while ((dname = in.readLine()) == null && dname.length() == 0);
//			    		 Course course=new Course();
//			    		 System.out.println(course.getCourse(cname, dname, con.stmt));
//			    	 }
//			    	 else if (c==2)
//			    	 {	 
//			    		 System.out.println("please enter your query below:");
//			    		 while ((sql = in.readLine()) == null && sql.length() == 0)
//			    			 System.out.println(sql);
//			    		 ResultSet rs=con.stmt.executeQuery(sql);
//			    		 ResultSetMetaData rsmd = rs.getMetaData();
//			    		 int numCols = rsmd.getColumnCount();
//			    		 while (rs.next())
//			    		 {
//			    			 //System.out.print("cname:");
//			    			 for (int i=1; i<=numCols;i++)
//			    				 System.out.print(rs.getString(i)+"  ");
//			    			 System.out.println("");
//			    		 }
//			    		 System.out.println(" ");
//			    		 rs.close();
//			    	 }
//			    	 else
//			    	 {   
//			    		 System.out.println("EoM");
//			         con.stmt.close(); 
//			         break;
//			     }
//		     }
	}
	catch (Exception e)
	{
//		   	e.printStackTrace();
//		    	System.err.println ("Either connection error or query execution error!");
//		}
//		finally
//		{
//		  	if (con != null)
//		    	{
//		    		try
//		    		{
//		    			con.closeConnection();
//		    			System.out.println ("Database connection terminated");
//		    		}
//		    		catch (Exception e) { /* ignore close errors */ }
//		    	}	 
	}
	}
}
