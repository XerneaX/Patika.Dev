package FindSecondLargestNumber;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] num = new int[]{1, 2, 5, 78, 3, 12};
        Arrays.sort(num);
        System.out.println(num[num.length - 2]);
    }
}
