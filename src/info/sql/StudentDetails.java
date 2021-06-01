package info.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentDetails {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student_details","root","Bharathi95");
		String sql="select * from students";
		PreparedStatement ps=con.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
	while(rs.next())
	{
		int id=rs.getInt(1);
		System.out.println(id);
		String name=rs.getString(2);
		System.out.println(name);
		String address=rs.getString(3);
		System.out.println(address);
		
			
		
		
			
		}
	con.close();
	
	}



}
