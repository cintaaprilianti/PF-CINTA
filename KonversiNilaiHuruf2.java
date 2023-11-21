import java.util.Scanner;

public class KonversiNilaiHuruf2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Huruf: ");
        char huruf = input.next().charAt(0);
        
        double nilaiIndeks;
        
        if (huruf == 'A') {
            nilaiIndeks = 4.0;
        } else if (huruf == 'B') {
            nilaiIndeks = 3.0;
        } else if (huruf == 'C') {
            nilaiIndeks = 2.0;
        } else if (huruf == 'D') {
            nilaiIndeks = 1.0;
        } else if (huruf == 'E') {
            nilaiIndeks = 0;
        } else {
            System.out.println("Maaf, konversi nilai tidak diketahui");
            return; 
        }
        
        System.out.println("Hasil konversi nilai huruf " + huruf + " adalah " + nilaiIndeks);
    }
}
