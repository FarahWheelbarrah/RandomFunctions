public class TrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeros(1010100000));
    }
    
    
    private static int trailingZeros(int input) {
        int trailingZeros = 0;
        for (int i = String.valueOf(input).length() - 1; String.valueOf(input).charAt(i) == '0'; i--)
            trailingZeros++;
        return trailingZeros;
    }
}

