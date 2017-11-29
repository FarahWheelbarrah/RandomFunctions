public class NumberPrinter {
    private static final String[] ONES = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static final String[] TEENS = {"", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static final String[] TENS = {"", "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static final String[] SUFFIXES = {"", "", "", "hundred", "thousand"};
    private static final String[][] UNITSARRAYS = {ONES, TENS};
    
    public static void main(String[] args) {
        int number;
        while ((number = readInt("Enter number from 1 to 9999: ")) != 0) {
            System.out.println(wordNumber(number));
        }
    }
    
    private static String wordNumber(int number) {
        String wordNumber = "";
        int numberLength = String.valueOf(number).length();
        for (int i = numberLength; i > 0; i--) {
            int reductionOperand = (int)Math.pow(10, i - 1);
            int digit = number / reductionOperand % 10;
            if (digit == 0)
                continue;
            int units = (i > UNITSARRAYS.length ? 0 : i - 1);
            if (digit == 1 && units == 1 && number % reductionOperand != 0) {
                wordNumber += TEENS[number % reductionOperand];
                break;
            }
            wordNumber += UNITSARRAYS[units][digit];
            if (number % 10 == 0 && units == 1 || i == 1)
                break;
            wordNumber += " ";            
            if (i >= 3) {
                wordNumber += SUFFIXES[i];                                            
                if (number % reductionOperand == 0)    
                    break;
                wordNumber += " ";
                if (i == 3 || number % reductionOperand < reductionOperand / 10) 
                    wordNumber += "and ";
            }
        }
        return wordNumber;
    }
            
    private static int readInt(String prompt) {
        System.out.print(prompt);
        return In.nextInt();
    }
}