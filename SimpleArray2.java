import java.util.Scanner;

public class SimpleArray2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
			System.out.print("Jumlah data: ");
			int data = sc.nextInt();
		
		int[] dataArray = new int[data];
		
		System.out.println("\nInputkan data berikut:");
		for (int i = 0; i < data; i++) {
			System.out.print("Data ke-" + i + ": ");
			dataArray[i] = sc.nextInt();
		}	
		System.out.println("\nMenampilkan data");
		for (int i = 0; i < data; i++) {
			if (dataArray[i] % 2 == 0) {
				System.out.println(dataArray[i] + " -> GENAP");
			}else{
				System.out.println(dataArray[i] + " -> GANJIL");
			}
		}	
		int total = 0;
		for (int i = 0; i < data; i++) {
			total += dataArray[i];
		}		
		double mean = total / data;
		
		System.out.println("\nTotal Penjumlahan: " + total);
		System.out.println("Rata-Rata: " + mean);
		
	}
}	