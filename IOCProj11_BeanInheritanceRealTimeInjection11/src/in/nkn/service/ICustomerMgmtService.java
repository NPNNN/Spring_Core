package in.nkn.service;

import in.nkn.dto.CustomerDto;

public interface ICustomerMgmtService {

	public abstract String calculateSimpleInterest(CustomerDto dto);
}
