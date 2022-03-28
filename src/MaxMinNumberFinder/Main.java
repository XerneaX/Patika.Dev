package MaxMinNumberFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int countOfNumber = scanner.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <countOfNumber+1 ; i++) {
            System.out.printf("%d. Sayıyı giriniz: ", i);
            int num = scanner.nextInt();
            if (num > max){
                max = num;
            }
            if (num < min){
                min = num;
            }
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçük sayı: "+ min);
    }
}
