import java.util.Scanner;

public class PemilihanBilangan10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Sebuah Angka");
        int angka = sc.nextInt();
        String hasil;
        hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Negatif";
        System.out.println(angka + " adalah " + hasil);
    }
}