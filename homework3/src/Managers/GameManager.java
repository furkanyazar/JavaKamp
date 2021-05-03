package Managers;

import Entities.*;
import Services.*;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getName() + " adl� oyun eklendi");
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getName() + " adl� oyun g�ncellendi");
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getName() + " adl� oyun silindi");
	}

}
