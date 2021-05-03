package interfaces2;

public class SqlServerCustomerDal implements ICustomerDal {
	
	@Override
	public void add() {
		System.out.println("SqlServer eklendi");
	}

}
