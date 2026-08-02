package in.nkn.controller;

import in.nkn.vo.CustomerVo;
import in.nkn.dto.CustomerDto;
import in.nkn.service.ICustomerMgmtService;

public class MainController {
     ICustomerMgmtService service;
     
     static {
    	    System.out.println("MainController class is loding....");
     }

	 public MainController(ICustomerMgmtService service) {
		System.out.println("MainController:: one param constructor....");
		this.service = service;
	 }
	 
	 public String processResult(CustomerVo vo) {
		 
		 CustomerDto dto = new CustomerDto();
		 dto.setCustomerAddress(vo.getCustomerAddress());
		 dto.setCustomerName(vo.getCustomerName());
		 dto.setPamt(Float.parseFloat(vo.getPamt()));
		 dto.setRate(Float.parseFloat(vo.getRate()));
		 dto.setTime(Float.parseFloat(vo.getTime()));
		 
		 String result = service.calculateSimpleInterest(dto);
		
		 return result;
	 }
     
     
     
}
