import java.util.*;



class ParagraphText {
    public String alphabeticalOrder(String input) {

        String str = "";
        String[] arr = input.split("[,. ]");
        Arrays.sort(arr);
        for ( int i=0; i<arr.length; i++) {
            str = str+arr[i]+" ";

        }
        return str;
    }
}
