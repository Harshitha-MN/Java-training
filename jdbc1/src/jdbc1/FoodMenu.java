package jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FoodMenu {
	public static void main(String[] args) throws ClassNotFoundException {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/foodmenu", "postgres", "root");
			System.out.println("connected");
			stmt = c.createStatement();
			String sql = "CREATE TABLE  FoodMenu " + "(FoodID INT PRIMARY KEY     NOT NULL,"
					+ " FoodNAME           varchar(29)   NOT NULL, " + " Foodprice          INT     NOT NULL, "
					+ " Vendors     varCHAR(50)) ;";

			stmt.executeUpdate(sql);

			stmt = c.createStatement();
			String isql = "INSERT INTO FoodMenu  (FoodID,FoodNAME,Foodprice,vendors) "
					+ "VALUES (1, 'Biriyani', 120, 'Ashish' );";
			stmt.executeUpdate(isql);

			isql = "INSERT INTO FoodMenu (FoodID,FoodNAME,Foodprice,vendors) " + "VALUES (2, 'Grill', 220, 'harshi' );";
			stmt.executeUpdate(isql);
			isql = "INSERT INTO FoodMenu  (FoodID,FoodNAME,Foodprice,vendors) "
					+ "VALUES (3, 'kabab', 320, 'ahrshi' );";
			stmt.executeUpdate(isql);

			isql = "INSERT INTO FoodMenu  (FoodID,FoodNAME,Foodprice,vendors) "
					+ "VALUES (4, 'chicken tikka', 420, 'hsah'  );";

			stmt.executeUpdate(isql);

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM FoodMenu ;");

			stmt = c.createStatement();
			String update = "UPDATE FoodMenu  set foodprice= 250 where foodID=1;";
			stmt.executeUpdate(update);
			System.out.println("update done successfully");

			stmt = c.createStatement();
			String delete = "DELETE from FoodMenu  where foodID = 2;";
			stmt.executeUpdate(delete);
			System.out.println("deletion done successfully");

			System.out
					.println("ID     " + "NAME     " + "  PRICE  " + "  VENDORS    " + "                            ");
			System.out.println("=========================================================================");
			while (rs.next()) {
				int id = rs.getInt("foodid");
				String name = rs.getString("foodname");
				int price = rs.getInt("foodprice");
				String vendors = rs.getString("vendors");

				System.out.println(id + "    " + name + "      " + price + "       " + vendors + " ");
			}

			rs.close();
			stmt.close();
			c.close();

			System.out.println("Table created successfully");
			System.out.println("Records inserted successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}