import java.util.Scanner;

public class TahunKabisat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nMasukkan Tahun: ");
        int tahun = sc.nextInt();

        if (tahun % 4 == 0) {
            System.out.println(tahun + " adalah Tahun Kabisat.");
        } else {
            System.out.println(tahun + " bukan Tahun Kabisat.");
        }
    }
}
