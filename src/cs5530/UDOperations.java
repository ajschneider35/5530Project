/**
 * Class of static methods to perform operations that only a UDriver account would need to accomplish.
 * 
 * @author Andrew Schneider, u0881917
 */

package cs5530;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UDOperations {
	public UDOperations()
	{}
	
	/**
	 *  Method to add a new car to the database by request from a Driver User
	 */
	public static String addNewCar(/* Takes in the user info needed for the query also*/Statement stmt) {
		
		int vin;
		String make;
		String model;
		int year;
		
		Scanner s = new Scanner(System.in);
		
		// Ask for VIN number of the car
		System.out.println("Enter VIN Number: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		vin = s.nextInt();
		
		// Ask for Make of the car
		System.out.println("Enter Vehicle Make: ");
		make = s.nextLine();
		
		// Ask for Model of the car
		System.out.println("Enter Vehicle Model: ");
		model = s.nextLine();
		
		// Ask for Year of the car
		System.out.println("Enter Vehicle Production Year: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		year = s.nextInt();
		
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
	
	/**
	 *  Method to update the details of a car by request from a Driver User
	 */
	public static String updateCarDetails(/* Takes in the user info needed for the query also*/Statement stmt) {
		
		int vin;
		String make;
		String model;
		int year;
		
		Scanner s = new Scanner(System.in);
		
		// Ask for VIN number of the car
		System.out.println("Enter VIN Number: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		vin = s.nextInt();
		
		// Ask for Make of the car
		System.out.println("Enter Vehicle Make: ");
		make = s.nextLine();
		
		// Ask for Model of the car
		System.out.println("Enter Vehicle Model: ");
		model = s.nextLine();
		
		// Ask for Year of the car
		System.out.println("Enter Vehicle Production Year: ");
		while(!s.hasNextInt()) {
		    s.next();
		}
		year = s.nextInt();
		
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
			
			System.out.println("ERROR: Cannot execute query for updating car details.");
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
