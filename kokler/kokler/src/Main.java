import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        System.out.println("denklemin a değerini giriniz");
        double a = aa.nextDouble();
        Scanner bb=new Scanner(System.in);
        System.out.println("denklemin b değerini giriniz");
        double b = bb.nextDouble();
        Scanner cc=new Scanner(System.in);
        System.out.println("denklemin c değerini giriniz");
        double c= cc.nextDouble();
       double kokici= Math.sqrt(b*b-4*a*c);
       double pay1= kokici-b;
       double pay2= -kokici-b;
       double payda= 2*a;
       double kok1= pay1/payda;
       double kok2= pay2/payda;
       System.out.println("girdiğiniz denklemin kokleri şunlar"+kok1+","+kok2);
    }
}