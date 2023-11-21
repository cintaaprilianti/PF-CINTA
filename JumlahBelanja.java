import java.util.Scanner;

public class JumlahBelanja {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] items = {"item-0", "item-1", "item-2", "item-3", "item-4"};
        int[] hargaBarang = {2500, 3000, 4000, 5000, 6000};
        int[] dataArray = new int[5];
		
		System.out.println("Input jumlah barang belanja");
		
        for (int i = 0; i < 5; i++) {
            System.out.print("Jumlah belanja " + items[i] + " Rp " + hargaBarang[i] + ": ");
            dataArray[i] = sc.nextInt();
        }
		
		System.out.println("\nDaftar belanja dan harga: ");
		for (int i = 0; i < 5; i++) {
            System.out.println("Harga barang ke-" +i+ ", Rp " + hargaBarang[i] + ", " + dataArray[i] + " item: Rp " + (dataArray[i] * hargaBarang[i]));
        }

        int totalItemBelanja = 0;
        for (int i = 0; i < 5; i++) {
            totalItemBelanja += dataArray[i];
        }

        int totalBelanja = 0;
        for (int i = 0; i < 5; i++) {
            totalBelanja += dataArray[i] * hargaBarang[i];
        }
		
        System.out.println("\nTotal Item Belanja: " + totalItemBelanja);
        System.out.println("Total Belanja: Rp " + totalBelanja);
    }
}