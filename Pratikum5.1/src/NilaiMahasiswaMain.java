import java.util.Scanner;

public class NilaiMahasiswaMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data mahasiswa
        System.out.print("Masukkan Nama Mahasiswa: ");
        String NamaMahasiswa = input.nextLine();

        System.out.print("Masukkan NPM: ");
        int NPM = input.nextInt();

        System.out.print("Masukkan Nilai Kehadiran: ");
        int NilaiKehadiran = input.nextInt();

        System.out.print("Masukkan Nilai Tugas: ");
        int NilaiTugas = input.nextInt();

        System.out.print("Masukkan Nilai UTS: ");
        int NilaiUTS = input.nextInt();

        System.out.print("Masukkan Nilai UAS: ");
        int NilaiUAS = input.nextInt();

        // Membuat objek NilaiMahasiswa
        NilaiMahasiswa Nilaimahasiswa = new NilaiMahasiswa(NamaMahasiswa, NPM, NilaiKehadiran, NilaiTugas, NilaiUTS, NilaiUAS);

        // Menghitung nilai akhir
        double NilaiAkhir = Nilaimahasiswa.NilaiAkhir();

        // Menentukan grade dan keterangan
        String grade = Nilaimahasiswa.grade(NilaiAkhir);
        String keterangan = Nilaimahasiswa.Keterangan(grade);

        // Output hasil
        System.out.println("\n--- Hasil ---");
        System.out.println("NPM: " + Nilaimahasiswa.getNPM());
        System.out.println("Nama Mahasiswa: " + Nilaimahasiswa.getNama());
        System.out.println("Nilai Akhir: " + NilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);
    }
}