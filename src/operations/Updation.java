package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.Conn;

public class Updation {
	public static int update_details(String movie_name,int rating,int year,int id)throws Exception
	{
		int eupdate2=0;
		Connection conns=Conn.reqConns();
		String sql="update movies set movie_name=?,rating=?,year=? where id=?";
		PreparedStatement stmt = conns.prepareStatement(sql);
		stmt.setString(1, movie_name);
		stmt.setInt(2, rating);
		stmt.setInt(3, year);
		stmt.setInt(4, id);
		eupdate2=stmt.executeUpdate();
		return eupdate2;
		
		
		
	}

}
