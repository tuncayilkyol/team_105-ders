package basic_practice;

import java.util.Scanner;

public class Q1_IsimSoyisimAyirma {
     // Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
     // ad ayrı soyad ayrı sekilde ekrana yazdırınız.

    public static void main(String[] args) {

        // subString methodu uzerinde islem yapilan String'in istenen bir parcasini size gri dondurur
// Bunu yaparken iki farkli olanak sunar:
// Ilki : 1 int parametre ister ve belirtilen index'ten String'in sonuna kadar size geri dondurur
// Ikincisi ise 2 tane int parametre ister, ilk int parametre baslangic index'ini isaret eder ve o index'i
// de dahil ederek verilen ikinci index'e kadar olan String'i size dondurur, ikinci index'teki karakter
// dahil degildir.

        Scanner agac=new Scanner(System.in);
        System.out.print("Lütfen ad ve soyadınızı giriniz:");
        String adSoyad=agac.nextLine();
        String ad=adSoyad.substring(0,adSoyad.indexOf(' '));
        String soyad=adSoyad.substring(adSoyad.indexOf(' ')+1);
        System.out.println("Adı:"+ad+"\nSoyadı:"+soyad);
    }
}
/* hocanın yaptığı
Scanner agac = new Scanner(System.in);
        System.out.print("Lutfen isim ve soyisminizi giriniz :");
        String adSoyad = agac.nextLine();
        String ad = adSoyad.substring(0,adSoyad.indexOf(' '));
        String soyad = adSoyad.substring(adSoyad.indexOf(' ')+1);
        System.out.println("ad = " + ad + "\nsoyad = " + soyad);
 */