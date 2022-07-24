package CalculateTriangle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double firstEdge = scanner.nextShort();
        double secondEdge = scanner.nextShort();
        double thirdEdge = scanner.nextShort();
        double perimeter = (firstEdge+secondEdge+thirdEdge)/2;

        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        double area = Math.sqrt(perimeter*(perimeter-firstEdge)*(perimeter-secondEdge)*(perimeter-thirdEdge));
        System.out.println(area);
    }
}
