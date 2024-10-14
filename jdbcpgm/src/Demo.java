import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args)throws Exception {

		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		System.out.println("Driver loaded successfully");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/june_2024","root","Aditi@123");
				System.out.println("connection established");
				String s="Select * from student";
				Statement stmt=con.createStatement();
				ResultSet res=stmt.executeQuery(s);
				
				ResultSetMetaData rsmd=res.getMetaData();
				
				for(int i=1;i<=rsmd.getColumnCount();i++) {
					System.out.print(rsmd.getColumnName(i)+" ");
					System.out.print(rsmd.getColumnTypeName(i)+" ");
				}
				while(res.next()==true) {
					int id=res.getInt(1);
					String name=res.getString(2);
					int marks1=res.getInt(3);
					int marks2=res.getInt(4);
					int marks3=res.getInt(5);
					System.out.println(id +" "+name+" "+marks1+" "+" "+marks2+" "+" "+marks3);
				}

	}

}