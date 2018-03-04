/**
 * Class of static methods to perform operations that only a UUser account would need to accomplish.
 * 
 * @author Andrew Schneider, u0881917
 */

package cs5530;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UUOperations {
	public UUOperations()
	{}
	
	/**
	 *  Method to allow the user to reserve a car for a future date
	 */
	public static String reserveCar(Statement stmt) {
		
		Scanner s = new Scanner(System.in);
		
		// TODO: Ask the user when they want to reserve the car for
		// Take input
		// date =
		// time =
		
		// TODO: Figure out exactly what info is needed for reserving a car
		
		s.close();
		
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
	
	/**
	 *  Method to allow the user to log a ride that they took with a driver
	 */
	public static String logARide(Statement stmt) {
		
		// TODO: Instantiate variables needed for input
		
		Scanner s = new Scanner(System.in);
		
		// TODO: Figure out what information is needed to log a ride
		
		s.close();
		
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
	
	/**
	 *  Method to allow the user to give feedback on a ride
	 */
	public static String giveFeedback(Statement stmt) {
		
		// TODO: Instantiate variables needed for input
		
		Scanner s = new Scanner(System.in);
		
		// TODO: Take input
		
		s.close();
		
		// TODO: build sql query to give feedback
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
	
	/**
	 *  Method to allow the user to get the feedback ratings that are most rated as useful by users on a specific car
	 */
	public static String getUsefulFeedbacks(Statement stmt) {
		
		// TODO: Instantiate variables needed for input
		
		Scanner s = new Scanner(System.in);
		
		// TODO: Take input
		
		s.close();
		
		// TODO: Create sql query for the feedback request
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
	
	/**
	 *  Method to allow the user to mark another user as trusted or not trusted
	 */
	public static String updateTrustedUsers(/*Takes in username from person logged into the system*/ Statement stmt) {
		
		String currentUser;
		String otherUser;
		String trust;
		
		Scanner s = new Scanner(System.in);
		
		// Ask current user what user they want to update the trusted rating for
		System.out.println("Of which user would you like to update the trusted rating?");
		System.out.println("Enter their username: ");
		otherUser = s.nextLine();
		System.out.println("\n");
		
		// Ask current user if they would like to mark them as trusted or not trusted?
		System.out.println("Would you like to mark this user as 'trusted' or 'not-trusted'?");
		System.out.println("Please type answer EXACTLY as specified in the question above.");
		trust = s.nextLine();
		System.out.println("\n");
		
		while(!trust.equals("trusted") || !trust.equals("not-trusted")) {
			
			System.out.println("Invalid input");
			System.out.println("Please type answer EXACTLY as specified in the question above.");
			trust = s.nextLine();
			System.out.println("\n");
		}
		
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
	
	/**
	 *  Method to allow the user to designate a car that is their favorite to hire
	 */
	public static String updateFavoriteCar(/*Takes in info of user that is logged in*/ Statement stmt) {
		
		String driverUsername;
		String make;
		String model;
		
		Scanner s = new Scanner(System.in);
		
		// Ask user for details on their favorite car
		System.out.println("What is the username of the driver for your favorite car?");
		driverUsername = s.nextLine();
		System.out.println("\n");
		
		System.out.println("What is the make of the favorite car?");
		make = s.nextLine();
		System.out.println("\n");
		
		System.out.println("What is the model of the favorite car?");
		model = s.nextLine();
		System.out.println("\n");
		
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
			
			System.out.println("ERROR: Cannot execute query for the user to update favorite car.");
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
