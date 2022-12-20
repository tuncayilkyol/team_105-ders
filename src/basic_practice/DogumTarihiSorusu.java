package basic_practice;

import java.time.LocalDate;
import java.util.Scanner;

public class DogumTarihiSorusu {

/*
    Soru 8 :
        Task kullanicidan dogum tarihini isteyin ve gelen tarihi LocalDate
     clasindan bir degiskene atayin. Daha sonra kullanicinin girdigi dogum tarihini
     kendi dogum tarinizle kiyaslayin. Random tarih dogum tarihinizden sonra ise
     program kabul etmesin ve kullanici yeniden tarih girsin. Sonuc olarak girilen
     random tarih dogum gununuzden once olmali.
*/
    static Scanner scan = new Scanner(System.in);
    static int intGun;
    static int intAy;
    static int intYil;
    static LocalDate kullaniciDogumTarihi;
    static LocalDate benimDogumTarihim;

    public static void main(String[] args) {

        kullaniciDogumTarihi = tarihAl();


        System.out.println(" kullaniciDogumTarihi = " + kullaniciDogumTarihi);
        benimDogumTarihim = localDateMethod(05, 03, 2001);
        System.out.println("benimDogumTarihim  = " + benimDogumTarihim);

        if (kullaniciDogumTarihi.isAfter(benimDogumTarihim)) {
            System.out.println("girdiginiz tarih benim dogum gunumden sonra tekrar deneyiniz");
            tarihAl();
        } else {

            System.out.println("girdiginiz tarih benim dogum gunumden oncedir");
            System.out.println("kullaniciDogumTarihi = " + kullaniciDogumTarihi);
            System.out.println("benimDogumTarihim = " + benimDogumTarihim);

        }

    }

    private static LocalDate tarihAl() {
        System.out.println("tarih al metoduna hosgeldiniz");
        int gun = gunKontrol();
        int ay = ayKontrol();
        int yil = yilKontrol();
        kullaniciDogumTarihi = localDateMethod(gun, ay, yil);
        System.out.println("kullaniciDogumTarihi = " + kullaniciDogumTarihi);

        return kullaniciDogumTarihi;
    }

    public static int gunKontrol() {
        System.out.println("dogum gununuzu 1 ila 31 arasinda giriniz");
        intGun = scan.nextInt();
        while (intGun < 1 || intGun > 31) {
            System.out.println("yanlis giris yaptiniz tekrar giriniz");
            gunKontrol();
        }
        System.out.println("intGun = " + intGun);
        return intGun;

    }

    private static int ayKontrol() {
        System.out.println("dogdugunuz ayi bir ila 12 arasinda giriniz");
        intAy = scan.nextInt();
        while (intAy < 1 || intAy > 12) {
            System.out.println("yanlis giris yaptiniz tekrar giriniz");
            ayKontrol();
        }
        System.out.println("intAy = " + intAy);
        return intAy;

    }

    private static int yilKontrol() {
        System.out.println("dogdugunuz yili 1900 ila 2010 arasinda giriniz");

        intYil = scan.nextInt();

        while (intYil < 1900 || intYil > 2010) {
            System.out.println("yanlis giris yaptiniz tekrar giriniz");
            yilKontrol();
        }
        System.out.println("intYil = " + intYil);
        return intYil;

    }

    public static LocalDate localDateMethod(int day, int month, int year) {
        LocalDate localdate = LocalDate.of(year, month, day);
        // print full date
        //System.out.println("Date: " + localdate);
        return localdate;
    }
}