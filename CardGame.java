package university.jala.institutional.cartas;

import java.util.*;

public class CardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Random random = new Random();

        // Simular una jugada
        Card computerCard = deck.dealCard();
        Card playerCard = deck.dealCard();

        // Imprimir las cartas obtenidas
        System.out.println("Computer: " + computerCard);
        System.out.println("Player:  " + playerCard);

        // Comparar las cartas
        int compareResult = playerCard.getValue().ordinal() - computerCard.getValue().ordinal();
        if (compareResult > 0) {
            System.out.println("Ganaste!");
        } else if (compareResult < 0) {
            System.out.println("Perdiste.");
        } else {
            System.out.println("Empate.");
        }
    }
}
