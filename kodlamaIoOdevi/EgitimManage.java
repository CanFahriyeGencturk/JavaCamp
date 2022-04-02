package kodlamaIoOdevi;

public class EgitimManage {
	public void egitiminOgretmeniniSorgula(Egitim egitim, Egitmen[] egitmen) {
	
		for(int i=0; i<egitmen.length;i++) {
			if(egitim.egitimVerenOgretmeninIdsi == egitmen[i].id) {
				System.out.println("Eklenen Egitim Adı : " +egitim.egitimAdı+" Egitim Öğretmeni Adı: " +egitmen[i].adi+" "+egitmen[i].soyadi);
			}
			
		}
		
		

	}

}
