package öğrencilerPractice;

import java.util.Arrays;

public class Q1_MountainArray2 {
    /*
    MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod
    yazınız.

    Not:
    Mountain Array ==> [0, 2, 5, 3, 1]
    Bir array elemanları en büyük degerine kadar sürekli artan, en büyük degerinden sonra
    sürekli azalan deger alıyorsa Mountain Array' dir.

    Mountain Array Degil ==> [5, 2, 7, 1, 4]
    Bir array elemanları en büyük degerine kadar sürekli azalan,
    en büyük degerinden sonra sürekli artan deger alıyorsa Mountain Array degildir. (edited)
     */


    public static void main(String[] args) {

        int[] arr1 = {0, 2, 5, 3, 1};// m a
        int[] arr2 = {5, 2, 7, 1, 4};
        int[] arr3 = {2, 7};
        int[] arr4 = {5, 4, 3, 2};
        int[] arr5 = {2, 3, 4, 5, 6};
        int[] arr6 = {2, 3, 4, 5, 6, -2, -6};

        mountainArrayKontrol(arr1);
        mountainArrayKontrol(arr2);
        mountainArrayKontrol(arr3);
        mountainArrayKontrol(arr4);
        mountainArrayKontrol(arr5);
        mountainArrayKontrol(arr6);

    }


    public static void mountainArrayKontrol(int[] arr) {

        int maxSayi = arr[0];
        int maxSayiIndex = 0;
        boolean sonuc = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSayi) {
                maxSayi = arr[i];
                maxSayiIndex = i;
            }
        }

        if (maxSayiIndex == 0 || maxSayiIndex == arr.length - 1) {
            sonuc = false; //max sayinin yerini ayarladik
        }

        for (int i = 0; i < maxSayiIndex; i++) {
            if (arr[i] < arr[i + 1]) { //max sayiya kadar surekli artis var mi
                continue;
            } else {
                sonuc = false;
                break;
            }
        }

        if (sonuc) {
            for (int i = maxSayiIndex; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {//max sayidan sonra surekli azalis var mi
                    continue;
                } else {
                    sonuc = false;
                    break;
                }
            }
        }

        if (sonuc) System.out.println(Arrays.toString(arr) + "mountain arraydir");
        else System.out.println(Arrays.toString(arr) + "mountain array degildir");
    }
}