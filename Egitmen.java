package kodlamaIoOdevi;

public class Egitmen {
	
	int id;
	String adi;
	String soyadi;
	
	public Egitmen() {
		System.out.println("Egitmen Constructorına Girdiniz");
	}
	
	public Egitmen(int id, String adi,String soyadi) {
		this();
		this.id =id;
		this.adi = adi;
		this.soyadi =soyadi;
	}

}
