package Abstract;

import java.rmi.RemoteException;

import Entities.*;

public interface ICustomerCheckService {
	
	boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;

}
