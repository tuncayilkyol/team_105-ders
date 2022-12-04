package basic_practice;

import java.util.Scanner;

public class Q7_StringTekrarliYazdirma {
    /* Kullanicidan 3 harften uzun bir kelime ve 10'dan kucuk bir sayi aliniz
       Kelimenin son 2 harfini girilen sayi kadar yanyana yazdiran bir program yaziniz

     ORN :
     INPUT : Kelime = Mustafa  Sayi = 3
     OUTPUT : fafafa
 */

    public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
        System.out.print("Bir kelime Giriniz:");
        String kelime= scan.next();

        System.out.print("10 dan küçük bir tamsayı girin:");
        int sayi= scan.nextInt();

        String son2Harf=kelime.substring(kelime.length()-2);

        for (int i = 1; i <=sayi ; i++) {
            System.out.print(son2Harf+" ");

        }

    }
}
