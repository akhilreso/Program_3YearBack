import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

import com.mysql.jdbc.Connection;

public class JDBC {
	
	@Test
	public void testDB() throws ClassNotFoundException, SQLException 
	{
		Class.forName("");
		System.out.print("");
		java.sql.Connection con=DriverManager.getConnection(""); // username root
	    System.out.println("");
	    Statement stm = con.createStatement();
	    ResultSet res = stm.executeQuery("select * from selenium");
	    while(res.next()) {
	    	 
	    	String fname = res.getString("firstName");
	    	System.out.println("database record is" +fname);
	    	
	    	String email = res.getString("email");
	    	System.out.println(" database record is " +email);
	    }
	}

}
