package EBOBEKOK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1, num2, min, max, ebob = 0, ekok = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz : ");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz : ");
        num2 = input.nextInt();
        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
        while (true) {
            if (num1 % min == 0 && num2 % min == 0) {
                ebob = min;
                break;
            } else {
                min -= 1;
            }
        }
        while (true) {
            if (max % num1 == 0 && max % num2 == 0) {
                ekok = max;
                break;
            } else {
                max += 1;
            }
        }
        System.out.printf("Ekok : %d\nEbob : %d", ekok, ebob);
        input.close();
    }
}
