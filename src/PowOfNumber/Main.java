package PowOfNumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Taban değerini griniz");
        int base = scanner.nextInt();
        System.out.println("Üst değerini giriniz");
        int exp = scanner.nextInt();

        int powOfNum = 1;
        for (int i = 1; i <= exp ; i++) {
            powOfNum*=base;
        }

        System.out.println(powOfNum);

    }
}
