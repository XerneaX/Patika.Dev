package CompareThreeNumbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        int max,min,mid;
        System.out.println("1. sayıyı giriniz");
        num1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz");
        num2 = scanner.nextInt();
        if(num1 > num2){
            max = num1;
            min = num2;
        }else{
            max = num2;
            min = num1;
        }
        System.out.println("3. sayıyı giriniz");
        num3 = scanner.nextInt();
        if(max == num1){
            if(num3 > num1){
                max = num3;
                mid = num1;
            }
            else{
                if(num3 > num2){
                    mid = num3;
                }else{
                    mid = num2;
                    min = num3;
                }
            }
        }
        else{
            if(num3 > num2){
                max = num3;
                mid = num2;
            }
            else{
                if (num3 > num1){
                    mid = num3;
                }
                else{
                    mid = num1;
                    min = num3;
                }
            }
        }

        System.out.println(max + ">" + mid + ">" + min);
    }
}
