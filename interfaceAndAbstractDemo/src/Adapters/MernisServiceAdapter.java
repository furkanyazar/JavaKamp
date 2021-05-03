package Adapters;

import java.rmi.RemoteException;

import Abstract.*;
import Entities.*;
import tr.gov.nvi.tckimlik.WS.*;

public class MernisServiceAdapter implements ICustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getYear());
	}

}
