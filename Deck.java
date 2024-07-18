package university.jala.institutional.cartas;

import java.util.*;

class Deck {
   private List<Card> cards;

   public Deck() {
       cards = new ArrayList<>();
       for (Suit suit : Suit.values()) {
           for (Value value : Value.values()) {
               cards.add(new Card(suit, value));
           }
       }
       // Barajear las cartas
       Collections.shuffle(cards);
   }

   public Card dealCard() {
       if (cards.isEmpty()) {
           throw new IllegalStateException("No quedan cartas en el mazo.");
       }
       return cards.remove(0); 
   }
}
