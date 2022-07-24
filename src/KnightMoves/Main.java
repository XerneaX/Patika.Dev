package KnightMoves;

import java.util.Scanner;

public class Main {
    public static int KnightJumps(String str) {
        // code goes here
        //can move (+1,+2),(+2,+1),(-1,-2),(-1,+2),(-2,+1),(-2,-1),(+2,-1),(+1,-2)
        int[][] moves = {{+1,+2},{+2,+1},{-1,-2},{-1,+2},{-2,+1},{-2,-1},{+2,-1},{+1,-2}};
        int count = 0;
        for(int i = 0; i<moves.length; i++){
            int firstNum = Integer.parseInt(str.split(" ")[0].substring(1,2));
            int secondNum = Integer.parseInt(str.split(" ")[1].substring(0,1));
            if((firstNum + moves[i][0] <= 8 && firstNum + moves[i][0] >= 1) &&
                    (secondNum + moves[i][1] <= 8 && secondNum + moves[i][1] >= 1)){
                count++;
            }
        }
        return count;
    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(KnightJumps(s.nextLine()));
    }
}
