public class GanjilGenap {
	public static void main(String[] args) {
	
		int[] dataArray = {1, 2, 3, 4, 5, 6, 7};
		
		for (int i = 0; i < dataArray.length; i++) {
			if (dataArray[i] % 2 == 0) {
				System.out.println(dataArray[i] + " adalah ANGKA GENAP");
			}else{
				System.out.println(dataArray[i] + " adalah ANGKA GANJIL");
			}
		}
	}
}	