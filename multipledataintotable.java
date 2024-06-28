package keerthy;
import java.sql.*;
import java.util.Scanner;
public class multipledataintotable {
	public static void main(String[] args)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nct","keerthy");
			PreparedStatement ps=con.prepareStatement("insert into cse values(?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			String user_value=" ";
			do
			{
			  System.out.print("Enter student_name");
			  String sname=sc.nextLine();
			  System.out.print("Enter student_id");
			  String sid=sc.nextLine();
			  System.out.print("Enter student_email");
			  String semail=sc.nextLine();
			  System.out.print("Enter student_class");
			  String sclass=sc.nextLine();
			  
			  ps.setString(1, sname);
			  ps.setString(2, sid);
			  ps.setString(3, semail);
			  ps.setString(4, sclass);
			  
			  ps.addBatch();
			  System.out.println("Enter a choice (Yes/No):");
			  
			  user_value=sc.nextLine();
			}while(user_value.equals("Yes"));
			
			ps.executeBatch();
			
			System.out.println("Success");
			}
			catch(Exception obj) {
				obj.printStackTrace();
		}
	}


}
