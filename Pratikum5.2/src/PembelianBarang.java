import java.util.Scanner;
public class PembelianBarang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input total pembelian
        System.out.print("Masukkan Total Pembelian (Rp): ");
        double totalPembelian = input.nextDouble();

        double potonganHarga = 0;
        
        // Menggunakan switch untuk menentukan besaran potongan
        switch ((totalPembelian >= 50000) ? 1 : 0) {
            case 1:
                // Potongan 20% jika total pembelian >= 50.000
                potonganHarga = 0.20 * totalPembelian;
                break;
            case 0:
                // Potongan 5% jika total pembelian < 50.000
                potonganHarga = 0.05 * totalPembelian;
                break;
        }

        // Hitung jumlah yang harus dibayarkan
        double totalBayar = totalPembelian - potonganHarga;

        // Output hasil
        System.out.println("Total pembelian Rp. = " + totalPembelian);
        System.out.println("Besarnya potongan Rp. = " + potonganHarga);
        System.out.println("Jumlah yang harus dibayarkan Rp. = " + totalBayar);
    }
}