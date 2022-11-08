package day02;

import java.util.Scanner;
public class Q2_hocanin {
    public static void main(String[] args) {
        /*
        bu cllas eksik vize ve devam negatif girilse de çalışıyor...
         */
        Scanner scan = new Scanner(System.in);
        double vize, finalNotu, devam;

        System.out.print("Vize notunuzu giriniz : ");
        vize = scan.nextDouble();
        System.out.print("Final notunuzu giriniz : ");
        finalNotu = scan.nextDouble();
        System.out.print("Devam notunuzu giriniz : ");
        devam = scan.nextDouble();

        double ort = (vize*0.1) + (finalNotu*0.8) + (devam*0.1);
        if (ort>100 || ort<0){
            System.out.println("Yanlis giris yaptiniz, lutfen gecerli degerler giriniz!!!!!");
        }else if(ort>=70){
            System.out.println("Ortalamaniz = " + ort +" Tebrikler, caliskan Nesrin");}
        else if(ort>=60){
            System.out.println("Ortalamaniz = " + ort +" Sartli gectiniz, Agno'nuz 1.8'in uzerinde ise gecmis olursunuz");
        }else System.out.println("Ortalamaniz = " + ort +" Bu sefer olmadi seneye Mujgan :'(");
    }
}
