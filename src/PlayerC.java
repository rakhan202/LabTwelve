/**
 * Created by rizwa on 7/11/2017.
 */
public class PlayerC extends Player {

    public PlayerC(String name){
        this.name = name;
        roshVal = Roshambo.PAPER;
    }

    @Override
    public Roshambo generateRoshambo() {
        double randDouble = Math.random() * 3;
        if(randDouble<1)
            roshValue = Roshambo.ROCK;
        else if (randDouble<2)
            roshValue = Roshambo.PAPER;
        else
            roshValue = Roshambo.SCISSORS;
        return roshVal;
    }
}
