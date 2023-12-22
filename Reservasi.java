import java.util.Scanner;

public class Reservasi {
    public String nama;
    public int jumlah;
    public int nomorKamar;
    public int lamaReservasi;
    public int tanggal;

    public String getNama(){
        return nama;
    }
    public void setNama(String newNama) {
        this.nama = newNama;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setJumlah(int newJumlah) {
        this.jumlah = newJumlah;
    }
    public int getNomorKamar(){
        return nomorKamar;
    }
    public void setNomorKamar(int newNomorKamar) {
        this.nomorKamar = newNomorKamar;
    }
    public int getLamaReservasi(){
        return lamaReservasi;
    }
    public void setLamaReservasi(int newLamaReservasi) {
        this.lamaReservasi = newLamaReservasi;
    }
    public int getTanggal(){
        return tanggal;
    }
    public void setTanggal(int newTanggal) {
        this.tanggal = newTanggal;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nama: ");
        String namaBarang = sc.nextLine();
        System.out.print("Jumlah Orang: ");
        int harga = sc.nextInt();
        System.out.print("Nomor Kamar: ");
        int jumlah = sc.nextInt();
        System.out.print("Lama Reservasi: ");
        int pembayaran = sc.nextInt();
        System.out.print("Tanggal Reservasi: ");
        int total = sc.nextInt();
    }
}

