package day02;


import java.util.Scanner;

public class Q03_Soru {
    public static void main(String[] args) {


        //Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
        //dort islemden biri ile isleme koyup sonucunu yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki sayı giriniz:");
        double s1 = scan.nextDouble();
        double s2 = scan.nextDouble();
        System.out.println("Lütfen bir işlem seçin" +

                "\ntoplam icin:+" +
                "\ncıkarma icin:-" +
                "\ncarpma icin:*" +
                "\nbolme icin:/  giriniz");

        String secim = scan.next();

/*
        switch (secim) {

            case "+":

                System.out.println("  sonuc:\t\t "+ (s1 + s2));
                break;
            case "-":

                System.out.println("  sonuc:\t\t "+ (s1 - s2));
                break;
            case "*":

                System.out.println("  sonuc:\t\t "+ (s1 * s2));
                break;
            default:
                System.out.println("  sonuc:\t\t "+( s1 / s2));
            }

*/

        if (secim.contains("+")) {
            System.out.println("  sonuc: " + (s1 + s2));
        } else if (secim.contains("-")) {
            System.out.println("  sonuc: " + (s1 - s2));
        } else if (secim.contains("*")) {
            System.out.println("  sonuc: " + (s1 * s2));
        } else if (secim.contains("/")) {
            System.out.println("  sonuc: " + (s1 / s2));
        } else {
            System.out.println("hatalı giriş");
        }

    }
}



