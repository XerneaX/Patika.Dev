package GradeAverageCalculater;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        int sum = 0, count = 0;
        System.out.println("Ders Notlarını giriniz.");

        System.out.println("Matematik notunu giriniz");
        math = scanner.nextInt();
        if(math >= 0 && math <= 100){
            count++;
            sum+=math;
        }

        System.out.println("Fizik notunu giriniz");
        physics = scanner.nextInt();
        if(physics >= 0 && physics <= 100){
            count++;
            sum+=physics;
        }

        System.out.println("Türkçe notunu giriniz");
        turkish = scanner.nextInt();
        if(turkish >= 0 && turkish <= 100){
            count++;
            sum+=turkish;
        }

        System.out.println("Kimya notunu giriniz");
        chemistry = scanner.nextInt();
        if(chemistry >= 0 && chemistry <= 100){
            count++;
            sum+=chemistry;
        }

        System.out.println("Müzik notunu giriniz");
        music = scanner.nextInt();
        if(music >= 0 && music <= 100){
            count++;
            sum+=music;
        }

        double average = sum/count;
        if(average >= 55){
            System.out.println("Geçti");
        }
        else{
            System.out.println("Kaldı");
        }
        
    }
}
