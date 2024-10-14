import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Pgm1 {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","Aditi@123");
		System.out.println("connection established");
		
		String s="select * from student where id=?";
		PreparedStatement stmt=con.prepareStatement(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		stmt.setInt(1, id);
		ResultSet res=stmt.executeQuery();
		if(res.next()) {
			 id=res.getInt(1);
			String name=res.getString(2);
			int marks1=res.getInt(3);
			int marks2=res.getInt(4);
			int marks3=res.getInt(5);
			System.out.println(id+" "+name+" "+marks1+" "+marks2+" "+marks3);
		}else {
			System.out.println("invalid id");
		}
	}

}
