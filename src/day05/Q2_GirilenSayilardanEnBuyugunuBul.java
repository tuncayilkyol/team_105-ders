package day05;

import java.util.Scanner;

public class Q2_GirilenSayilardanEnBuyugunuBul {
    // Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
    public static void main(String[] args) {

        int enBuyukSayi=0;
        int sayac=0;


        Scanner scen=new Scanner(System.in);
        System.out.println("Lütfen her sayiden sonra entere basarak beş adet pozitif sayı giriniz: ");

        while(sayac<5){
           int sayi= scen.nextInt();
           if(sayi>enBuyukSayi) {
               enBuyukSayi=sayi;
           }
           sayac++;

        }
        System.out.println("Girilen en büyük sayi: "+enBuyukSayi);
    }
}
