package One;

public class Main {
    public static int returnMax(int[] nums){
        int max = -1;
        for (int i = 0; i < nums.length ; i++) {
            if(nums[i] > max){
                max = nums[i];
            }
        }

        return max;
    }

    public static String returnDuplicates(String my_input){
        String d = "";
        for (int i = 0; i <my_input.length() ; i++) {
            int count = 0;
            for (int j = 0; j <my_input.length() ; j++) {
                if(my_input.charAt(i) == (my_input.charAt(j))){
                    count ++;
                }
                if(count >= 2 ) {
                    if (d.length() == 0) {
                        d += my_input.charAt(i);
                    } else if (!d.contains(String.valueOf(my_input.charAt(i)))) {
                        d += my_input.charAt(i);
                    }
                }
                }
            }

        return d;
    }

    public static void main(String[] args){
//        System.out.println(
//                returnMax(new int[]{1, 2,13,4,4,55,85,7, 3,85})
//        );

        System.out.println(returnDuplicates("improper"));
    }
}



