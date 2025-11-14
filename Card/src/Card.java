import java.util.Comparator;
import java.util.Random;

public class Card implements Comparable<Card> {

    private final int RANK, SUIT;
    private static final Random GENERATOR = new Random();

    private static final String[] RANKS = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final String[] SUITS = {"Clubs", "Diamond", "Hearts", "Spades"};

    public Card() {

        this.RANK = GENERATOR.nextInt(RANKS.length);
        this.SUIT = GENERATOR.nextInt(SUITS.length);
    }

    public Card(int r, int s) {
        RANK = r;
        SUIT = s;
    }

    public String getRank() {

        return RANKS[RANK];
    }

    public String getSuit() {
        return SUITS[SUIT];

    }

    public int getRankValue() {
        return RANK;
    }

    public int getSuitValue() {
        return SUIT;
    }



    @Override
    public String toString() {
        return getRank() + " of " + getSuit();

    }

    @Override
    public int compareTo(Card otherCard) {
        if (this.getRankValue() > otherCard.getRankValue()) return 1;
        else if (this.getRankValue() < otherCard.getRankValue()) return -1;
        else return 0;
    }
}
