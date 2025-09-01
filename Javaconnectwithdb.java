// public class Javaconnectwithdb {
    
// }
// package Aug2025;

// import java.sql.Connection;
// import java.sql.DriverManager;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;

// public class JdbcDemo {

// 	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
// 		Connection core = DriverManager.getConnection("jdbc:mysql://localhost:3306/Aug2026", "root", "Root1user@");
		
// 		Statement stmt = core.createStatement();
		
// 		String query = "SELECT * FROM user";
// 		ResultSet rs = stmt.executeQuery(query);
		
// 		while (rs.next()) {
// 		    System.out.println("ID: " + rs.getInt("id"));
// 		    System.out.println("Name : " + rs.getString("name"));
// 		    System.out.println("Age : " + rs.getInt("age"));
// //		    System.out.println("Location : " + rs.getString("location"));
// 		}

// 		core.close();

// 	}

// }


