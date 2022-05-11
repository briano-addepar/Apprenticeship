package core;

public class StringCutter {
    public static String cut(String stringToCut) {
        StringBuilder returnString= new StringBuilder();
        for (int i = 2; i < stringToCut.length(); i= i+3) {
            returnString.append(stringToCut.charAt(i));
        }
        return returnString.toString();
    }
}
