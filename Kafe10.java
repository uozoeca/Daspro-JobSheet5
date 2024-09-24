import java.util.Scanner;

public class Kafe10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keanggotaan;
        int jmlKopi, jmlTeh, jmlRoti;
        double totalHarga, nominalBayar, hargaKopi = 12000.0, hargaTeh = 7000.0, hargaRoti = 20000.0;
        float diskon = 10 / 100f;
        System.out.println("Masukkan Harga Keanggotaan (true/false): ");
        keanggotaan = input.nextBoolean();
        System.out.println("Masukkan Jumlah Pembelian Kopi: ");
        jmlKopi = input.nextInt();
        System.out.println("Masukkan Jumlah Pembelian Teh: ");
        jmlTeh = input.nextInt();
        System.out.println("Masukkan Jumlah Pembelian Roti: ");
        jmlRoti = input.nextInt();
        totalHarga = (jmlKopi * hargaKopi) + (jmlTeh * hargaTeh) + (jmlRoti * hargaRoti);
        if (keanggotaan) {
            nominalBayar = totalHarga - (totalHarga * diskon);
        } else {
            nominalBayar = totalHarga;
        }
        System.out.println("Keanggotaan Pelanggan: " + (keanggotaan ? "Member" : "Non-member"));
        System.out.println("Item Pembelian " + jmlKopi + " Kopi, " + jmlTeh + " Teh, " + jmlRoti + " Roti");
        System.out.println("Nominal Bayar Rp " + nominalBayar);
    }
}