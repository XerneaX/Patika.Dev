package ChallengeTwo;

import java.util.Scanner;

public class Main {
    public static String EvenPairs(String str) {
        // code goes here
        for (int i = 0; i <str.length()-1 ; i++) {
            if(i==0 && Character.isDigit(str.charAt(i))){
                if(str.charAt(i) % 2 == 0 && str.charAt(i+1) % 2 ==0){
                    return "true";
                }
            }
            else{
                if(i!=0 &&Character.isDigit(str.charAt(i-1)) && Character.isDigit(str.charAt(i+1))){
                    if(str.charAt(i-1) % 2 == 0 && str.charAt(i+1) %2 == 0 && Character.isDigit(str.charAt(i))){
                        return "true";
                    }
                }

            }
        }
        return "false";
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(EvenPairs("f09r27i8e67"));
    }
}
