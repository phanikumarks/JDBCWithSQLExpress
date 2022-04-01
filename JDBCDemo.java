import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class JDBCDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{

		     int insertStatement,deleteStatement,updateStatement;
			String url = "jdbc:sqlserver://0.0.0.0;encrypt=false;databaseName=employees_database";

		    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection conn = DriverManager.getConnection(url, "admin", "password");
			Statement statement = conn.createStatement();
			
			insertStatement = statement.executeUpdate("insert into employees_tbl values(800, 'Mahesh', 'Infra', 8600)");
			deleteStatement = statement.executeUpdate("delete from employees_tbl where id = 700");
			updateStatement = statement.executeUpdate("update employees_tbl set name = 'Laxman' where id = 600");
			
			System.out.println("Executed an Insert Statement - Rows Affected : " + insertStatement);
			System.out.println("Executed an Delete Statement - Rows Affected : " + deleteStatement);
			System.out.println("Executed an Update Statement - Rows Affected : " + updateStatement);
		 
	}

}
