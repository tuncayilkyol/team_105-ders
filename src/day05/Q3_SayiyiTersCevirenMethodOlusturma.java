package day05;

public class Q3_SayiyiTersCevirenMethodOlusturma {
    /*
     * Interview questions…
     *
     * write a return method to reverse number
     *
     * Input : 12345 Output : 54321
     */
    public static void main(String[] args) {
        int input = 345678;
        System.out.println(ReverseNumber(input));
    }

    public static int ReverseNumber(int input) {

        int reverseNum = 0;
        while (input > 0) {
            reverseNum = input % 10 + reverseNum * 10;
            input = input / 10;
        }
        return reverseNum;
    }


}
/* 2.yöntem
 public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            System.out.print("sayiyi giriniz :");
            int sayi = scan.nextInt();
            terscevir(sayi);
        }
        public static void terscevir ( int sayi){

            while (sayi > 0) {
                System.out.print(sayi % 10);
                sayi /= 10;
            }

        }


 */