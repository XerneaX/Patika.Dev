package CalculateGroceryPrice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        Armut : 2,14 TL
        Elma : 3,67 TL
        Domates : 1,11 TL
        Muz: 0,95 TL
        Patlıcan : 5,00 TL
         */
        System.out.println("Armut fiyatını giriniz:");
        double a = scanner.nextDouble();
        System.out.println("Elma fiyatını giriniz:");
        double e = scanner.nextDouble();
        System.out.println("Domates fiyatını giriniz:");
        double d = scanner.nextDouble();
        System.out.println("Muz fiyatını giriniz:");
        double m = scanner.nextDouble();
        System.out.println("Patlıcan fiyatını giriniz:");
        double p = scanner.nextDouble();

        double total = (a*2.14)+(e*3.67)+(d*1.11)+(m*0.95)+(p*5.00);
        System.out.println(total);

    }
}
