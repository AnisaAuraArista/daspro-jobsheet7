import java.util.Scanner;
public class PenjualanTiketBioskop04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int HargaTiket = 50000;
        int totalTiketTerjual = 0;
        double totalPendapatan = 0;
        int jumlahTiket;

        System.out.println("=== Program Penjualan Tiket Bioskop ===");

        while (true) {
            System.out.print("\nMasukkan jumlah tiket yang dibeli (ketik 0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            
            if (jumlahTiket == 0) {
                System.out.println("Input selesai. Menghitung total penjualan...");
                break;
            }
            
            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid! Jumlah tiket tidak boleh negatif. Coba lagi.");
                continue; 
            }
            
            double harga = jumlahTiket * HargaTiket;
            double diskon = 0;
           
            if (jumlahTiket > 10) {
                diskon = 0.15 * harga;
            } else if (jumlahTiket > 4) {
                diskon = 0.10 * harga;
            }

            double totalHarga = harga - diskon;
           
            totalTiketTerjual += jumlahTiket;
            totalPendapatan += totalHarga;
        
            System.out.println("Total harga sebelum diskon : Rp " + harga);
            System.out.println("Diskon                     : Rp " + diskon);
            System.out.println("Total yang harus dibayar  : Rp " + totalHarga);
        }
        
        System.out.println("\n=== Rekap Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual     : " + totalTiketTerjual);
        System.out.println("Total pendapatan        : Rp " + totalPendapatan);
        System.out.println("=== Program selesai ===");

        sc.close();
    }
}