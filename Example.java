import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pilih merk HP yang Anda Inginkan (1-3):");
        System.out.println("1. IPhone");
        System.out.println("2. Samsung");
        System.out.println("3. Redmi");
        System.out.println("4. Google Pixel");

        int pilihan = sc.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih IPhone");
                break;
            case 2:
                System.out.println("Anda memilih Samsung");
                break;
            case 3:
                System.out.println("Anda memilih Redmi");
                break;
            case 4:
                System.out.println("Anda memilih Google Pixel");
                break;
            default:
                System.out.println("Pilihan tidak valid. Silakan pilih merk HP yang benar.");
        }
    }
}
