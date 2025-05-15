package DBConnection;

	
import  java.sql.Connection;		
import  java.sql.Statement;
import  java.sql.ResultSet;		
import  java.sql.DriverManager;		
import  java.sql.SQLException;	

public class  SQLConnector {				
    	
	public static void  main(String[] args) throws  ClassNotFoundException, SQLException {													
				
		
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                String dbUrl = "jdbc:postgresql://localhost:5432/postgres";					

				//Database Username		
				String username = "postgres";	
                
				//Database Password		
				String password = "password";				

				//Query to Execute		
				String query = "SELECT * FROM movies;";	
				//String query = "SELECT * FROM movies;";	
                
         	    //Load mysql jdbc driver		
           	    Class.forName("org.postgresql.Driver");			
           
           		//Create Connection to DB		
            	Connection con = DriverManager.getConnection(dbUrl,username,password);
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();					
       
       			// Execute the SQL Query. Store results in ResultSet		
         		ResultSet rs= stmt.executeQuery(query);							
         
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
					
					
			        		String id = rs.getString(1);								        
                            String title = rs.getString(2);	
                            String director = rs.getString(3);
                            //String Address = rs.getString(5);
                            System. out.println(id + "  -  " + title+" ---------- "+director);
                            System.out.println("*********************");
                            //System.out.println(Address);
                    }		
      			 // closing DB Connection	
				
				
				
				
      			con.close();			
		}
}