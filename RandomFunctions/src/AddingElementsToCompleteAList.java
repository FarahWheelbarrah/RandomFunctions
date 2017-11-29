/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author andre
 */
public class AddingElementsToCompleteAList {
    public static void example1() {
        // THE FOLLOWING METHODS WORK WITH ANY KIND OF LIST
        // the following methods are test methods that allow us to add up to 3 cards to the reserveDeck
        // the number of cards to add is based on the amount of cards already in the reserveDeck
        // Example 1 - the most efficient way of doing it:
        //for (int i = getTable().getReserveDeck().getCards().size() + 1; i <= 3 ; i++) {
          //  Card card = new Card("Spades", i, "Black");
           // card.setFaceUp(true);
           // getTable().getReserveDeck().getCards().add(card);
       //}
       
        // Example 2 - functions exactly the same as Example 1, but is less efficient:
        //int numOfCardsInReserveDeckExample2 = getTable().getReserveDeck().getCards().size();
        //for (int i = 1; i <= 3 - numOfCardsInReserveDeckExample2; i++) {
        //   Card card = new Card("Spades", getTable().getReserveDeck().getCards().size() + 1, "Black");
        //   card.setFaceUp(true);
        //   getTable().getReserveDeck().getCards().add(card);
        //}
        
        // Example 3 - has a bug where each card that is added will have a number value of the INITIAL size of the reserveDeck + 1:
        //int numOfCardsInReserveDeckExample1 = getTable().getReserveDeck().getCards().size();
        //for (int i = 1; i <= 3 - numOfCardsInReserveDeckExample1; i++) {
        //    Card card = new Card("Spades", numOfCardsInReserveDeckExample1 + 1, "Black");
        //    card.setFaceUp(true);
        //    getTable().getReserveDeck().getCards().add(card);
        //}
        
        // Example 4 - has a bug where the cards will ALWAYS be added starting from the value 1 (Ace) and increasing by 1 on each loop iteration (for each new card that is added):
        //int numOfCardsInReserveDeckExample3 = getTable().getReserveDeck().getCards().size();
        //for (int i = 1; i <= 3 - numOfCardsInReserveDeckExample3; i++) {
         //   Card card = new Card("Spades", i, "Black");
         //   card.setFaceUp(true);
          //  getTable().getReserveDeck().getCards().add(card);
        //}
    }
}
