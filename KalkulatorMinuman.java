import java.util.Scanner;

public class KalkulatorMinuman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kalori minuman: ");
        double kaloriMinuman = scanner.nextDouble();

        System.out.print("Masukkan gula (gram): ");
        double gula = scanner.nextDouble();

        // Asumsikan 1 gram gula = 4 kalori
        double kaloriDariGula = gula * 4;

        // Menghitung total kalori
        double totalKalori = kaloriMinuman + kaloriDariGula;

                System.out.println("Total kalori minuman: " + totalKalori);

        scanner.close(); // Menutup scanner untuk mencegah kebocoran sumber daya
    }
}
