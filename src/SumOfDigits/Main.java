package SumOfDigits;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        String num = scanner.nextLine();

        String[] strArr = num.split("");
        int sum = 0;
        for (int i = 0; i < strArr.length; i++) {
            sum+= Integer.parseInt(strArr[i]);
        }

        System.out.println("Basamakların toplamı: " + sum);

    }
}
