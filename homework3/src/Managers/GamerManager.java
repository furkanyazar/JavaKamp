package Managers;

import java.rmi.RemoteException;

import Entities.*;
import Services.*;

public class GamerManager implements IGamerService {
	
	private IGamerValidationService _gamerValidationService;
	
	public GamerManager(IGamerValidationService _gamerValidationService) {
		this._gamerValidationService = _gamerValidationService;
	}

	@Override
	public void Add(Gamer gamer) throws NumberFormatException, RemoteException {
		if (_gamerValidationService.Validate(gamer)) {
			System.out.println(gamer.getFirstName() + " adlý oyuncu eklendi");
		} else {
			System.out.println(gamer.getFirstName() + " adlý oyuncu doðrulanamadý");
		}
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu güncellendi");
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " adlý oyuncu silindi");
	}

}
