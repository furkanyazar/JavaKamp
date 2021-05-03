package Managers;

import Entities.*;
import Services.*;

public class GameManager implements IGameService {

	@Override
	public void Add(Game game) {
		System.out.println(game.getName() + " adlý oyun eklendi");
	}

	@Override
	public void Update(Game game) {
		System.out.println(game.getName() + " adlý oyun güncellendi");
	}

	@Override
	public void Delete(Game game) {
		System.out.println(game.getName() + " adlý oyun silindi");
	}

}
