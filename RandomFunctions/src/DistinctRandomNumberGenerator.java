import java.util.LinkedList;
import java.util.Random;

public class DistinctRandomNumberGenerator {
    
    public static void main(String[] args) {
        for (int integer : getRandomList()) {
            System.out.println(integer);
            //getTable().getPlayPiles().get(integer).getCards().clear();
             
        }
    }
    
    private static LinkedList<Integer> getRandomList() {
        LinkedList<Integer> listToReturn = new LinkedList<>();
        Random random = new Random();
        while (listToReturn.size() < 3) { // or != 3
            int nextInt = random.nextInt(7);
            if (!listToReturn.contains(nextInt))
                listToReturn.add(nextInt);
        }
        return listToReturn;
    }
    
    // the following versions of the above two methods are their states in the original SolitaireGUI application
    /*for (int integer : getRandomList()) {
            System.out.println(integer);
            getTable().getPlayPiles().get(integer).getCards().clear();
             
        }*/
    
    /*private LinkedList<Integer> getRandomList() {
        LinkedList<Integer> listToReturn = new LinkedList<>();
        Random random = new Random();
        while (listToReturn.size() < 3) { // or != 3
            int nextInt = random.nextInt(getTable().getPlayPiles().size());
            if (!listToReturn.contains(nextInt))
                listToReturn.add(nextInt);
        }
        return listToReturn;
    }*/
    
    /*Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        while (list.size() < 3) {
            int nextInt = random.nextInt(getTable().getPlayPiles().size());
            if (!list.contains(nextInt)) {
                getTable().getPlayPiles().get(nextInt).getCards().clear();
                list.add(nextInt);
                System.out.println(nextInt);
            }
        }*/
}
