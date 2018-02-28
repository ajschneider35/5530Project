/**
 * Class of static methods to perform operations that only a UUser account would need to accomplish.
 * 
 * @author Andrew Schneider, u0881917
 */

package cs5530;

import java.sql.ResultSet;
import java.sql.Statement;

public class UUOperations {
	public UUOperations()
	{}
	
	/*** EXAMPLE METHOD ***/
	/*** CREATE METHODS USING THIS SKELETON FOR OPERATIONS THAT CAN BE PERFORMED FROM THE USER MENU ***/
	
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
}
