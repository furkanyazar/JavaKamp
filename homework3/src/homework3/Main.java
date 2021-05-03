package homework3;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Date;

import Entities.*;
import Managers.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		Gamer gamer1 = new Gamer(1, "Furkan", "Yazar", new Date(1990, 1, 1), "12345678910");
		GamerManager gamerManager = new GamerManager(new GamerValidationManager());
		ArrayList<Gamer> gamers = new ArrayList<Gamer>();
		gamers.add(gamer1);
		for (Gamer gamer : gamers) {
			gamerManager.Add(gamer);
		}
		
		Game game1 = new Game(1, "RDR 2", 300, new ArrayList<Campaign>());
		Game game2 = new Game(2, "GTA 5", 210, new ArrayList<Campaign>());
		Game game3 = new Game(3, "CP 2077", 250, new ArrayList<Campaign>());
		GameManager gameManager = new GameManager();
		ArrayList<Game> games = new ArrayList<Game>();
		games.add(game1);
		games.add(game2);
		games.add(game3);
		for (Game game : games) {
			gameManager.Add(game);
		}
		
		Campaign campaign1 = new Campaign(1, "RDR2YAZ", 25, game1);
		Campaign campaign2 = new Campaign(2, "GTA5KIS", 35, game2);
		Campaign campaign3 = new Campaign(3, "RDR2SEPETTE", 10, game1);
		CampaignManager campaignManager = new CampaignManager();
		ArrayList<Campaign> campaigns = new ArrayList<Campaign>();
		campaigns.add(campaign1);
		campaigns.add(campaign2);
		campaigns.add(campaign3);
		for (Campaign campaign : campaigns) {
			campaignManager.Add(campaign);
		}
		
		Order order1 = new Order(1, gamer1, new ArrayList<Game>());
		order1.getGames().add(game1);
		order1.getGames().add(game2);
		Order order2 = new Order(2, gamer1, new ArrayList<Game>());
		order2.getGames().add(game2);
		order2.getGames().add(game3);
		Order order3 = new Order(3, gamer1, new ArrayList<Game>());
		order3.getGames().add(game1);
		order3.getGames().add(game3);
		Order order4 = new Order(4, gamer1, new ArrayList<Game>());
		order4.getGames().add(game1);
		order4.getGames().add(game2);
		order4.getGames().add(game3);
		OrderManager orderManager = new OrderManager();
		ArrayList<Order> orders = new ArrayList<Order>();
		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
		orders.add(order4);
		for (Order order : orders) {
			orderManager.Add(order);
		}
	}

}
