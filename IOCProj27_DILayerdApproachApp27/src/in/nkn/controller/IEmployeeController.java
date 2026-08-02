package in.nkn.controller;

import java.util.List;

import in.nkn.vo.EmployeeVO;

public interface IEmployeeController {

	String save(EmployeeVO vo);
	
	List<EmployeeVO> findAllEmployees();
	
	EmployeeVO findById(Integer eid);
	
	String UpdateById(Integer eid);
	
	String deleteById(Integer eid);
	
}
