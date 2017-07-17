import java.util.Random;

/**
 * Created by rizwa on 7/10/2017.
 */
public abstract class Player {

    protected String name;
    protected Roshambo roshValue;
    protected Roshambo roshVal;
    protected Roshambo choice;

    abstract Roshambo generateRoshambo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roshambo getChoice() {
        return choice;
    }

    public void setChoice(Roshambo choice) {
        this.choice = choice;
    }

    public Roshambo getRoshValue() {
        return roshValue;
    }

    public void setRoshValue(Roshambo roshValue) {
        this.roshValue = roshValue;
    }

    public Roshambo getRoshVal() {
        return roshVal;
    }

    public void setRoshVal(Roshambo roshVal) {
        this.roshVal = roshVal;
    }
}

