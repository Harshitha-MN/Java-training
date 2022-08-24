package com.josh.javatraining.assesment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Library {

	public static void main(String args[]) throws ClassNotFoundException {
		Connection c = null;
		Statement stmt = null;
		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BookDetails", "postgres", "root");

			stmt = c.createStatement();
			String sql = "CREATE TABLE BookDetails " + "(BOOKNUMBER INT PRIMARY KEY     NOT NULL,"
					+ " BOOKNAME VARCHAR(20) NOT NULL, " + " AUTHORNAME VARCHAR(20)  NOT NULL, "
					+ " BOOKLANGUAGE       VARCHAR(50)) ";

			stmt.executeUpdate(sql);
			System.out.println("Table created successfully");

			stmt = c.createStatement();
			String isql = "INSERT INTO BookDetails (BookNumber,BookName,AuthorName,BookLanguage) "
					+ "VALUES (1, 'goosebumps', 'ashish', 'english' );";
			stmt.executeUpdate(isql);

			String isql1 = "INSERT INTO BookDetails (BookNumber,BookName,AuthorName,BookLanguage) "
					+ "VALUES (2, 'world', 'harshitha', 'hindi' );";
			stmt.executeUpdate(isql1);

			String isql2 = "INSERT INTO BookDetails (BookNumber,BookName,AuthorName,BookLanguage) "
					+ "VALUES (3, 'Traveller', 'harshitha', 'kannada' );";
			stmt.executeUpdate(isql2);
			System.out.println("Records inserted successfully");

			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM BookDetails;");

			stmt = c.createStatement();
			String update = "UPDATE BookDetails set BookName = 'Ashu' where BookNumber=1;";
			stmt.executeUpdate(update);
			System.out.println("update done successfully");

			stmt = c.createStatement();
			String delete = "DELETE from BookDetails where BookNumber = 2;";
			stmt.executeUpdate(delete);
			System.out.println("deletion done successfully");

			System.out.println("Book ID     " + "Book NAME     " + "  Author Name     " + "  Language     ");
			System.out.println("=========================================================================");
			while (rs.next()) {
				int id = rs.getInt("BookNumber");
				String name = rs.getString("BookName");
				String author = rs.getString("AuthorName");
				String lang = rs.getString("BookLanguage");

				System.out.println(id + "          " + name + "         " + author + "          " + lang);
			}

			rs.close();
			stmt.close();
			c.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


/*output
Table created successfully
Records inserted successfully
update done successfully
deletion done successfully
Book ID     Book NAME       Author Name       Language     
=========================================================================
1          goosebumps         ashish          english
2          world         harshitha          hindi
3          Traveller         harshitha          kannada*/
