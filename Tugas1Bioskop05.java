import java.util.Scanner;

public class Tugas1Bioskop05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int     jumlahTiket,
                totalHarga,
                totalTiket = 0,
                diskon = 0,
                hargaTiket = 50000,
                totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid, masukkan ulang.");
                continue;
            }

            totalHarga = jumlahTiket * hargaTiket;

            if (jumlahTiket > 10) {
                diskon = 15;
            } else if (jumlahTiket > 4) {
                diskon = 10;
            }

            totalHarga = totalHarga - (totalHarga * diskon / 100);

            totalTiket += jumlahTiket;
            totalPenjualan += totalHarga;
            
            System.out.println("Total harga\t: Rp" + totalHarga);
        }

        System.out.println("\nTotal tiket terjual\t: " + totalTiket);
        System.out.println("Total penjualan\t\t: Rp" + totalPenjualan);

    }
}
