/**
 * Created by rizwa on 7/11/2017.
 */
public class PlayerR extends Player {

    public PlayerR(String name){
        roshVal = Roshambo.ROCK;
        this.name = name;
    }

    @Override
    public Roshambo generateRoshambo() {
        return roshVal;
    }
}
