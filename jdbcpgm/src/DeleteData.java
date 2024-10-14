import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteData {

	public static void main(String[] args) throws Exception {
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024", "root","Aditi@123");
		
		String s="Delete from student where id=?";
		PreparedStatement pstmt=con.prepareStatement(s);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id to be deleted");
		int id=sc.nextInt();
		pstmt.setInt(1, id);
		int rows =pstmt.executeUpdate();
		System.out.println(rows);
	}

}
