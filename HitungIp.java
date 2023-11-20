public class HitungIp {
	public static void main(String args[]) {
		int sksPemrogramanFundamental = 4;
		int sksKalkulus = 3;
		int sksSistemDigital = 2;
		double nilaiIndexPF = 3.5;
		double nilaiIndexKalkulus = 4.0;
		double nilaiIndexSisDig = 2.75;
		
		double totalIndex = (sksPemrogramanFundamental * nilaiIndexPF) + 
		(sksKalkulus * nilaiIndexKalkulus) + (sksSistemDigital * nilaiIndexSisDig);
		int totalSks = sksKalkulus + sksPemrogramanFundamental + sksSistemDigital;
		double ip = totalIndex / totalSks;
		
		System.out.println("Ip Kamu adalah " + ip);
	}
}	