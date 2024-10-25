
import java.util.ArrayList;
import java.util.Random;

public class CardGame {

    private ArrayList<Card> deck;

    private ArrayList<Card> hand;

    public CardGame() {

        deck = new ArrayList<>();

    }

    public void fillDeck() {

        //but!    
        for (int i = 0; i < 59; i++) {
            deck.add(new Energy());
        }
        deck.add(new Charmander());
    }

    public void drawHand() {
        Random rng = new Random();
        for (int i = 0; i < 7; i++) {
            int cardToTakeIndex = rng.nextInt(deck.size() + 1);
            hand.add(deck.get(cardToTakeIndex));
            deck.remove(cardToTakeIndex);
        }
    }

    //rename this
    public boolean PokemonInHand() {
        //loop through hand, if one card is pokemon, return true, else return false.
        for (Card singleCard : hand) {
            if (singleCard instanceof Pokemon) {
                return true;
            }
        }
                System.out.println("retry");
        return false;
    }

    public void reDraw() {
        if(PokemonInHand() == false){
        run();
        System.out.println("retry");
        }
        //if the pokemoninhand() is false then add cards back and reshuffle deck and pick again until have pokemon in PokemondInHand()
    }

    //This is a TEMPLATE. Use the run method to make new methods. add methods here as we need to make program run.
    public void run() {
        fillDeck();
        //shuffleDeck (for now unshuffled)
        drawHand();
        PokemonInHand();
       // reDraw();
    }
}

/*
With those set, we can write a Monte Carlo experiment
What if the deck has only 1 Pokemon, how many reshuffles do you have to take on avg to take your first turn (in other words, have a Pokemon in hand)
What if the deck has 2… what if the deck has 3… write an engine that generates 1-60 Pokemon in the deck, output the odds of having a Pokemon in your opening hand. Graph in excel
*/
