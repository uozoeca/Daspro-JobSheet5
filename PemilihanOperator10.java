import java.util.Scanner;

public class PemilihanOperator10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angka1, angka2, hasil = 0;
        char operator;
        System.out.println("Masukkan Angka 1: ");
        angka1 = sc.nextDouble();
        System.out.println("Masukkkan Angka 2: ");
        angka2 = sc.nextDouble();
        System.out.println("Masukkan Operator (+ - * /)");
        operator = sc.next().charAt(0);
        if (operator == '+') {
            hasil = angka1 + angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        else if (operator == '-') {
            hasil = angka1 - angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        else if (operator == '*') {
            hasil = angka1 * angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        else if (operator == '/') {
            hasil = angka1 / angka2;
            System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
        }
        else {
            System.out.println("Maaf Perintah Tidak Jelas");
        }

    }
}
