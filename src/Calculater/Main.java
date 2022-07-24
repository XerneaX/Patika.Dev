package Calculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int num1,num2, operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayıyı giriniz");
        num1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");
        num2 = scanner.nextInt();
        System.out.println(" Toplama için 1 \n Çıkarma için 2 \n Çarpma için 3 \n Bölme için 4 \n ");
        operator = scanner.nextInt();
        switch (operator){
            case 1:{
                System.out.println(num1+num2);
                break;
            }
            case 2:{
                System.out.println(num1-num2);
                break;
            }
            case 3:{
                System.out.println(num1*num2);
                break;
            }
            case 4:{
                System.out.println(num1/num2);
                break;
            }
            default:{
                System.out.println("Yanlış İşlem");
                break;
            }

        }
    }
}
