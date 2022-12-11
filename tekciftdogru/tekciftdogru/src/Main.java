import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner giris= new Scanner(System.in);
    System.out.println("bir sayı girin");
    int sayi1= giris.nextInt();
    if(sayi1%2==0){
        System.out.println("girdiğiniz sayı çift");

    }
    if(sayi1%2==1){
        System.out.println("sayı tek");
    }
    }
}