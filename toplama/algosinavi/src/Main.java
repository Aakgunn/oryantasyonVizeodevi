import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int sayi1= (int)(System.currentTimeMillis()%10);
        int sayi2= (int)(System.currentTimeMillis()/7%10);
        Scanner girib= new Scanner(System.in);
        System.out.print(sayi1+"+"+ sayi2+"işlem sonucu kaçtır");
        int cevap= girib.nextInt();
        System.out.print(cevap==sayi1+sayi2);

    }

}