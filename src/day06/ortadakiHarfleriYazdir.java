package day06;

import java.util.Scanner;

public class ortadakiHarfleriYazdir {
    /*
    Tek sayida harf iceren bir String degiskenin ortasindaki harfi
    konsolda yazdirmak icin bir Java programi yaziniz.
    Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdiran method create ediniz.

    ORNEK:
       INPUT  :  Python
       OUTPUT :  th
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String input = scan.next();

        System.out.println(ortadakiHarfiYazdir(input));
    }

    public static String ortadakiHarfiYazdir(String input) {

        int uzunluk = input.length();
        int ortadakiIndex = uzunluk/2;
        int baslangicIndex = ortadakiIndex-1;
        int bitisIndex = ortadakiIndex+1;

        if (uzunluk % 2 == 0)  return input.substring(baslangicIndex,bitisIndex);
        else                   return input.substring(ortadakiIndex,ortadakiIndex+1);
    }
}
