public class CustomerManager  {
	
	
	//Private tanımlamalar sadece o class içinde kullanılabilir. Constructor ile bunu main ve diğer
	//Classlar içinde de kullanabileceğiz.
	private Customer customer;
	private ICreditManager creditManager;
	
	//Constructor Classlar içine parametre geçilebilir.
	public CustomerManager(Customer customer, ICreditManager creditManager) {
		//this = yukarıdaki küçük kustomer, eşittirin sağındaki ise fonksiyondaki customer.
		
		this.customer = customer;
		this.creditManager = creditManager;
	}
	public void save() {
		
		System.out.println("Müşteri Eklendi " );
	}
	
	public void delete() {
		System.out.println("Müşteri Silindi: ");
	}
	
	public void giveCredit() {
		creditManager.calculate();
		System.out.println("Kredi verildi.");
		
	}

	
}
