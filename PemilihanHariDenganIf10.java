import java.util.Scanner;

public class PemilihanHariDenganIf10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka 1-7: ");
        int day = input.nextInt();
        if (day >= 1 && day <= 5) {
            System.out.println("Today is a Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Today is a Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
}