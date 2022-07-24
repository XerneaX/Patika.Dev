package PowOfFiveAndFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scanner.nextInt();
        for (int i = 0; i < num ; i++) {
            System.out.println("4ün kuvvetleri: " +Math.pow(4,i));
            System.out.println("5in kuvvetleri: " +Math.pow(5,i));
        }
    }
}
