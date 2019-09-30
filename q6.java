import java.util.regex.*;


class Count{
    
            String count(String input, String pattern){
            Pattern patternCheck = Pattern.compile(pattern,Pattern.CASE_INSENSITIVE);
            Matcher matcher = patternCheck.matcher(input);
            String str ="";
            int count = 0;
            while (matcher.find()) {
                count++;
                str=str+("Found at:" + matcher.start() + "-" + matcher.end())+"\n";
            }
            return str;

        }
}
