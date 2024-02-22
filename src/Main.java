import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Scanner sinifini ve degiskenleri tanimladik.
        Scanner input = new Scanner(System.in);
        int n;
        double total = 0;

        // Kullanicidan deger alip ilgili degiskene atadik.
        System.out.print("\nBir n sayisi gir: ");
        n = input.nextInt();

        // Sonuca ulasmak icin for dongusu yardimiyla gerekli matematiksel islemleri gerceklestirdik.
        for (double i = 1; i <= n; i++) {
            total += (1 / i);
        }

        // Sonucu kullaniciya ilettik.
        System.out.print("\nSonuc : " + total);
    }
}