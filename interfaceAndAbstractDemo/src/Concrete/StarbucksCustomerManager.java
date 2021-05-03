package Concrete;

import Abstract.*;
import Entities.*;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	private ICustomerCheckService _customerCheckService;
	
	public StarbucksCustomerManager(ICustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	@Override
	public void Save(Customer customer) throws Exception {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		} else {
			throw new Exception("Not a valid person");
		}
	}

}
