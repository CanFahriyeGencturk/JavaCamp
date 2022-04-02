package kodlamaIoOdevi;

public class Main {

	public static void main(String[] args) {
		
		String[] EgitimListesi = {"Javscript", "C#", "ANGULAR", "JAVA", "REACT", "PYTHON"};
		
		Egitmen egitmen1 = new Egitmen(1,"Engin", "Demiroğ");
		Egitmen egitmen2 = new Egitmen(2,"Test", "Egitmeni");
		Egitmen[] egitmen = {egitmen1,egitmen2}; 
		
		
	
		
		Egitim egitim1 = new Egitim(1,EgitimListesi[0],15,"Egitim Hakkında",egitmen1.id);
		Egitim egitim2 = new Egitim(2,EgitimListesi[1],2,"Egitim 2 Hakkında",egitmen2.id);
		Egitim egitim3 = new Egitim(3,EgitimListesi[2],3,"Egitim 3 Hakkında",egitmen1.id);
		
		EgitimManage egitimManage = new EgitimManage();
		egitimManage.egitiminOgretmeniniSorgula(egitim1, egitmen);
		egitimManage.egitiminOgretmeniniSorgula(egitim2, egitmen);
		egitimManage.egitiminOgretmeniniSorgula(egitim3, egitmen);
		
		
		

	}

}
