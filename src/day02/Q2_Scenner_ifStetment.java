package day02;

import java.util.Scanner;

public class Q2_Scenner_ifStetment {

    public static void main(String[] args) {


        /*
    Bir dersten alinan vize, final ve devam puanlarinin girilip ortalama
    hesaplandiktan sonra dersten gecilip gecilmedigini consola yazdiran
    bir program yazalim.geçme notu 70   60-70 arası şartlı eşiş 60 altı kalıyor
     */
        // ortalama = vizenin %10'i + finalin %80'si + devam puaninin %10'u

        Scanner scan=new Scanner(System.in);
        System.out.print("vize notunu gir:");
        double vize=scan.nextDouble();
        System.out.print("final notunugir:");
        double finalNo=scan.nextDouble();
        System.out.print("devam notunu gir:");
        double devamNotu=scan.nextDouble();



        double ortalama= vize*0.1+finalNo*0.8+devamNotu*0.1;

        if(vize>100||finalNo>100||devamNotu>100 || vize<0||finalNo<0||devamNotu<0) {
            System.out.println("yanliş giriş");
        } else if (ortalama>=70 && ortalama<=100){
            System.out.println("geçtiniz"); // bu sout satırı if le aynı satıra yavılırsa süslü paranteze gerek yok
        } else if (ortalama>=60) System.out.println("şartlı geçtiniz");   //örnekteki gibi

        else  System.out.println("kaldınız");

    }

}
