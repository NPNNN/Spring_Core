package in.nkn.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nkn.bo.EmployeeBo;
import in.nkn.dao.EmployeeDao;
import in.nkn.dao.EmployeeDaoImpl;
import in.nkn.dto.EmployeeDTO;
import in.nkn.vo.EmployeeVO;

@Service("service")
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeDao dao;
	
	@Override
	public String save(EmployeeDTO dto) {
		
		EmployeeBo bo = new EmployeeBo();
		bo.setEname(dto.getEname());
		bo.setEage(dto.getEage());
		bo.setEaddress(dto.getEaddress());
		
		return dao.save(bo);
	}

	@Override
	public List<EmployeeDTO> findAllEmployees() {

	    List<EmployeeBo> employeesBO = dao.findAllEmployees();
	    List<EmployeeDTO> employeeDTO = new ArrayList<EmployeeDTO>();

	    for (EmployeeBo bo : employeesBO) {

	        EmployeeDTO dto = new EmployeeDTO();

	        dto.setEid(bo.getEid());
	        dto.setEname(bo.getEname());
	        dto.setEage(bo.getEage());
	        dto.setEaddress(bo.getEaddress());
	        
	        employeeDTO.add(dto);
	    }

	    return employeeDTO;
	}

	@Override
	public EmployeeDTO findById(Integer eid) {
		dao.findById(eid);
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
		return "EmployeeServiceImpl [dao=" + dao + "]";
	}
	

}
