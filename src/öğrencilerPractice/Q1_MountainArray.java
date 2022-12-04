package öğrencilerPractice;

public class Q1_MountainArray{

    /*
   MOUNTAIN ARRAY SORUSU : *Verilen herhangi bir arrayin Mountain Array olup olmadıgını kontrol etmek için bir kod
yazınız.
Not:
Mountain Array ==> [0, 2, 5, 3, 1]
B!r array elemanları en büyük deger!ne kadar sürekli artan, en büyük degerinden sonra sürekl
i azalan deger alıyorsa Mountain Array' dir.
Mountain Array Degil ==> [5, 2, 7, 1, 4]
Bir array elemanları en büyük degerine kadar sürekli azalan, en büyük degerinden sonra sürekli artan deger alıyorsa Mounta!n Array degildir
    */
    public static void main(String[] args) {
        int[] arr={0,2};
        boolean sonuc=MountainArrBul(arr);
        System.out.println(sonuc);
    }
    private static boolean MountainArrBul(int[] arr) {
        //arr lengthi >3
        if (arr.length<3){
            return false;
        }
        int i=0;
        for ( i = 1; i < arr.length ; i++) {
            if (arr[i]<=arr[i-1]){
                break;
            }
        }
        //2,0
        if (i== arr.length||i==1){
            return false;
        }
        for (; i < arr.length ; i++) {
            if (arr[i]>=arr[i-1]){
                return false;
            }
        }
        return i== arr.length;
    }
}
