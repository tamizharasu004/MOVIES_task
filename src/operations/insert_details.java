package operations;

import java.sql.Connection;
import java.sql.Statement;

import connection.Conn;

public class insert_details {
	public static int  insert() throws Exception
	{
		int eUpdate=0;
		Connection con=Conn.reqConns();
		String qs="insert into movies values(1,'alaipayuthe',8,2002)";
		Statement s=con.createStatement();
		eUpdate=s.executeUpdate(qs);
		System.out.println("inserted successfully");
		return eUpdate;
		
	}
	
	
}
