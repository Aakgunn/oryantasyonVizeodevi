import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner giris= new Scanner(System.in);
        System.out.println("notunuzu girin");
        int not = giris.nextInt();
        if(not>=90)
            System.out.println(Math.max(40,50));
        else if(not>=80)
            System.out.println("notunuz B");
        else if(not>=70)
            System.out.println("notunuz C");
        else if(not>=60)
            System.out.println("notunuz d");
        else
            System.out.println("notunuz f kaldınız");
    }
}