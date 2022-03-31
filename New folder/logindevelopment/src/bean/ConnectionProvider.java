package bean;
import java.sql.*;
import static bean.Provider.*;

public class ConnectionProvider {
	static Connection con=null;
	static{
		try{
			con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);
			}catch(Exception e){}
	}
	public static Connection getCon(){
		return con;
	}
}
