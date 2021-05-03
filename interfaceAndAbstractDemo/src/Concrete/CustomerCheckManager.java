package Concrete;

import Abstract.*;
import Entities.*;

public class CustomerCheckManager implements ICustomerCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}
	
}
