package CalculateCircle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //𝜋 sayısını = 3.14 alınız.
        //Formül : (𝜋 * (r*r) * 𝛼) / 360

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz:");
        double r = scanner.nextDouble();
        System.out.println("Dairenin merkez açı ölçüsünü giriniz");
        double a = scanner.nextDouble();
        double pi = 3.14;
        double area = (pi * (r*r) * a)/ 360;
        System.out.println(area);
    }
}
