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
			if (response == 1 || response == 2 || response == 3)
			{
				displayMenu2(response);
			}
			else if (response == 4)
			{
				return;
			}
			else
			{
				System.out.println("Invalid Input");
				System.out.println("Please Enter Response");
			}
		}
	}
	public static void displayMenu2(int response) {
		//NEED TO ANALYZE THE LOGIN INFORMATION TO DECIDE WHO IS LOGGING IN
		
		Scanner input = new Scanner(System.in);
		int newResponse = input.nextInt();
		System.out.println("Welcome!");
		System.out.println("Please enter your choice:");
   	 	//If the user is a driver show these options
		if(response == 3)
		{
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
		}

   	 	// If the user is a rider show these options
		else if (response == 1 || response == 2)
		{
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
		}
   	 	// If user is admin user show these options
		else {
   	 		// Give awards
			System.out.println("1) Give awards");
   	 		// Exit
			System.out.println("2) Exit");
		}
	}

	
	public static void main(String[] args) {
		System.out.println("Example for cs5530");
		Connector con=null;
		String choice;
		String cname;
		String dname;
		String sql=null;
		int c=0;
        
		/*** SKELETON FOR HOW TO TAKE IN THE USERS' CHOICES ***/
		
		try {
		        	con= new Connector();
		        	System.out.println ("Database connection established");
		 
		        	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		     
			    while(true) {
				    	displayMenu();
				    	while ((choice = in.readLine()) == null && choice.length() == 0);
				    try {
				    		c = Integer.parseInt(choice);
				    }
				    catch (Exception e) {
				    		continue;
				    } 
			        	if (c<1 | c>3)
			        		 continue;
			        	if (c==1)
			        	{
			        		 System.out.println("please enter a cname:");
			        		 while ((cname = in.readLine()) == null && cname.length() == 0);
			    		 System.out.println("please enter a dname:");
			    		 while ((dname = in.readLine()) == null && dname.length() == 0);
			    		 Course course=new Course();
			    		 System.out.println(course.getCourse(cname, dname, con.stmt));
			    	 }
			    	 else if (c==2)
			    	 {	 
			    		 System.out.println("please enter your query below:");
			    		 while ((sql = in.readLine()) == null && sql.length() == 0)
			    			 System.out.println(sql);
			    		 ResultSet rs=con.stmt.executeQuery(sql);
			    		 ResultSetMetaData rsmd = rs.getMetaData();
			    		 int numCols = rsmd.getColumnCount();
			    		 while (rs.next())
			    		 {
			    			 //System.out.print("cname:");
			    			 for (int i=1; i<=numCols;i++)
			    				 System.out.print(rs.getString(i)+"  ");
			    			 System.out.println("");
			    		 }
			    		 System.out.println(" ");
			    		 rs.close();
			    	 }
			    	 else
			    	 {   
			    		 System.out.println("EoM");
			         con.stmt.close(); 
			         break;
			     }
		     }
		}
		catch (Exception e)
		{
		   	e.printStackTrace();
		    	System.err.println ("Either connection error or query execution error!");
		}
		finally
		{
		  	if (con != null)
		    	{
		    		try
		    		{
		    			con.closeConnection();
		    			System.out.println ("Database connection terminated");
		    		}
		    		catch (Exception e) { /* ignore close errors */ }
		    	}	 
		}
	}
}
