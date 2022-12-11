import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
Scanner yuks=new Scanner(System.in);
System.out.println("üçgenin yüksekliğini giriniz");
int yukseklik= yuks.nextInt();
Scanner tab=new Scanner(System.in);
System.out.println("taban uzunluğunu giriniz");
int taban= tab.nextInt();
int alan= (yukseklik*taban/2);
System.out.println("üçgenin alanı="+alan);
    }
}