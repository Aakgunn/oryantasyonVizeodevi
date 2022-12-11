import java.util.Scanner;
public class taşKağıtMakas{
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        System.out.println("taş=0,kağıt=1,makas=3");
        int oyuncu = giris.nextInt();
        int bilgisayar = (int)(0+Math.random()*3);
        if(bilgisayar==0 && oyuncu==3)
            System.out.print("kaybettiniz bilgisayar taş yaptı" + bilgisayar);
        else if (bilgisayar == 1 && oyuncu == 0)
            System.out.print("kaybettiniz bilgisayar kağıt yaptı" + bilgisayar);
        else if (bilgisayar == 3 && oyuncu == 1)
            System.out.print("kaybettiniz" + bilgisayar);
        else
            System.out.print("kazandınız"+bilgisayar );
    }
}