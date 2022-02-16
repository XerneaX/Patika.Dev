package CalculateBMI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //Kilo (kg) / Boy(m) * Boy(m)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz");
        double height = scanner.nextDouble();
        System.out.println("Kilonuzu giriniz");
        double weight = scanner.nextDouble();
        double BMI = weight/(height*height);
        System.out.println(BMI);

    }
}
