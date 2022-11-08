package day07;

import java.util.Arrays;

public class Q2_Arrays {
    public static void main(String[] args) {
        // 0 ve 1 index yer değişme

        String [] isimler = new String[3];
        isimler[0]="Ayse";
        isimler[1]="Fatma";
        isimler[2]="Hayriye";

        String bos =isimler[0];
        isimler[0]=isimler[1];
        isimler[1]=bos;
        System.out.println(Arrays.toString(isimler));
    }
}
