/**
 * Created by Rizwan on 7/11/2017.
 */
public class PlayerH extends Player {



    public PlayerH(String name) {
        this.name = name;
        roshVal = Roshambo.SCISSORS;
    }
        @Override
        public Roshambo generateRoshambo(){
        System.out.println("Please enter Rock, Paper, or Scissors");
        String userInput = RoshamboApp.scan.nextLine();
        roshValue = Roshambo.valueOf(userInput.toUpperCase());
        return roshValue;
    }
    }

