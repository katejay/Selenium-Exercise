import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Base {
	
	static ResultSet rs;
	String host = "localhost";
	String port = "3306";
	String user = "root";
	String password = "root";
	
	public void initialize() throws SQLException
	{
		Connection con = DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/demo", user, password);
		Statement s = con.createStatement();
		rs = s.executeQuery("select * from employee_info where emp_transaction_attempt = 0");
		rs.next();
	}
	
	public String getUsername () throws SQLException
	{
		String emp_username = rs.getString("emp_username");
		return emp_username;
	}
	
	public String getPassword () throws SQLException
	{
		String emp_password = rs.getString("emp_password");
		return emp_password;
	}

}
