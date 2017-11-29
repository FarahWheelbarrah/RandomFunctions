public class CheckString {
    public static void main(String[] args) {
        String toSearch;
        String forChecking;
        while (!(toSearch = readString("Enter string to search in: ")).equals("x") && !(forChecking = readString("Enter string check: ")).equals("x")) {
            System.out.println("The String \"" + toSearch + "\" does " + (containsString(toSearch, forChecking) ? "" : "not ") + "contain the String \"" + forChecking + "\"");
        }
    }
    
    private static boolean containsString(String toSearch, String forChecking) {
        int lengthDiff = toSearch.length() - forChecking.length();
        for (int i = 0; i <= lengthDiff; i++)
            for (int j = 0; j < forChecking.length() && forChecking.charAt(j) == toSearch.charAt(i + j); j++)
                if (j == forChecking.length() - 1)
                    return true;
        return false;
    }
    
    private static boolean containsString2(String toSearch, String forChecking) {
        int lengthDiff = toSearch.length() - forChecking.length();
        for (int i = 0; i <= lengthDiff; i++) {
            int lastCheckIndex = i + forChecking.length() - 1;
            for (int j = i; j <= lastCheckIndex && toSearch.charAt(j) == forChecking.charAt(j - i); j++)
                if (j == lastCheckIndex) // could have a boolean variable that is switched to true once something happens
                    return true;
        }
        return false;
    }
    
        //return false;
    //}
                
            //if (matchesChars(i, toSearch, forChecking))
                //return true;
        //return false;
    //}
    
    private static boolean matchesChars(int startingindex, String toSearch, String forChecking) {
        //for (int i = startingindex; i < forChecking.length(); i++) {
            //if (
        //}
    return true;
    }
    
    private static String readString(String prompt) {
        System.out.print(prompt);
        return In.nextLine();
    }
    
     /* PREVIOUS VERSION - WORKING:
    
    private static boolean containsString(String toSearch, String forChecking) {
        for (int i = 0; i <= toSearch.length() - forChecking.length(); i++)
            for (int j = i; j < i + forChecking.length() && toSearch.charAt(j) == forChecking.charAt(j - i); j++)
                if (j == i + forChecking.length() - 1) // could have a boolean variable that is switched to true once something happens
                    return true;
        return false;
    }*/
}
