package in.nkn.service;

import java.util.List;

import in.nkn.dto.EmployeeDTO;

public interface IEmployeeService {

    String save(EmployeeDTO vo);
	
	List<EmployeeDTO> findAllEmployees();
	
	EmployeeDTO findById(Integer eid);
	
	String UpdateById(Integer eid);
	
	String deleteById(Integer eid);
}
