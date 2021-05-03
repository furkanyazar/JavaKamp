package interfaces;

public class Main {

	public static void main(String[] args) {
		Logger[] loggers = { new FileLogger(), new DatabaseLogger() };

		CustomerManager customerManager = new CustomerManager(loggers);

		Customer furkan = new Customer(1, "Furkan", "Yazar");

		customerManager.add(furkan);
	}

}
