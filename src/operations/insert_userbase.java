package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.Conn;

public class insert_userbase {
	public static int insert_u(int id,String movie_name,int rating,int year) throws Exception
	{
		int eupdate1=0;
		Connection conns=Conn.reqConns();
		String ss="insert into movies(id,movie_name,rating,year) values(?,?,?,?)";
		PreparedStatement st = conns.prepareStatement(ss);
		st.setInt(1, id);
		st.setString(2, movie_name);
		st.setInt(3, rating);
		st.setInt(4, year);
		eupdate1=st.executeUpdate();
		return eupdate1;
	}

}
