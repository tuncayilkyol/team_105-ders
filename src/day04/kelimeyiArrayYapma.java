package day04;

import java.util.Arrays;
public class kelimeyiArrayYapma {

    /*
         * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.

         toCharArray() methodunu kullanmayiniz!

         * Input : John
         * Output : [J, o, h, n]

         */
    public static void main(String[] args) {

        String name = "Semra";
        kelimeninHarfleriArrayi(name);
        kelimeninHarfleriArrayi("String");
    }

    public static void kelimeninHarfleriArrayi(String input){

        char[] output = new char[input.length()];

        for (int konum = 0; konum < input.length(); konum++) {
            output [konum] = input.charAt(konum);
        }
        System.out.println("Kelimenin harfleri array'i : " + Arrays.toString(output));
    }
}
