package HarmonicCalculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sayıyı giriniz");
        int num = scanner.nextInt();
        double sum = 0.;
        for (double i = 1; i <= num; i++) {
            sum+= 1/i;
        }
        System.out.println(sum);
    }
}
