package TaximeterCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int km;
        System.out.println("Kilometre bilgisini giriniz");
        km = scanner.nextInt();

        double totalCost = km * 2.20 + 10;
        if(totalCost<20){
            totalCost = 20;
        }
        System.out.println(totalCost);
    }
}
