package DrawDiamond;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int star = input.nextInt();

        for (int i = 1; i <= star; i++) {
            for (int k = 1; k <= (star - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int k = 1; k < star; k++) {
            for (int l = 1; l <= k; l++) {
                System.out.print(" ");
            }
            for (int m = 1; m <= 2 * (star - k) - 1; m++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
