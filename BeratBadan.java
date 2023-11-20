public class BeratBadan {
	public static void main(String[] args) {
		int BeratAgung = 55;
		int BeratBagus = 70;
		int BeratCakra = 65;
		int BeratDeni = 60;
		int BeratEdi = 75;
	
		int totalBeratBadan = BeratAgung + BeratBagus + BeratCakra + BeratDeni + BeratEdi;
		double mean = totalBeratBadan/5;
	
		System.out.println("Jumlah Total Berat Badan " + totalBeratBadan);
		System.out.println("Rata-rata Berat Badan " + mean);
	}
}	