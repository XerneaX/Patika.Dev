package AbsoluteDiffNumberOfOccurrence;


public class Main {
    public static void main(String[] args){
        String str = "AAABAB";
        int diff =0;
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == 'A'){
                diff++;
            }else{
                diff--;
            }
        }
        System.out.println(Math.abs(diff));
    }
}
