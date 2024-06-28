package keerthy;
import java.sql.*;
public class odbctodatabase {

	public static void main(String[] args) {
	 try
	 {
		 java.util.Scanner sc=new java.util.Scanner(System.in);
		 System.out.println("enter student name");
		 String stdname=sc.nextLine();
		 System.out.println("enter student id");
		 String stdid=sc.nextLine();
		 System.out.println("enter student email");
		 String email=sc.nextLine();
		 System.out.println("enter student class");
		 String class1=sc.nextLine();
		 Class.forName("oracle.jdbc.driver.OracleDriver");
		 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nct","keerthy");
		 String query="insert into cse values('"+stdname+"','"+stdid+"','"+email+"','"+class1+"')";
		 PreparedStatement ps=con.prepareStatement(query);
		 int res=ps.executeUpdate();
		 if(res>0)
		 {
			 System.out.println("Sucess");
		 }
		 
	 }catch(Exception obj)
	 {
		 obj.printStackTrace();
	 }

	}

}
