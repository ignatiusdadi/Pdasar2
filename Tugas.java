import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("=== Perhitungan Nilai Akhir Pemrograman Dasar ===");
            System.out.print("Masukkan Nilai Mandiri/Praktikum (MP) : ");
            double mp = input.nextDouble();

        System.out.print("Masukkan Nilai UTS                    : ");
        double uts = input.nextDouble();

        System.out.print("Masukkan Nilai UAS                    : ");
        double uas = input.nextDouble();

        // Rumus: (6*MP + 2*UTS + 2*UAS) / 10
        double nilaiAkhir = (6 * mp + 2 * uts + 2 * uas) / 10;

        System.out.println("-------------------------------------------------");
        System.out.println("Nilai Akhir : " + nilaiAkhir);
        
        }
    }
}