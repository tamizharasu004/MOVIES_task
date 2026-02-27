package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	public static Connection reqConns()throws Exception
	{
		// driver loaded
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 
		// connection establishment done
		 String url="jdbc:mysql://localhost:3306/movi";
		 String u_name="root";
		 String pwd="ur_pwd";
		 
		 Connection conns = DriverManager.getConnection(url, u_name, pwd);
		
		 return conns;
		 
		 
		 
	}
	

}
