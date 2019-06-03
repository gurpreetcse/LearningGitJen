package dbRet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbConn {

	static final String JDBC_DRIVER ="com.ibm.db2.jcc.DB2Driver";  
	  static final String DB_URL_ACCP ="jdbc:db2://ajaxludb1009:63934/ssoar01";
	  static final String DB_URL_INTG ="jdbc:db2://djaxludb1009:62932/SSOIN01";
	  

		   //  Database credentials
		   static final String USER = "j691643";
		   static final String PASS = "Spring@44j";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.ibm.db2.jcc.DB2Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL_ACCP, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Creating statement...");
		      stmt = conn.createStatement();

		      String sql = "Select SSO_CLIENT_ID,FIRST_NAME, LAST_NAME from SSO.SSO_USER where SSO_USER_ID in ('191987373')";
		      System.out.println("Creating statement...123123");
		      ResultSet rs = stmt.executeQuery(sql);
		      System.out.println(rs);
		      //STEP 5: Extract data from result set
		      while(rs.next()){
		         //Retrieve by column name
		         String id  = rs.getString("SSO_CLIENT_ID");
		         //int age = rs.getInt("age");
		         String first = rs.getString("FIRST_NAME");
		         String last = rs.getString("LAST_NAME");

		         //Display values
		         System.out.print("ID: " + id);
		         //System.out.print(", Age: " + age);
		         System.out.print(", First: " + first);
		         System.out.println(", Last: " + last);
		      }
		      rs.close();
		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
		//end JDBCExample
	}
