import java.util.Locale;
import java.util.Scanner;

public class MOD_2C {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in).useLocale(Locale.getDefault())) {
            
            String nama, mk, prodi;
            double nilai;
            
            System.out.print("Siapa Nama Anda : ");
            nama = input.nextLine();
            System.out.print("Nama Matakuliah : ");
            mk = input.nextLine();
            System.out.print("Program Studi : ");
            prodi = input.nextLine();
            
            System.out.print("Nilai Anda : ");
            nilai = input.nextDouble();
            
            System.out.println("--HASIL INPUTAN--");
            System.out.println("Nama\t\t : " + nama);
            System.out.println("Nama Matakuliah\t : " + mk);
            System.out.println("Program Studi\t : " + prodi);
            System.out.println("Nilai MK\t : " + nilai);
        }
    }
}