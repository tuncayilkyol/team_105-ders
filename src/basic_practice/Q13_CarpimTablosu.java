package basic_practice;

public class Q13_CarpimTablosu {
/*
 Kullanicinin girdigi sayiya kadar carpim
 tablosunu bize yazdiran bir metod yazacagiz
     */
public static void main(String[] args) {
    int sayi=8;
    carpimTablosu(sayi);
}

    private static void carpimTablosu(int input) {

        for (int i = 1; i <= input; i++) {
            System.out.println();
            for (int j = 1; j <=input ; j++) {
                System.out.printf("%4d",i*j);// oluşacak en cok basamaklı sayıdan 1 fazla alınmalı
                                             //burda 100 olacağı için 4d aldık
            }
            //System.out.println(); burda da olabilir sout

        }
    }

}
