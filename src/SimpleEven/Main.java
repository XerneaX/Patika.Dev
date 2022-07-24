package SimpleEven;

import java.util.*;
import java.io.*;

class Main {

  public static String SimpleEvens(long num) {
    // code goes here
    char[] chars = (""+num).toCharArray();
    for(int i = 0; i<chars.length; i++){
      if(chars[i]%2!= 0){
        return "false";
      }
    }
    return "true";
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(SimpleEvens(s.nextLong()));
  }

}