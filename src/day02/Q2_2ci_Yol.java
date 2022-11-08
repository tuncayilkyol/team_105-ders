package day02;

import java.util.Scanner;

public class Q2_2ci_Yol {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        double vize,finalNo,devamNotu;
        System.out.println("vize notunu gir:\n"+
                "final notunugir:\n"+
                "devamNotu notunu gir:");
        vize = scan.nextDouble();
        finalNo = scan.nextDouble();
        devamNotu= scan.nextDouble();

        double ortalama= vize*0.1+finalNo*0.8+devamNotu*0.1;

        if(vize>100||finalNo>100||devamNotu>100 || vize<0||finalNo<0||devamNotu<0) {
            System.out.println("yanliş giriş");
        } else if (ortalama>=70 && ortalama<=100){
            System.out.println("geçtiniz"); // bu sout satırı if le aynı satıra yavılırsa süslü paranteze gerek yok
        } else if (ortalama>=60) System.out.println("şartlı geçtiniz");   //örnekteki gibi

        else  System.out.println("kaldınız");


    }
}
