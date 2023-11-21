import java.util.Scanner;

public class TebakPIN {
    public static void main(String[] args) {
        // PIN yang harus ditebak
        int pin = 4413;
        
        Scanner input = new Scanner(System.in);
        
		int Percobaan = 0;
        
        while (Percobaan < 3) {
            System.out.print("Masukkan PIN (4 digit): ");
            int tebakan = input.nextInt();
            
            if (tebakan == pin) {
                System.out.println("PIN yang Anda Masukkan Benar. Akses Diberikan.");
           } 
            if (Percobaan == 3) {
            System.out.println("Anda telah mencoba 3 kali. Akses ditolak.");
        }else {
                System.out.println("PIN salah. Percobaan ke-" + (Percobaan + 1));
                Percobaan++;
            }
        }
    }
}