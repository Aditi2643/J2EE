import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class insertData {
	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","Aditi@123");
		System.out.println("connection established");
		
		String s="insert into student values(?,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(s);
		Scanner sc= new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		String name=sc.next();
		System.out.println("enter marks1");
		int marks1=sc.nextInt();
		System.out.println("enter marks2");
		int marks2=sc.nextInt();
		System.out.println("enter marks3");
		int marks3=sc.nextInt();
		
		pstmt.setInt(1,id);
		pstmt.setString(2, name);
		pstmt.setInt(3, marks1);
		pstmt.setInt(4, marks2);
		pstmt.setInt(5, marks3);	
		
		int rows=pstmt.executeUpdate();
		System.out.println(rows);
	}
}
