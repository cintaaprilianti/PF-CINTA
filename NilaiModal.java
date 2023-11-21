import java.util.Scanner;

public class NilaiModal {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Masukkan Modal = Rp ");
	
	System.out.print("Nilai Modal ");
	int nilaiModal = sc.nextInt();
	System.out.println("Persen Keuntungan ");
	int Untung = sc.nextInt();
	double Profit = nilaiModal + (nilaiModal * Untung);
	System.out.println("Modal " + nilaiModal);
	System.out.println("Persen Keuntungan " + Untung);
	System.out.println("Profit " + Profit);
	}
}	
	