package next.xadmin.login.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import next.xadmin.login.bean.LoginBean;

public class LoginDao {
	
	private String dbUrl = "jdbc:mysql://localhost:3306/collegedb";
	private String dbUname = "root";
	private String dbPassword = "1234";
	private String dbDriver = "com.mysql.jdbc.Driver";
	

	public void loadDriver(String dbDriver) throws ClassNotFoundException
	{
		Class.forName(dbDriver);
	}
	
	public Connection getConnection()throws ClassNotFoundException,SQLException
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(dbUrl, dbUname, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public boolean validate(LoginBean loginBean) throws ClassNotFoundException 
, SQLException
	{
		boolean status = false;
		
		loadDriver(dbDriver);
		Connection con = getConnection();
		
		String sql = "select * from login where Name = ? and Password =?";
		//PreparedStatement	 ps;
		try {
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, loginBean.getUsername());
		ps.setString(2, loginBean.getPassword());
		ResultSet rs = ps.executeQuery();
		status = rs.next();
		
		} catch (SQLException | NullPointerException e) {
			
			
			e.printStackTrace();
		}
		finally {
			con.close();
		
		}
		return status;
	}
	}
