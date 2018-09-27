package Utility;

import java.sql.*;

public class Database {
	
	
	Connection con;
	Statement stmt;
	ResultSet rs;
	public int flag=0;
	public  void Db_con_check(String hostname,String username,String password)
	
	{
		try
		{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			con=DriverManager.getConnection("jdbc:oracle:thin:"+hostname,username,password);
			
		}
		catch(Exception e)
		{   
			flag=1;
			System.out.println(e);
		}
		
	}
	
	public void query(String query) 
	{
		  
			try
			{
			stmt=con.createStatement();  
			rs=stmt.executeQuery(query);  
			while(rs.next())  
			System.out.println(rs.getString(1));
			con.close();
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
	
		


			 
	}


