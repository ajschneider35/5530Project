/**
 * Class of static methods to perform general operations that a UUser UDriver or admin account would need to accomplish.
 * 
 * @author Andrew Schneider, u0881917
 */

package cs5530;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class GeneralOperations {
	public GeneralOperations()
	{}
	
	/*** EXAMPLE METHOD ***/
	/*** CREATE METHODS USING THIS SKELETON FOR OPERATIONS THAT CAN BE PERFORMED BY BOTH USERS AND DRIVERS
	 * * AS WELL AS ANY GENERAL OPERATIONS THAT ARE NEEDED TO BE COMPLETED ***/
	
	public String getCourse(String cname, String dname, Statement stmt) {
		
		String sql="select * from course where cname like '%"+cname+"%' and dname like '%"+dname+"%'";
		String output="";
		ResultSet rs=null;
		 	System.out.println("executing "+sql);
		 	try{
   		 	rs=stmt.executeQuery(sql);
   		 	while (rs.next())
			 {
				//System.out.print("cname:");
			        output+=rs.getString("cname")+"   "+rs.getString("dname")+"\n"; 
			 }
		     
		     rs.close();
		 	}
		 	catch(Exception e)
		 	{
		 		System.out.println("cannot execute the query");
		 	}
		 	finally
		 	{
		 		try{
   		 		if (rs!=null && !rs.isClosed())
   		 			rs.close();
		 		}
		 		catch(Exception e)
		 		{
		 			System.out.println("cannot close resultset");
		 		}
		 	}
	    return output;
	}
	
	/**
	 *  Method to login to the UUber system
	 */
	public static String login(Statement stmt) {
		
		String username;
		String password;
		Scanner s = new Scanner(System.in);
		
		// Ask user for their username
		System.out.println("Username: ");
		username = s.nextLine();
		
		// Ask user for their password
		System.out.println("Password: ");
		password = s.nextLine();
		
		// TODO: Build the sql query for the db
		String sql="";
		
		// Output of the query to the db
		String output="";
		
		// Let the console know what query is being executed
		System.out.println("executing "+sql);
		
		// Result set for the query
		ResultSet rs = null;
		
		// Execution of the query
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// TODO: Add rs strings to the output
				// output+=rs.getString("cname")+"   "+rs.getString("dname")+"\n";
			}
			
			rs.close();
		}
		catch (Exception e) {
			
			System.out.println("ERROR: Cannot execute query for adding a new car.");
		}
		finally {
			
			try {
				
				if(rs != null || !rs.isClosed()) {
					
					rs.close();
				}
			}
			catch (Exception e) {
				
				System.out.println("ERROR: Cannot close the result set.");
			}
		}
		
		return output + "\n\nYou have successfully logged in!";
	}
	
	/**
	 *  Method to sign up a user for the UUber system
	 */
	public static String signUpUser(Statement stmt) {
		
		String username;
		String password;
		String address;
		String phoneNumber;
		Scanner s = new Scanner(System.in);
		
		// Ask user for their username
		System.out.println("Username: ");
		username = s.nextLine();
		
		// Ask user for their password
		System.out.println("Password: ");
		password = s.nextLine();
		
		// Ask user for their address
		System.out.println("Address: ");
		password = s.nextLine();
		
		// Ask user for their password
		System.out.println("Phone Number: ");
		password = s.nextLine();
		
		// TODO: Build the sql query for the db
		String sql="";
		
		// Output of the query to the db
		String output="";
		
		// Let the console know what query is being executed
		System.out.println("executing "+sql);
		
		// Result set for the query
		ResultSet rs = null;
		
		// Execution of the query
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// TODO: Add rs strings to the output
				// output+=rs.getString("cname")+"   "+rs.getString("dname")+"\n";
			}
			
			rs.close();
		}
		catch (Exception e) {
			
			System.out.println("ERROR: Cannot execute query for adding a new car.");
		}
		finally {
			
			try {
				
				if(rs != null || !rs.isClosed()) {
					
					rs.close();
				}
			}
			catch (Exception e) {
				
				System.out.println("ERROR: Cannot close the result set.");
			}
		}
		
		return output + "\n\nYou have successfully signed up!";
	}
	
	/**
	 *  Method to sign up a driver for the UUber system
	 */
	public static String signUpDriver(Statement stmt) {
		
		String username;
		String password;
		String address;
		String phoneNumber;
		int uploadChoice;
		String photoPathToFile;
		Scanner s = new Scanner(System.in);
		
		// Ask user for their username
		System.out.println("Username: ");
		username = s.nextLine();
		
		// Ask user for their password
		System.out.println("Password: ");
		password = s.nextLine();
		
		// Ask user for their address
		System.out.println("Address: ");
		password = s.nextLine();
		
		// Ask user for their password
		System.out.println("Phone Number: ");
		password = s.nextLine();
		
		// Ask user if they would like to upload a photo
		System.out.println("Would you like to upload a profile picture for your account?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		System.out.println("Enter Choice #: ");
		uploadChoice = s.nextInt();
		
		// Keep asking for input until sortChoice is a valid choice
		while (uploadChoice != 1 && uploadChoice != 2) {
			System.out.println("Invalid Input");
			System.out.println("Enter Choice #: ");
			uploadChoice = s.nextInt();
		}
		
		// If they decide to upload a photo
		if(uploadChoice == 1) {
			// Ask for the path to the file
			System.out.println("Enter Path to Image File: ");
			photoPathToFile = s.nextLine();
		}
		
		// TODO: Figure out how to get filepath to photoblob
		
		// TODO: Build the sql query for the db
		String sql="";
		
		// Output of the query to the db
		String output="";
		
		// Let the console know what query is being executed
		System.out.println("executing "+sql);
		
		// Result set for the query
		ResultSet rs = null;
		
		// Execution of the query
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// TODO: Add rs strings to the output
				// output+=rs.getString("cname")+"   "+rs.getString("dname")+"\n";
			}
			
			rs.close();
		}
		catch (Exception e) {
			
			System.out.println("ERROR: Cannot execute query for adding a new car.");
		}
		finally {
			
			try {
				
				if(rs != null || !rs.isClosed()) {
					
					rs.close();
				}
			}
			catch (Exception e) {
				
				System.out.println("ERROR: Cannot close the result set.");
			}
		}
		
		return output + "\n\nYou have successfully signed up!";
	}
	
	/**
	 *  Method to update the details of a car by request from a Driver User
	 */
	public static String browseCars(String city, String state, String keyphrase, int sortChoice, Statement stmt) {
		
		String sortString = "";
		
		switch(sortChoice) {
			case 1:
				// TODO: ORDER BY feedback ratings in the query
				// sortString =
				break;
			case 2:
				// TODO: ORDER BY trusted users feedback ratings only in the query
				// sortString =
				break;
		}
		
		// TODO: Build the sql query for the db
		// Append the sortString on the end of the query
		String sql="";
		
		// Output of the query to the db
		String output="";
		
		// Let the console know what query is being executed
		System.out.println("executing "+sql);
		
		// Result set for the query
		ResultSet rs = null;
		
		// Execution of the query
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// TODO: Add rs strings to the output
				// output+=rs.getString("cname")+"   "+rs.getString("dname")+"\n";
			}
			
			rs.close();
		}
		catch (Exception e) {
			
			System.out.println("ERROR: Cannot execute query for adding a new car.");
		}
		finally {
			
			try {
				
				if(rs != null || !rs.isClosed()) {
					
					rs.close();
				}
			}
			catch (Exception e) {
				
				System.out.println("ERROR: Cannot close the result set.");
			}
		}
		
		return output;
	}
	
	public static String howToBrowseCars(Statement stmt) {
		
		String city;
		String state;
		String keyphrase;
		int sortChoice;
		Scanner s = new Scanner(System.in);
		
		// Ask how the user wants to browse through the cars
		System.out.println("Cars can be searched for by City, State, or a keyphrase included in the type of the vehicle.");
		System.out.println("If you would not like to browse using one or more of the criteria, simply press return when prompted for the criteria.");
		
		// Enter City
		System.out.println("Enter City: ");
		city = s.nextLine();
		System.out.println("\n");
		
		// Enter State
		System.out.println("Enter State: ");
		state = s.nextLine();
		System.out.println("\n");
		
		// Enter Keyword included in type of car
		System.out.println("Enter Keyphrase: ");
		keyphrase = s.nextLine();
		System.out.println("\n");
		
		// Ask how they want the results sorted
		System.out.println("How do you want to sort the results?");
		System.out.println("1) By average feedback ratings");
		System.out.println("2) By average score of trusted users' feedback ratings");
		System.out.println("Enter Choice #: ");
		sortChoice = s.nextInt();
		
		// Keep asking for input until sortChoice is a valid choice
		while (sortChoice != 1 && sortChoice != 2) {
			System.out.println("Invalid Input");
			System.out.println("Enter Choice #: ");
			sortChoice = s.nextInt();
		}
		System.out.println("\n");
		
		return browseCars(city, state, keyphrase, sortChoice, stmt);
	}
	
	/**
	 *  Method to sign up a user for the UUber system
	 */
	public static String getStatistics(Statement stmt) {
		
		
		Scanner s = new Scanner(System.in);
		
		// TODO: Build the sql query for the db
		String sql="";
		
		// Output of the query to the db
		String output="";
		
		// Let the console know what query is being executed
		System.out.println("executing "+sql);
		
		// Result set for the query
		ResultSet rs = null;
		
		// Execution of the query
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// TODO: Add rs strings to the output
				// output+=rs.getString("cname")+"   "+rs.getString("dname")+"\n";
			}
			
			rs.close();
		}
		catch (Exception e) {
			
			System.out.println("ERROR: Cannot execute query for adding a new car.");
		}
		finally {
			
			try {
				
				if(rs != null || !rs.isClosed()) {
					
					rs.close();
				}
			}
			catch (Exception e) {
				
				System.out.println("ERROR: Cannot close the result set.");
			}
		}
		
		return output + "\n\nYou have successfully signed up!";
	}
}
