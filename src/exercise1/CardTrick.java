package exercise1;
import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * author dancye
 * author Paul Bonenfant Jan 25, 2022
 * author Yash Patel May 05, 2023
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            Random random = new Random();
            card.setValue(random.nextInt(13) + 1);  // Generates a random value between 1 and 13 (inclusive)
            card.setSuit(Card.SUITS[random.nextInt(4)]);  // Generates a random suit from the SUITS array
            hand[i] = card;
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of your card: ");
        int value = scanner.nextInt();
        System.out.print("Enter the suit of your card (0-Hearts, 1-Diamonds, 2-Clubs, 3-Spades): ");
        int suit = scanner.nextInt();

        boolean foundMatch = false;
        for (Card card : hand) {
            if (card.getValue() == value && card.getSuit().equalsIgnoreCase(Card.SUITS[suit])) {
                foundMatch = true;
                break;
            }
        }
        
        if (foundMatch) {
            printInfo();
        }
    }

    private static void printInfo() {
        

        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Yash Patel, but you can call me YP");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be a successful Buiesnessman");
        System.out.println("-- Starting a start up with my friends");
        System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Watching Movies");
        System.out.println("-- Reading Books");
        System.out.println("-- Riding my Car");

        System.out.println();
 }
}
