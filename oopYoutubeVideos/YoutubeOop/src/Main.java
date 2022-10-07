
public class Main {

	public static void main(String[] args) {
		
//		// int gibi primitive tipler değer tiptir. 
//		int sayi1 = 10;
//		int sayi2 = 20;
//		sayi1 = sayi2;
//		sayi2 = 100;
//		System.out.println(sayi1);
//		
//		
//		//arraylar reference tiptir. Değerler heapte saklanır.
//		int[] sayilar1 = {1,2,3,4,5};
//		int[] sayilar2 = {10,20,30,40,50};
//		
//		sayilar1 = sayilar2;
//		sayilar1[0]= 30;
//		sayilar2[0] = 1000;
//		
//		System.out.println(sayilar1[0]);
//		
//		CreditManager creditManager = new CreditManager(); // Instance oluşturmak, Instance Creation
//		
//		creditManager.Calculate();
//		creditManager.Save();
//		Customer customer = new Customer();
//		
//		
//		customer.id=1;
////		customer.nationalIdentitiy="123123123";
//		customer.city="İstanbul";
//		
//		//Constructor class kullandığımız için CustomerManagerin içine parametre olarak customer vereceğiz ki
//		//CustomerManager'ın içindeki fonksiyonları(metodları) kullanabilelim.
//		CustomerManager customerManager = new CustomerManager(customer); //Instance oluşturmak, Instance Creation
//		
//		//Customer Manager'ın içindeki metodları kullanabileceğiz artık. 
//		customerManager.Save();
//		customerManager.Delete();
//		
//		CorparateCustomer corparateCustomer = new CorparateCustomer();
//		corparateCustomer.taxNumber = "123123123";
//		corparateCustomer.companyName = "Arçelik";
//		corparateCustomer.id = 100;
//		
//		CustomerManager customerManager2 = new CustomerManager(new IndividualCustomer());
//		
//		IndividualCustomer individualCustomer = new IndividualCustomer();
//		individualCustomer.nationalIdentitiy = "123123123";
//		
//		Customer c1 = new Customer();
//		Customer c2 = new IndividualCustomer();
//		Customer c3 = new CorparateCustomer();
		
		//CustomerManagerda 2 değişkenle Constructor Class kurduğumuz için bizden iki değişken istiyor.
		//Artık sistemde Military veya Teacher Kredilerini kolaylıkla değiştirebileceğiz. Tek yapmamız
		//gereken new Military yerine new TeacherCreditManager yazmamız.
		//Newler de zaafiyet oluşturur bunu IoC Container ile çözebiliriz.
		//Interface'i kullandığımız zaman çok fazla if yazmamamız gerekmez.
		CustomerManager customerManager = new CustomerManager(new Customer(),new TeacherCreditManager());
		customerManager.giveCredit();
		
	}

}
