import java.util.Scanner;

public class KonversiKodeNegara {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Masukkan Kode Negara (2 huruf): ");
        String kodeNegara = in.nextLine();

        String namaNegara;

        switch (kodeNegara) {
            case "ES":
                namaNegara = "Spain";
                break;
            case "TN":
                namaNegara = "Tunisia";
                break;
            case "ID":
                namaNegara = "Indonesia";
                break;
            case "MM":
                namaNegara = "Myanmar";
                break;
            case "IN":
                namaNegara = "India";
                break;
            default:
                namaNegara = "Maaf, kode negara tidak diketahui";
                break;
        }

        System.out.println("Kode Negara: " + kodeNegara);
        System.out.println("Nama Negara: " + namaNegara);
    }
}
