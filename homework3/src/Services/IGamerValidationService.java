package Services;

import java.rmi.RemoteException;

import Entities.*;

public interface IGamerValidationService {
	
	boolean Validate(Gamer gamer) throws NumberFormatException, RemoteException;

}
