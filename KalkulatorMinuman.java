import java.util.Scanner;

import static java.lang.System.out;

public class KalkulatorMinuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        out.print("Masukkan kalori minuman: ");
        double kaloriMinuman = scanner.nextDouble();

        out.print("Masukkan gula (gram): ");
        double gula = scanner.nextDouble();

        // Asumsikan 1 gram gula = 4 kalori
        double kaloriDariGula = gula * 4;

        // Menghitung total kalori
        double totalKalori = kaloriMinuman + kaloriDariGula;

        out.println("SUDAH SAYA GANTI YA KACK: " + totalKalori);

        scanner.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }
}
