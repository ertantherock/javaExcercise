//Interface'i bu class'a implement ettiğim için interfacedeki metodlar burada @Override oldu.
public class MilitaryCreditManager extends BaseCreditManager {

	@Override
	public void calculate() {
		//Hesaplamalar olacak ama asker kredisine göre. Öğretmen classında da aynı durum geçerli.
		System.out.println("Asker Kredisi Hesaplandı");
		
	}
	//Abstract class kurduğumuz için ve o classta save metodunu fixlediğimiz için artık bu classta
	//save metodunu kullanmamıza gerek bulunmamaktadır.
		/*
		 * @Override public void save() { System.out.println("Kaydedildi.");
		 * 
		 * }
		 */

}
