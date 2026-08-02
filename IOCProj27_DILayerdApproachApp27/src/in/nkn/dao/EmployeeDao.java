package in.nkn.dao;

import java.util.List;

import in.nkn.bo.EmployeeBo;
import in.nkn.dto.EmployeeDTO;

public interface EmployeeDao {

	String save(EmployeeBo bo );
   List<EmployeeBo> findAllEmployees();
	
	EmployeeBo findById(Integer eid);
	
	String UpdateById(Integer eid);
	
	String deleteById(Integer eid);
}
