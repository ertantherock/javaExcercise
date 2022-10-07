
public class TeacherCreditManager extends BaseCreditManager{

	@Override
	public void calculate() {
		System.out.println("Öğretmen Kredisi Hesaplandı");
		
	}

	//Abstract class kurduğumuz için ve o classta save metodunu fixlediğimiz için artık bu classta
	//save metodunu kullanmamıza gerek bulunmamaktadır.
		/*
		 * @Override public void save() { System.out.println("Kaydedildi.");
		 * 
		 * }
		 */

}
