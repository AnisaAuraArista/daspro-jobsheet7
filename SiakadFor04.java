import java.util.Scanner;
public class SiakadFor04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidaklulus = 0;
       
        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
           
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
           
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            } else {
                tidaklulus++;
            }
        }
       
        System.out.println("\n=== Hasil Akhir ===");
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah Mahasiswa lulus : " + lulus);
        System.out.println("Jumlah Mahasiswa tidaklulus : " + tidaklulus);

        sc.close();
    }
    
}
