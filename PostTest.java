import javax.swing.JOptionPane;

public class PostTest {
    public static void main(String[] args) {
        String nama, nim, jenisKelamin, prodi, fakultas, angkatan;

        nama = JOptionPane.showInputDialog("Masukan Nama");
        nim = JOptionPane.showInputDialog("Masukan NIM");
        jenisKelamin = JOptionPane.showInputDialog("Masukan Jenis Kelamin");
        prodi = JOptionPane.showInputDialog("Masukan Program Studi");
        fakultas = JOptionPane.showInputDialog("Masukan Fakultas");
        angkatan = JOptionPane.showInputDialog("Masukan Angkatan");

        JOptionPane.showMessageDialog(null, 
            "Nama : " + nama + "\n" +
            "NIM : " + nim + "\n" +
            "Jenis Kelamin : " + jenisKelamin + "\n" +
            "Program Studi : " + prodi + "\n" +
            "Fakultas : " + fakultas + "\n" +
            "Angkatan : " + angkatan
        );
    }
}