/**
 * Created by rizwa on 7/10/2017.
 */
public enum Roshambo {

    ROCK("rock"), PAPER("paper"), SCISSORS("scissors");

    private String betterName;

    Roshambo(String value) {
        betterName = value;
    }


    @Override
    public String toString() {
        return betterName;
    }
}