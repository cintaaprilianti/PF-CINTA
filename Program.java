public class Program {
    public static void main(String[] args) {

        System.out.println("Ini adalah awal program");

        int a = 0;
        boolean kondisi = true;

        do {
            a++;
            System.out.println("Program ke-" + a);

            if (a == 10) {
                kondisi = false;
            }
        } while(kondisi);

        System.out.println("Ini adalah akhir program.");
    }
}
