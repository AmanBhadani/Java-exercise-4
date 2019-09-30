import  java.util.*;
import  java.util.regex.*;

class Regx{

    public boolean regx(String str){
        String regex = "\\bHarry\\b"; 
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(str); 
        if(matcher.find()){ 
            return true;
        }
        return false;
    }

}
