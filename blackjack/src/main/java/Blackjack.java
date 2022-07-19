public class Blackjack {

    public int parseCard(String card) {
        switch (card){
            case "ace":
                return 11;
                break;
            case "two":
                return 2;
            break;
            case "three":
                return 3;
            break;
            case "four":
                return 4;
            break;
            case "five":
                return 5;
            break;
            case "six":
                return 6;
            break;
            case "seven":
                return 7;
            break;
            case "eight":
                return 8;
            break;
            case "nine":
                return 9;
            break;
            case "ten": case "jack": case "queen": case "king":
                return 10;
            break;
        }
    }

    public boolean isBlackjack(String card1, String card2) {
        return (this.parseCard(card1)+this.parseCard(card2))==21;
    }

    public String largeHand(boolean isBlackjack, int dealerScore) {

    }

    public String smallHand(int handScore, int dealerScore) {
        throw new UnsupportedOperationException("Please implement the Blackjack.smallHand method");
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
}
