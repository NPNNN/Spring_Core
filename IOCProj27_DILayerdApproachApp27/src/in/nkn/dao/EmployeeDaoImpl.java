package in.nkn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import in.nkn.bo.EmployeeBo;

@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {

	private static final String SQL_INSERT_QUERY = "insert into employee(ename,eage,eaddress) values(?,?,?)";
	private static final String SQL_SELECT_QUERY = "select eid,ename,eage,eaddress from employee";
	@Autowired
	@Qualifier("hikariDataSource")
	private DataSource dataSource;
	
	@Override
	public String save(EmployeeBo bo) {
		int rowcount = 0;
		try(Connection connection = dataSource.getConnection(); PreparedStatement pstm=connection.prepareStatement(SQL_INSERT_QUERY)){
			pstm.setString(1, bo.getEname());
			pstm.setInt(2, bo.getEage());
			pstm.setString(3, bo.getEaddress());
			rowcount=pstm.executeUpdate();
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		
		return rowcount == 1 ? "Record inserted sucessfully":"Record insertion failed";
	}
	@Override
	public List<EmployeeBo> findAllEmployees() {

		ArrayList<EmployeeBo> empListBo =null;
		try(Connection connection = dataSource.getConnection(); PreparedStatement pstm=connection.prepareStatement(SQL_SELECT_QUERY)){
			//System.out.println("EID\tENAME\tEAGE\tEADDRESS");
			ResultSet resultSet = pstm.executeQuery();
			
			empListBo = new ArrayList<EmployeeBo>();
			while(resultSet.next()) {
			 EmployeeBo employeeBo=	new EmployeeBo();
			 employeeBo.setEid(resultSet.getInt(1));
			 employeeBo.setEname(resultSet.getString(2));
			 employeeBo.setEage(resultSet.getInt(3));
			 employeeBo.setEaddress(resultSet.getString(4));
			 empListBo.add(employeeBo);
			}
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		
		return empListBo;
	}

	@Override
	public EmployeeBo findById(Integer eid) {
		 try(Connection connection = dataSource.getConnection()){
			System.out.println(connection); 
		 }catch(SQLException e) {
			 e.printStackTrace();
		 }
		return null;
	}

	@Override
	public String UpdateById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteById(Integer eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		return "EmployeeDaoImpl [dataSource=" + dataSource + "]";
	}

	
}
