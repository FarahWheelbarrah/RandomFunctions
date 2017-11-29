import java.util.ListIterator;
import java.util.LinkedList;

public class Program {
    public static void main(String[]  args) {
        int number;
        LinkedList<Integer> list = new LinkedList<>();
        while ((number = readNumber()) != 0)
            list.add(number);
        System.out.println(factorString(getFactors(list.getFirst()), list.getFirst()));
        //LinkedList<Integer> sortedList = sortList(list);
        //for (int number2 : sortedList)
          //  System.out.println(number2);
    }
    
    public static LinkedList<Integer> getFactors(int number) {
        LinkedList<Integer> factors = new LinkedList<Integer>();
        for (int i = number; i > 0; i--)
            if (number % i == 0)
                factors.addFirst(i);
        return factors;        
    }
    
    public static String factorString(LinkedList<Integer> factors, int number) {
        boolean oneFactor = factors.size() == 1;
        String factorString = "There" + (oneFactor ? " is " : " are ") + factors.size() + " factor"  + (oneFactor ? "" : "s") + " for the number " + number + "\n";
        factorString += (oneFactor ? "It is " : "They are ") + printFactors(factors);
        return factorString;
    }
    
    // you can also do : factorString += (factor == factors.get(factors.size() - 2) ? " and " : ", "); int factor = it.next();
    public static String printFactors(LinkedList<Integer> factors) {
        String factorString = "";
        for (ListIterator<Integer> it = factors.listIterator(); it.hasNext();) {
            factorString += it.next();
            if (it.hasNext())
                factorString += (it.nextIndex() == factors.size() - 1 ? " and " : ", ");
        }
        return factorString;
    }
    
    //CAN DO IT THE FOLLOWING WAY AS WELL:
    /*
    public static String printFactors(LinkedList<Integer> factors) {
        String factorString = "";
        ListIterator<Integer> it = factors.listIterator();
        while (it.hasNext()) {
            factorString += it.next();
            if (it.hasNext())
                factorString += (it.nextIndex() == factors.size() - 1 ? " and " : ", ");
        }
        return factorString;
    }
    */
    
    public static LinkedList<Integer> sortList(LinkedList<Integer> list) {
        LinkedList<Integer> sortedList = new LinkedList<>();
        while (!list.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (int number : list)
                if (number < min)
                    min = number;                    
            sortedList.add(list.remove(list.indexOf(min)));
        }
        return sortedList;
    }
    
    // CAN DO IT THE FOLLOWING TWO WAYS AS WELL:
    /*public static LinkedList<Integer> sortList(LinkedList<Integer> list) {
        LinkedList<Integer> sortedList = new LinkedList<>();
        int min = Integer.MAX_VALUE;
        int listSize = list.size();
        for (int i = 1; i <= listSize; i++) {
            for (int number : list)
                if (number < min)
                    min = number;                    
            sortedList.add(list.remove(list.indexOf(min)));
            min = Integer.MAX_VALUE;
        }
        return sortedList;
    }*/
    /* public static LinkedList<Integer> sortList(LinkedList<Integer> list) {
        int minIndex = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        LinkedList<Integer> sortedList = new LinkedList<>();
        int listSize = list.size();
        for (int i = 1; i <= listSize; i++) {
            for (int j = 0; j < list.size(); j++)
                if (list.get(j) < min) {
                    min = list.get(j);
                    minIndex = j;
                }
            sortedList.add(list.remove(minIndex));
            min = Integer.MAX_VALUE;
            }
        return sortedList;
    }*/
    
    private static int getLastNumber(LinkedList<Integer> list) {
        if (!list.isEmpty())
            return list.getLast();
        else 
            return Integer.MIN_VALUE;
    }
    /*public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        //for (int i = 1; i <= 10; i++)
          //  list.add(i);
        int number;
        while ((number = readNumber()) != 0) {
        list.add(getIndex(number, list), number);
        for (int number2 : list)
            System.out.println(number2);
        }
    }
    
    public static int getIndex(int numberToAdd, LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            if (numberToAdd < list.get(i))
                return i;
        return list.size();
    }
    */
    
    public static int readNumber() {
        System.out.print("Enter number: ");
        return In.nextInt();
    }
}
