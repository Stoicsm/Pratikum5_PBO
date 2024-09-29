import java.util.Scanner;

public class DilarangGemuk {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input berat badan dalam kilogram
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        // Input tinggi badan dalam sentimeter
        System.out.print("Masukkan tinggi badan (cm): ");
        int tinggiBadanCm = input.nextInt();

        // Mengkonversi tinggi badan ke meter
        double tinggiBadanM = tinggiBadanCm / 100.0;

        // Menghitung IMT
        double imt = beratBadan / (tinggiBadanM * tinggiBadanM);

        // Menentukan kategori IMT menggunakan switch case
        String kategori = "";

        switch ((imt >= 40) ? 4 : (imt >= 30) ? 3 : (imt >= 25) ? 2 : (imt >= 18.5) ? 1 : 0) {
            case 0:
                kategori = "Berat Badan Kurang";
                break;
            case 1:
                kategori = "Berat Badan Ideal";
                break;
            case 2:
                kategori = "Berat Badan Lebih";
                break;
            case 3:
                kategori = "Gemuk";
                break;
            case 4:
                kategori = "Sangat Gemuk";
                break;
            default:
                kategori = "Tidak Diketahui";
                break;
        }

        // Output hasil
        System.out.printf("IMT Anda: %.2f\n", imt);
        System.out.println("Kategori: " + kategori);
    }
}
