import java.util.Scanner;

public class ParkirKendaraan04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi;
        int total = 0;

        do {
            System.out.print("\nMasukkan jenis kendaraan (1 = Mobil, 2 = Motor, 0 = Keluar): ");
            jenis = sc.nextInt();
            sc.nextLine(); 

            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan durasi parkir (jam): ");
                durasi = sc.nextInt();
                sc.nextLine();

                if (durasi > 5) {
                    total += 12500;
                } else {
                    if (jenis == 1) {
                        total += durasi * 3000;
                    } else {
                        total += durasi * 2000;
                    }
                }
            }
        } while (jenis != 0);

        System.out.println("\nTotal biaya parkir hari ini: Rp " + total);
        sc.close();
    }
}