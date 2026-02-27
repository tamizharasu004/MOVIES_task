package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import connection.Conn;

public class selection {
	
	public static ResultSet selects() throws Exception
	{
		Connection conss=Conn.reqConns();
		String sql="select * from movies";
		Statement ct = conss.createStatement();
		ResultSet e = ct.executeQuery(sql);
		return e;
	}
	
	public static ResultSet select_con(int id)throws Exception
	{
		Connection conss=Conn.reqConns(); 
		String sqls="select * from movies where id=?";
		PreparedStatement stmt1 = conss.prepareStatement(sqls);
		stmt1.setInt(1, id);
		ResultSet eq= stmt1.executeQuery();
		return eq;
		
		
	}

}
