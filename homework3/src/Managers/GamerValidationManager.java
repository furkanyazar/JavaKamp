package Managers;

import java.rmi.RemoteException;

import Entities.*;
import Services.*;
import tr.gov.nvi.tckimlik.WS.*;

public class GamerValidationManager implements IGamerValidationService {

	@Override
	public boolean Validate(Gamer gamer) throws NumberFormatException, RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();

		return kpsPublicSoapProxy.TCKimlikNoDogrula(Long.parseLong(gamer.getIdentityNumber()),
				gamer.getFirstName(), gamer.getLastName(), gamer.getDateOfBirth().getYear());
	}

}
