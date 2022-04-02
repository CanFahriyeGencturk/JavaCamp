package kodlamaIoOdevi;

public class Egitim {
	
	int id; // O nesneyi diğer nesnelerden ayıran temel nokta
	String egitimAdı;
	int egitimSuresi;
	String detail;
	int egitimVerenOgretmeninIdsi;
	
	
	
	public Egitim() {
		System.out.println("Contructor Fonksiyonuna Girdi");
		
	}
	public Egitim(int id,String egitimAdı,int egitimSuresi,String detail,int egitimVerenOgretmeninIdsi) {
		this();
		this.id =id;
		this.egitimAdı = egitimAdı;
		this.egitimSuresi = egitimSuresi;
		this.detail = detail;
		this.egitimVerenOgretmeninIdsi = egitimVerenOgretmeninIdsi;
	
	}
	
	
	

}
