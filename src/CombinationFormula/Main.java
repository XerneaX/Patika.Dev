package CombinationFormula;

import java.util.Scanner;

public class Main {
    public static int factorial(int num){
        if(num == 0 ){
            return 1;
        }
        return num * factorial(num-1);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("N değerini giriniz");
        int n = scanner.nextInt();

        System.out.println("R değerini giriniz");
        int r = scanner.nextInt();

        if(n > 0 && n-r > 0){
            double combination = factorial(n) / (factorial(r) * factorial(n-r));
            System.out.println(combination);
        }
        else{
            System.out.println("Sayılar hatalı");
        }


    }


}
