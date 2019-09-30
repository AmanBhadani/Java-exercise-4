import java.util.*;



class CountCharacterOccurence {
    public int countOccurence(String input,String check) {
        String removed = input.replaceAll(check,"");
        return input.length()-removed.length();
    }


}