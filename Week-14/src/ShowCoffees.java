import java.sql.*;   // Needed for JDBC classes

/**
 * This program demonstrates how to issue an SQL
 * SELECT statement to a database using JDBC.
 */
public class ShowCoffees
{
   public static void main(String[] args)
   {
      // Create a named constant for the URL.
      // NOTE: This value is specific for Java DB.
      final String DB_URL = "jdbc:derby:CoffeeDB";
      
      try
      {
         //1.Create a connection to the database.
         Connection conn = DriverManager.getConnection(DB_URL);
         
         //2.Create a Statement object.
         Statement stmt = conn.createStatement();
         
         //3. Create a string with a SELECT statement.
         String sqlStatement = 
            "SELECT * FROM Coffee Where Price>=10";
         
         //4. Send the statement to the DBMS.
         //Resultset => set is a collection 
         ResultSet result = stmt.executeQuery(sqlStatement);
         
         //5. Display a header for the listing.
         System.out.println("Coffees costing more than $10.00");
         System.out.println("--------------------------------");
         
         // Display the contents of the result set.
         // The result set will have three columns.
         while (result.next()) //Pointer keep pointing until there is none
         {
            System.out.println(result.getString("Description") + 
                               result.getString("ProdNum") + 
                               result.getDouble("Price"));
         }
         
         // Close the connection.
         conn.close();
      }
      catch(Exception ex) //in case there is an error
      {
         System.out.println("ERROR: " + ex.getMessage());
      }
   }
}
