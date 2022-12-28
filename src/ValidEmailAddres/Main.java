package ValidEmailAddres;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args){
        String[] mails = {"kimberly@yandex.com", "john_3@gmail.com", "mike+gmail@gmx.net", "@gmail.com@gm.com"};
        Pattern p = Pattern.compile("^[A-Za-z].*?@gmail\\.com$");
        mails = Arrays.stream(mails).filter(mail->{
            Matcher m = p.matcher(mail);
            if(m.find()){
                return true;
            }
            return false;
        }).toArray(String[]::new);
        System.out.println(mails);

    }
}
