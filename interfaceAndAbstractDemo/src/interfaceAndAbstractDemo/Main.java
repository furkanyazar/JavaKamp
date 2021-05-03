package interfaceAndAbstractDemo;

import java.util.Date;

import Abstract.*;
import Adapters.*;
import Concrete.*;
import Entities.*;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter()); 
		customerManager.Save(new Customer(1, "Furkan", "Yazar", new Date(1990, 1, 1), "12345678910"));
	}

}
