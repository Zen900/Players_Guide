class Card {
    enum colors {
        RED,
        GREEN,
        BLUE,
        YELLOW
    }
    enum ranks {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        DOLLAR,
        PERCENT,
        ACCENT_CIRCUMFLEX,
        AMPERSAND,
    }

    colors myColors;
    ranks myRanks;
    Card(colors myColors, ranks myRanks){
        this.myColors = myColors;
        this.myRanks = myRanks;
    }
}

public class Challenge_30 {
    public static void main(String[] args) {
        Card fullCard = new Card (Card.colors.BLUE, Card.ranks.AMPERSAND);
        System.out.println(number(fullCard.myRanks));
        for (Card.colors color : Card.colors.values()){
            for (Card.ranks rank : Card.ranks.values()){
                System.out.println("The " + color + " " + rank);
            }
        }
    }

    public static String number (Card.ranks rank){
        return switch (rank) {
            case DOLLAR, PERCENT, ACCENT_CIRCUMFLEX, AMPERSAND -> "symbol card";
            default -> "face";
        };
    }
}
