import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("uc sayı giriniz:");
        double sayi1 = input.nextDouble();
        double sayi2 = input.nextDouble();
        double sayi3 = input.nextDouble();
        double toplam = (sayi1 + sayi2 + sayi3 );
        double ortalama = toplam / 3 ;
        System.out.println(sayi1 + "" + sayi2 + "" + sayi3 + "" + "ortalam =" + ortalama);
    }
}