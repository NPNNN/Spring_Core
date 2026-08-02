package in.nkn.service;

import in.nkn.bo.customerBO;
import in.nkn.dao.ICustomerDAO;
import in.nkn.dto.CustomerDto;

public class CustomerMgmtServiceImpl implements ICustomerMgmtService {

	private ICustomerDAO dao;
	
	static {
		System.out.println("CustomerMgmtServiceImple classs is loading....");
	}
	
	
	public CustomerMgmtServiceImpl(ICustomerDAO dao) {
		System.out.println("CustomerMgmtServiceImpl:: zero param costructor....");
		this.dao = dao;
	}



	@Override
	public String calculateSimpleInterest(CustomerDto dto) {
		
		float intrAmt=0.0f;
		
		intrAmt=(dto.getPamt() * dto.getRate() * dto.getTime()) / 100.0f;
        
	     customerBO bo = new customerBO();
	     bo.setCustomerAddress(dto.getCustomerAddress());
	     bo.setCustomerName(dto.getCustomerName());
		 bo.setPamt(dto.getPamt());
		 bo.setRate(dto.getRate());
		 bo.setInterestAmt(intrAmt);
		
		 int count=dao.insert(bo);
		 
		 if(count==0)
         	 return "Customer Registration Failed :: "+dto.getPamt() + "Interest :: "+ intrAmt;
		 else
			 return "Customer Registration Sucessfull :: "+dto.getPamt() + "Interest :: "+ intrAmt;
		
	}

}
