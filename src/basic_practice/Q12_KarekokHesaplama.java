package basic_practice;

import java.util.Scanner;

public class Q12_KarekokHesaplama {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("bir pozitif tamsayi giriniz:");

        double sayi= scan.nextDouble();
        double kareKok=1;

        for (double i = 0; i*i <=sayi ; i+=0.001) {
            kareKok=i;
        }
        System.out.printf("%.3f",kareKok);
    }
}
