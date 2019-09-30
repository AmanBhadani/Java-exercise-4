import java.util.*;


class Transpose {
    public String transpose(String str){
        StringBuilder bf = new StringBuilder();
        String st[]= str.split(" ");
        String result= "";
        for(String temp:st)
        {
            bf.append(temp);
            bf=bf.reverse();
            result= result+bf.toString()+" ";
            bf.setLength(0);
        }
        return result;

    }

}
