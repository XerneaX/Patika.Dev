package EvenAndFourFinder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sum = 0;
        while(true){
            System.out.println("Sayı giriniz");
            num = scanner.nextInt();
            if(num % 4 == 0){
                sum+=num;
            }
            if(num % 2 == 1){
                break;
            }
        }
        System.out.println(sum);
    }
}
