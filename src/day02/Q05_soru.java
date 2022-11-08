package day02;

import java.util.Scanner;

public class Q05_soru {
    public static void main(String[] args) {

        /*
        Kullanicidan bir pozitif tam sayi isteyin,
        sayının tam kare olup olmadığını bulunuz,
        tamkare ise true değilse false yazdırınız.
        Ornek : input : 16, output: 4
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir tamsayı giriniz");
        int gsayi = scan.nextInt();

        int s1 = 1;
        int bayrak = 0;

        for (int i = 1; i < gsayi; i++) {
            s1 = i * i;
            if (s1 == gsayi ){
                bayrak++;
            }

        }
        if (bayrak != 0) System.out.println("true");
        else System.out.println("false");
    }
}

