
package operations;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.Conn;

public class Deletion {
	public static int deletion(int id) throws Exception
	{
		int eupdatess=0;
		Connection conss=Conn.reqConns();
		String sqls="delete from movies where id=?";
		PreparedStatement stmt=conss.prepareStatement(sqls);
		stmt.setInt(1, id);
		eupdatess=stmt.executeUpdate();
		return eupdatess;
	}

}
