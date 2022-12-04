package öğrencilerPractice;

import java.util.Random;

public class Q2_SayiOrtalamasi {

    //Rastgele sayılardan oluşmuş 100 elemanlık tamsayı dizisindeki tüm elemanların
// ortalamasını alacak bir kod yazin.
// Rastgele oluşan 100 elemanlık sayı kümesi program yeniden her çalıştığında değişsin.
// Sabit elemanlı bir dizi vermeyin!

    public static void main(String[] args) {
        Random rnd=new Random();
        int[]arr=new int [100];
        int toplam=0;

        for (int i = 0; i <100 ; i++) {
            System.out.println("arrayin"+(i+1)+"elemani");


            arr[i]=rnd.nextInt(1000);
            System.out.println(arr[i]+" , ");
            toplam+=arr[i];
        }
        System.out.println("toplam : "+ toplam);
        System.out.println("toplamin ortalamzsi :"+toplam/100);
    }

}
