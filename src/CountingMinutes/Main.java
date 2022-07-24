package CountingMinutes;

import java.util.Scanner;

public class Main {
    public static int CountingMinutes(String str) {
        // code goes here
        String[] strArray = str.split("-");

        String[] oneMinArray = strArray[0].split(":");
        String[] twoMinArray = strArray[1].split(":");

        int oneM = Integer.parseInt(oneMinArray[1].substring(0,2));
        int twoM = Integer.parseInt(twoMinArray[1].substring(0,2));
        System.out.println("oneM-twoM");
        System.out.println(oneM);
        System.out.println(twoM);
        int mins = 0;
        if(oneMinArray[1].contains("p") && twoMinArray[1].contains("a")){
             mins = (twoM-oneM);
        }
        else {
            mins=oneM-twoM;
        }


        if(strArray[0].contains("a") && strArray[1].contains("p") || strArray[0].contains("p") && strArray[1].contains("a")){
                int oneH =Integer.parseInt(strArray[0].substring(1,3));
                int twoH=Integer.parseInt(strArray[1].substring(0,2));
                System.out.println("oneH-twoH");
                System.out.println(oneH);
                System.out.println(twoH);
                mins += 60*(oneH-twoH+12);
        }
        if(strArray[0].contains("a") && strArray[1].contains("a") || strArray[0].contains("p") && strArray[1].contains("p")){
            int oneH =Integer.parseInt(strArray[0].substring(1,3));
            int twoH=Integer.parseInt(strArray[1].substring(0,2));
            System.out.println("oneH-twoH");
            System.out.println(oneH);
            System.out.println(twoH);
            if(mins > 0){
                mins = 60*(oneH-twoH+24)-mins;
            }

        }

        return mins;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CountingMinutes(s.nextLine()));
    }
}
