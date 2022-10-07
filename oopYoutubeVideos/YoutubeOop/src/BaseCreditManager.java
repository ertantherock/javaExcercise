//Interfacei abstract classa implemente ediyoruz.
public abstract class BaseCreditManager implements ICreditManager {
	
	//Calculate değişken olduğu için ona dokunmuyoruz çünkü her kredinin hesaplanışı farklı. İçi boş kalıyor
	//Yani süslü parantez açmıyoruz. Sadece voidden önce abstract yazıyoruz.
	public abstract void calculate();

	//Sava metodu(fonksiyonu) tüm kredi hesaplama türlerinde aynı olduğu için bunun içine 
	//mesaj veriyoruz ve süslü parantez açıyoruz.(Normal bir metod gibi)
	public void save() {
		System.out.println("Kaydedildi.");
		
	}
}
