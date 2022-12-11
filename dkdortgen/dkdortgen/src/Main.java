import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner kisa= new Scanner(System.in);
    System.out.println("dikdörtgenin kısa kenar uzunluğunu girin");
    int kisakenar=kisa.nextInt();
    Scanner uzun= new Scanner(System.in);
    System.out.println("dikdörtgenin uzun kenarını giriniz");
    int uzunkenar= uzun.nextInt();
    int alan = (kisakenar*uzunkenar);
    System.out.println("dikdörtgenin alanı ="+ alan);
    }
}