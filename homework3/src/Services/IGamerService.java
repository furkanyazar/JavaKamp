package Services;

import java.rmi.RemoteException;

import Entities.*;

public interface IGamerService {
	
	void Add(Gamer gamer) throws NumberFormatException, RemoteException;
    void Update(Gamer gamer);
    void Delete(Gamer gamer);

}
