package database;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.cj.xdevapi.Statement;

public class JDBCTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce", "root", "root");
		    Statement st=connect.createStatement();
		    ResultSet rs=st.executeQuery("select * from eproduct");
		    //
		 while(rs.next())
		 {
			 System.out.println(rs.getString(1)+" "+ rs.getString(2)+" "+rs.getString(3));
		 }
		 //insert the row;
	     //st.executeUpdate("insert into eproduct(name,price,date_added) values('hardirve',1230.00,now())");
		//update the first row	     
		 //st.executeUpdate("delete  from eproduct where name='hardrive'");
		//st.executeUpdate("update eproduct set price=45000 where name='Desktop'");
		//st.executeUpdate("update eproduct set name='Drive' where ID= 5");
		//st.executeUpdate("update eproduct set name='Panel' where ID= 6");
		//st.executeUpdate("delete from eproduct where name='Desktop'");
		//st.executeUpdate("insert into eproduct(name,price,date_Added) values('USB',459,now())");
		 //st.executeUpdate("drop database db1");
		 
		  CallableStatement stmt1 = connect.prepareCall("{call add_product(?, ?)}");
          stmt1.setString(1, "IPhone");
          
          BigDecimal obj = new BigDecimal(1900.50);
          
          stmt1.setBigDecimal(2, obj);
          stmt1.executeUpdate();

		 
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			System.out.println("class not found");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("SQL exception");
		}
		

	}

}
