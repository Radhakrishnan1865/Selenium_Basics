package data_Base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Data_BaseConnection {

	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// First add the Mysql-connecter-java dependency in POM.xml file
		
		// load the JDBC driver
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  
		  // set the url, userName, Password
		String url = "jdbc:mysql://localhost:3306/yourdatabase";
        String user = "yourusername";
        String password = "yourpassword";
        
        try {
        	
        	// create a connection
            Connection connection = DriverManager.getConnection(url, user, password);
            
         // Create a Statement object to execute queries
            Statement statement = connection.createStatement();
            
            // declare the sql query
            String query = "SELECT * FROM your_table";
            
            //Excecute the query and stored in result set interface
            ResultSet resultSet = statement.executeQuery(query);
            
            
            //Using while loop to retrive the data from dataBase
            while (resultSet.next()) {
            	
                // Process each row of the result set
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }
            
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}
