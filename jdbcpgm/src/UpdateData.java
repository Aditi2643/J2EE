//Updating a data in the table

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateData {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root", "Aditi@123");
		System.out.println("connection established successfully");
		
		String s="update student set sname=? where id=?";
		PreparedStatement pstmt=con.prepareStatement(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.next();
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		pstmt.setString(1,name);
		pstmt.setInt(2, id);
		
		int rows=pstmt.executeUpdate();
		System.out.println(rows);
	}

}
