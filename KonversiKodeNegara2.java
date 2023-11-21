import java.util.Scanner;

public class KonversiKodeNegara2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan Kode Negara (2 huruf): ");
        String kodeNegara = in.next();
        
        String namaNegara;
        
        if (kodeNegara.equals ("ES")) {
            namaNegara = "Spain";
        } else if (kodeNegara.equals ("TN")) {
            namaNegara = "Tunisia";
        } else if (kodeNegara.equals ("ID")) {
            namaNegara = "Indonesia";
        } else if (kodeNegara.equals ("MM")) {
            namaNegara = "Myanmar";
        } else if (kodeNegara.equals ("IN")) {
            namaNegara = "India";
        } else {
            System.out.println("Maaf, kode negara tidak diketahui");
            return; 
        }
        
        System.out.println("Negara dengan Kode " + kodeNegara + " adalah " + namaNegara);
    }
}
