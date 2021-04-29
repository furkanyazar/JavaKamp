package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer engin = new IndividualCustomer();
		engin.customerNumber = "12345";

		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber = "78910";

		SendikaCustomer abc = new SendikaCustomer();
		abc.customerNumber = "99999";
		
		Customer[] customers = { engin, hepsiBurada, abc };

		CustomerManager customerManager = new CustomerManager();
		customerManager.addMultiple(customers);

//		customerManager.add(hepsiBurada);
//		customerManager.add(engin);
//		customerManager.add(abc);
	}

}
