package DivideThreeFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int num = scanner.nextInt();
        int sum = 0, count = 0;
        double average= 0.;
        for (int i = 0; i <num ; i++) {
            if(i % 12 == 0){
                System.out.println(i);
                sum+=i;
                count++;
            }
        }
        average = sum / count;
        System.out.println("3 ve 4 e bölünen sayıların ortalaması: " + average);
    }
}
