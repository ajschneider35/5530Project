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
		System.out.println("\n");
		/*
		// Ask user for their password
		System.out.println("Password: ");
		password = s.nextLine();
		System.out.println("\n");
		*/
		s.close();
		
		// TODO: Build the sql query for the db
		String sql="select login from uu where login='" + username + "'";
		
		// Output of the query to the db
		String output="";
		
		// Let the console know what query is being executed
		System.out.println("Executing "+sql);
		
		// Result set for the query
		ResultSet rs = null;
		
		// Execution of the query
		try {
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				// TODO: Add rs strings to the output
				output+=rs.getString("login") + "\n";
			}
			
			rs.close();
		}
		catch (Exception e) {
			
			System.out.println("ERROR: Cannot execute query for logging into the system.");
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
		System.out.println("\n");
		
		// Ask user for their password
		System.out.println("Password: ");
		password = s.nextLine();
		System.out.println("\n");
		
		// Ask user for their address
		System.out.println("Address: ");
		password = s.nextLine();
		System.out.println("\n");
		
		// Ask user for their password
		System.out.println("Phone Number: ");
		password = s.nextLine();
		System.out.println("\n");
		
		s.close();
		
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
			
			System.out.println("ERROR: Cannot execute query for signing up a user.");
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
		
		return output + "\n\nYou have successfully signed up as a user!";
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
		System.out.println("\n");
		
		// Ask user for their password
		System.out.println("Password: ");
		password = s.nextLine();
		System.out.println("\n");
		
		// Ask user for their address
		System.out.println("Address: ");
		password = s.nextLine();
		System.out.println("\n");
		
		// Ask user for their password
		System.out.println("Phone Number: ");
		password = s.nextLine();
		System.out.println("\n");
		
		// Ask user if they would like to upload a photo
		System.out.println("Would you like to upload a profile picture for your account?");
		System.out.println("1) Yes");
		System.out.println("2) No");
		System.out.println("Enter Choice #: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		uploadChoice = s.nextInt();
		System.out.println("\n");
		
		// Keep asking for input until sortChoice is a valid choice
		while (uploadChoice != 1 && uploadChoice != 2) {
			System.out.println("Invalid Input");
			System.out.println("Enter Choice #: ");
			while(!s.hasNextInt()) {
			    s.next();
			}
			uploadChoice = s.nextInt();
			System.out.println("\n");
		}
		
		// If they decide to upload a photo
		if(uploadChoice == 1) {
			// Ask for the path to the file
			System.out.println("Enter Path to Image File: ");
			photoPathToFile = s.nextLine();
			System.out.println("\n");
		}
		
		// TODO: Figure out how to get filepath to photoblob
		
		s.close();
		
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
			
			System.out.println("ERROR: Cannot execute query for signing up as a driver.");
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
		
		return output + "\n\nYou have successfully signed up as a Driver!";
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
			
			System.out.println("ERROR: Cannot execute query for browsing for cars.");
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
		while(!s.hasNextInt()) {
		    s.next();
		}
		sortChoice = s.nextInt();
		System.out.println("\n");
		
		// Keep asking for input until sortChoice is a valid choice
		while (sortChoice != 1 && sortChoice != 2) {
			System.out.println("Invalid Input");
			System.out.println("Enter Choice #: ");
			while(!s.hasNextInt()) {
			    s.next();
			}
			sortChoice = s.nextInt();
			System.out.println("\n");
		}
		
		s.close();
		
		return browseCars(city, state, keyphrase, sortChoice, stmt);
	}
	
	/**
	 *  Method to get statistics related to the UUber System
	 */
	public static String getStatistics(Statement stmt) {
		
		int statsChoice;
		int m;
		Scanner s = new Scanner(System.in);
		
		// Ask the user which statistics they would like to see
		System.out.println("What statistics would you like to see?");
		System.out.println("1) Most Popular Cars");
		System.out.println("2) Most Expensive Rides");
		System.out.println("3) Highest Rated Drivers");
		System.out.println("Enter Choice #: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		statsChoice = s.nextInt();
		System.out.println("\n");
		
		// Keep asking for input until sortChoice is a valid choice
		while (statsChoice != 1 && statsChoice != 2 && statsChoice != 3) {
			System.out.println("Invalid Input");
			System.out.println("Enter Choice #: ");
			while(!s.hasNextInt()) {
			    s.next();
			}
			statsChoice = s.nextInt();
			System.out.println("\n");
		}
		
		System.out.println("What number of the top results would you like to see?");
		System.out.println("Enter #: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		m = s.nextInt();
		System.out.println("\n");
		
		s.close();
		
		String sql = "";
		
		switch(statsChoice) {
			case 1:
				// TODO: Build the sql query for the db for m results
				sql = "";
				break;
			case 2:
				// TODO: Build the sql query for the db for m results
				sql = "";
				break;
			case 3:
				// TODO: Build the sql query for the db for m results
				sql = "";
				break;
		}
		
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
			
			System.out.println("ERROR: Cannot execute query for that statistic.");
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
	
	/**
	 *  Method to get statistics related to the UUber System in order for the admin user to give awards
	 */
	public static String getAdminAwards(Statement stmt) {
		
		int awardsChoice;
		int m;
		Scanner s = new Scanner(System.in);
		
		// Ask the admin what they would like to give awards for 
		System.out.println("What statistics would you like to see in order to give awards?");
		System.out.println("1) Most Trusted Users");
		System.out.println("2) Most Helpful Users");
		System.out.println("Enter Choice #: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		awardsChoice = s.nextInt();
		System.out.println("\n");
		
		// Keep asking for input until awardsChoice is a valid choice
		while (awardsChoice != 1 && awardsChoice != 2) {
			System.out.println("Invalid Input");
			System.out.println("Enter Choice #: ");
			while(!s.hasNextInt()) {
			    s.next();
			}
			awardsChoice = s.nextInt();
			System.out.println("\n");
		}
		
		System.out.println("What number of the top results would you like to see?");
		System.out.println("Enter #: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		m = s.nextInt();
		System.out.println("\n");
		
		s.close();
		
		String sql = "";
		
		switch(awardsChoice) {
			case 1:
				// TODO: Build the sql query for the db for m results
				sql = "";
				break;
			case 2:
				// TODO: Build the sql query for the db for m results
				sql = "";
				break;
		}
		
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
			
			System.out.println("ERROR: Cannot execute query for the admin to give awards.");
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
	
	/**
	 *  Method to allow the user to mark another user as trusted or not trusted
	 */
	public static String getDegreeOfSeparation(Statement stmt) {
		
		String user1;
		String user2;
		
		Scanner s = new Scanner(System.in);
		
		// Ask for username 1
		System.out.println("What is the first username?");
		user1 = s.nextLine();
		System.out.println("\n");
		
		// Ask for username 2
		System.out.println("What is the second username?");
		user2 = s.nextLine();
		System.out.println("\n");
		
		// TODO: Figure out how to determine how many degrees of separation there are between the two before sql query
		
		s.close();
		
		// TODO: build sql query
		String sql = "";
		
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
			
			System.out.println("ERROR: Cannot execute query for the user to reserve a car.");
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
}
