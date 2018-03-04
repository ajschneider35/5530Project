package cs5530;


import java.lang.*;
import java.sql.*;
import java.io.*;
import java.util.Scanner;

public class testdriver2 {

	/**
	 * @param args
	 */
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
		int response = input.nextInt();
		
		while (response != 1 || response != 2 || response != 3 || response != 4) {
			
			/* SWITCH CASE SHOULD BE OUTSIDE OF THIS WHILE LOOP, 
			 * IF IT IS INSIDE THE RESPONSE WILL NEVER BE EQUAL TO ANY OF THE CASES.
			 * THE WAY YOU HAVE IT RIGHT NOW, IF THEY ENTER A VALID INPUT THEN NOTHING WILL HAPPEN. */
			
			/* THIS WHILE LOOP WILL INFINITELY LOOP BECAUSE YOU NEVER ASK THEM FOR A NEW INPUT INSIDE
			 * OF THE LOOP. THAT IS WHAT SHOULD BE IN HERE INSTEAD OF THE SWITCH CASE. SEE MY CODE WHERE
			 * I DO THIS EXACT SAME THING FOR INPUTS. */
			
			switch (response)
			{
			case 1:
				displayMenu2(response);
				break;
			case 2:
				displayMenu2(response);
				break;
			case 3: 
				displayMenu2(response);
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
	}
	public static void displayMenu2(int response) {
		/* YOU NEED TO CALL THE METHODS RELATED TO THE CHOICE THEY PICKED IN THE FIRST MENU, 
		 * NOT DISPLAY A NEW MENU YET */
		
		/* FOLLOWING THOSE METHOD CALLS, THEN YOU NEED TO DETERMINE WHAT TYPE OF USER THEY ARE
		 * BASED ON WHAT IS RETURNED FROM THOSE METHODS */
		
		/* THEN DISPLAY THE MENU RELATED TO WHO THEY ARE AS A USER... */
		
		int type = response;
		
		//Decide what to do afterword
		Scanner input = new Scanner(System.in);
		int newResponse;
		switch(type)
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
   	 		// Exit
			System.out.println("5) Exit");
			 newResponse = input.nextInt();
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
   	 		// Exit
			System.out.println("9) Exit");
			newResponse = input.nextInt();
			break;
		//If user is an admin
		case 3:
			System.out.println("Welcome Admin!");
			System.out.println("Please enter your choice:");
   	 		// Give awards
			System.out.println("1) Give awards");
   	 		// Exit
			System.out.println("2) Exit");
			newResponse = input.nextInt();
			break;
		default: 
			System.out.println("User not recognized in system.");
		}
	}

	
	public static void main(String[] args) {
//		Connector con=null;
//		String choice;
//		String cname;
//		String dname;
//		String sql=null;
//		int c=0;
		displayMenu();
        
		/*** SKELETON FOR HOW TO TAKE IN THE USERS' CHOICES ***/
//		
//		try {
//		        	con= new Connector();
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
//		}
//		catch (Exception e)
//		{
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
//		}
	}
}
