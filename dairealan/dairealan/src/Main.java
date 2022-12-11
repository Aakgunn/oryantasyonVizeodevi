import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    final double PI= 3.14;
    Scanner giris=new Scanner(System.in);
    System.out.println("dairenin yarı çapını giriniz");
    double yaricap= giris.nextDouble();
    double alan=(PI*yaricap*yaricap);
    System.out.println("dairenin alanı="+alan);
    }
}