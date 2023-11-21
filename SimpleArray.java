public class SimpleArray {
	public static void main(String[] args) {
	
		int[] dataArray = {2, 3, 10, 9, 19, 4 };
		
		int total = 2 + 3 + 10 + 9 + 19 + 4;
		
		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i] % 2 == 0) {
				System.out.println(dataArray[i] + " adalah ANGKA GENAP");
			}else{
				System.out.println(dataArray[i] + " adalah ANGKA GANJIL");
			}
		}
		System.out.println("Total penjumlahan adalah: " + total);
			double mean = total/6;
			System.out.println("Rata-rata adalah: " + mean);
	}
}	