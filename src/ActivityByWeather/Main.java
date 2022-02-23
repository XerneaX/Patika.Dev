package ActivityByWeather;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tempature;
        tempature = scanner.nextInt();

        if(tempature < 5){
            System.out.println("Kayak");
        }
        else if(tempature <= 15){
            System.out.println("Sinema");
        }
        else if(tempature <= 25){
            System.out.println("Piknik");
        }
        else {
            System.out.println("Yüzme");
        }

    }
}
