package Concrete;

import Abstract.*;
import Entities.*;

public class NeroCustomerManager extends BaseCustomerManager {

	private ICustomerCheckService _customerCheckService;

	public NeroCustomerManager(ICustomerCheckService _customerCheckService) {
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
