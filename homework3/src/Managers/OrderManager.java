package Managers;

import Entities.*;
import Services.*;

public class OrderManager implements IOrderService {

	@Override
	public void Add(Order order) {
		double price = 0;
		
		for (Game game : order.getGames()) {
			price += game.getPrice();
		}
		
		System.out.println("Oyunlar " + order.getGamer().getFirstName() + " adl� oyuncuya " + price + " TL fiyata sat�ld�");
	}

	@Override
	public void Delete(Order order) {
		System.out.println("Sipari� iptal edildi");
	}

}
