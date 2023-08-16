package com.student;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws Exception {
		
		
		Student ob = new  Student();
		
		
		String q="insert into student values()";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/student_manage","root","Mysql@786av");
		Statement st= con.createStatement();
		//ResultSet rs = st.executeQuery(q);
		
		int c=st.executeUpdate(q); 
		System.out.println(c+"row effected");
		
		
//		while(rs.next()) {
//		String name= rs.getString(2) + ":" + rs.getString(1);
//		System.out.println(name);
//		}
		
		
		st.close();
		con.close();

}
}
