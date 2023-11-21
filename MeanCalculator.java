public class MeanCalculator {
    public static void main(String[] args) {

        int[] angka = {46, 47, 48, 49, 50};
        double mean = hitungMean(angka);
        System.out.println("Rata-rata: " + mean);
    }
    public static double hitungMean(int[] array) {
        int jumlah = 0;
        for (int angka : array) {
            jumlah += angka;
        }
        return (double) jumlah/array.length;
    }
}
