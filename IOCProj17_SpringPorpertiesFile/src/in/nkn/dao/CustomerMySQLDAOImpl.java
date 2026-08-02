package in.nkn.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.jdbc.datasource.DriverManagerDataSource;

import in.nkn.bo.customerBO;

public class CustomerMySQLDAOImpl implements ICustomerDAO {

	private static final String Customer_Insert_Query="INSERT INTO Spring_core01(CNAME,CADDR,PAMT,INTRAMT)values(?,?,?,?)";
	private DataSource dataSource;
	
	static {
		System.out.println("CustomerMySQLDAOImpl class is loding.....");
	}
	
	public CustomerMySQLDAOImpl(DataSource dataSource) {
		System.out.println("CustomerMySQLDAOImpl:: 1 param cosntructor....");
		this.dataSource = dataSource;
	}



	@Override
	public int insert(customerBO bo) {
   
		int count=0;
		try(Connection connection = dataSource.getConnection()){
			PreparedStatement pstmt = connection.prepareStatement(Customer_Insert_Query);
			pstmt.setString(1, bo.getCustomerAddress());
			pstmt.setString(2, bo.getCustomerAddress());
			pstmt.setFloat(3, bo.getPamt());
			pstmt.setFloat(4, bo.getInterestAmt());
			
		 count = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
       
		return count;
	}

	
}
