public class PrintRows {
    public static void main(String[] args) {
        int i;
        while ((i = Program.readNumber()) != 0)
            System.out.println(bestRectString(i, Program.readNumber()));
            //System.out.println(bestRowString(i));
            //System.out.println(bestSquareString(i));
    }
    
    public static String bestSquareString(int numOfRows) {
        String squareString2 = "";
        for (int i = 1; i <= Math.pow(numOfRows, 2); i++) // can typecast the value returned by Math.pow(numOfRows, 2) to an int here, but it is unnecessary
            squareString2 += (i % numOfRows == 0 ? "*\n" : "* ");
        return squareString2.trim();
    }
    
    public static String bestRectString(int length, int height) {
        String rectString = "";
        for (int i = 1; i <= length * height; i++)
            rectString += (i % length == 0 ? "*\n" : "* ");
        return rectString.trim();
    }
    
    public static String bestRowString(int numOfRows) {
        String rowString = "";
        for (int i = numOfRows; i >= 1; i--)
            for (int j = 1; j <= i; j++)
                rowString += (j == i ? "*\n" : "* ");
        return rowString.trim();
    }
    
    




    // works properly 
    public static String rectString(int length, int height) {
        String rectString = "";
        for (int i = 1; i <= height; i++) 
            for (int j = 1; j <= length; j++) {
                rectString += "*";
                if (i != height || j != length)
                    rectString += (j == length ? "\n" : " ");
            }
        return rectString;
    }
    
    // works properly
    public static String rectString2(int length, int height) {
        String rectString = "";
        int area = length * height;
        for (int i = 1; i <= area; i++) {
            rectString += "*";
            if (i != area)
                rectString += (i % length == 0 ? "\n" : " ");
        }
        return rectString;
    }
    
    // exactly the same as below in the comments section (works properly)
    public static String rowString(int numOfRows) {
        String rowString = "";
        for (int i = numOfRows; i >= 1; i--) 
            for (int j = 1; j <= i; j++) {
                rowString += "*";
                if (i != 1)
                    rowString += (j == i ? "\n" : " ");
            }
        return rowString;
    }
    
    // exactly the same as below in the comments section (works properly)
    public static String squareString(int numOfRows) {
        String squareString = "";
        for (int i = 1; i <= numOfRows; i++)
            for (int j = 1; j <= numOfRows; j++) {
                squareString += "*";
                if (i != numOfRows || j != numOfRows)
                    squareString += (j == numOfRows ? "\n" : " ");
            }
        return squareString;
    }
    
    // like bestSquareString, but saves the square of the numOfRows into a variable
    public static String squareString2(int numOfRows) {
        String squareString2 = "";
        int numOfRowsSquared = (int)Math.pow(numOfRows, 2);
        for (int i = 1; i <= numOfRowsSquared; i++)
            squareString2 += (i % numOfRows == 0 ? "*\n" : "* ");
        return squareString2.trim();
    }
    
    // checks to see whether the current index is equal to the numOfRows squared (i.e. checks to see whether current index is equal to the final index)
    public static String squareString3(int numOfRows) {
        String squareString3 = "";
        int numberOfRowsSquared = (int)Math.pow(numOfRows, 2);
        for (int i = 1; i <= numberOfRowsSquared; i++) {
            squareString3 += "*";
            if (i != numberOfRowsSquared)
                squareString3 += (i % numOfRows == 0 ? "\n" : " ");
        }
        return squareString3;
    }
    
    /*
    
    // ALTERNATE SOLUTIONS:
    
    // squareString:
    
    // makes sure that the current row index and the current column index are not equal to the final row index and the final column index (works properly)0
    public static String squareString(int numOfRows) {
        String squareString = "";
        for (int i = 1; i <= numOfRows; i++)
            for (int j = 1; j <= numOfRows; j++) {
                squareString += "*";
                if (i != numOfRows || j != numOfRows)
                    squareString += (j == numOfRows ? "\n" : " ");
            }
        return squareString;
    }
    
    // inefficient, uses an if-else statement, but the if portion does nothing (i.e. it has no function) (works properly)
    public static String squareString(int numOfRows) {
        String squareString = "";
        for (int i = 1; i <= numOfRows; i++)
            for (int j = 1; j <= numOfRows; j++) {
                squareString += "*";
                if (i == numOfRows && j == numOfRows) {
                    
                }
                else
                    squareString += (j == numOfRows ? "\n" : " ");
            }
        return squareString;
    }
    
    // version of squareString that works properly
    public static String squareString(int numOfRows) {
        String squareString = "";
        for (int i = 1; i <= numOfRows; i++)
            for (int j = 1; j <= numOfRows; j++)
                squareString += (j == numOfRows ? "*\n" : "* ");
        return squareString.trim();
    }
    
    // rowString:
    
    // version of rowString that works properly
    public static String rowString(int numOfRows) {
        String rowString = "";
        for (int i = numOfRows; i >= 1; i--) 
            for (int j = 1; j <= i; j++) {
                rowString += "*";
                if (i != 1)
                    rowString += (j == i ? "\n" : " ");
            }
        return rowString;
    }
    
    // version of rowString that prints out an extra newline character (\n) at the end of the String
    public static String rowString(int numOfRows) {
        String rowString = "";
        for (int i = numOfRows; i >= 1; i--) 
            for (int j = 1; j <= i; j++)
                rowString += (j == i ? "*\n" : "* ");
        return rowString;
    }
    
    // old version of row printing without returning a String
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print((j == i ? "*" : "* "));
            System.out.println();
        }
    }
    
    // old/best version of row printing without returning a String
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) 
            for (int j = 1; j <= i; j++)
                System.out.print((j == i ? "*\n" : "* "));
    }
    */
}
