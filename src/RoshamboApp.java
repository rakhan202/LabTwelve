
import java.util.Scanner;

public class RoshamboApp {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        PlayerH human = new PlayerH("Rizwan");
        PlayerC computer = new PlayerC("TheJets");
        PlayerR rock = new PlayerR("TheSharks");
        Player currPlayer = null;
        int userInt = -1;
        char userChar = 'g';
        Roshambo ourRosh;
        Roshambo oppRosh;


        System.out.println("Welcome to the Rock Paper Scissors!");

        do {
            System.out.println("Enter your name: ");
            String userName = scan.nextLine();
            System.out.println("Enter 1 to play against TheJets, any other number to play against TheSharks");
            userInt = scan.nextInt();
            scan.nextLine();
            if (userInt == 1)
                currPlayer = computer;
            else
                currPlayer = rock;

            System.out.println(userName + " chose " + currPlayer.getName());
            ourRosh = human.generateRoshambo();
            oppRosh = currPlayer.generateRoshambo();
            System.out.println(userName + " chose " + ourRosh);
            System.out.println(  "Opponent chose " + oppRosh);
            generateWinner(ourRosh, oppRosh, userName);


            System.out.println("Would you like to continue (y/n)");
            userChar = scan.nextLine().toLowerCase().charAt(0);

        } while (userChar == 'y');


    }

    private static void generateWinner(Roshambo ourRosh, Roshambo oppRosh, String userName) {
        if (ourRosh == Roshambo.ROCK && oppRosh == Roshambo.SCISSORS || ourRosh == Roshambo.SCISSORS && oppRosh == Roshambo.PAPER
                || ourRosh == Roshambo.PAPER && oppRosh == Roshambo.ROCK) {
            System.out.println(userName + " won! Opponent chose " + oppRosh);
        }
        else if (ourRosh == oppRosh) {
            System.out.println(userName + " tied. Opponent chose " + oppRosh);
        } else {
            System.out.println(userName + "  lost. Opponent chose " + oppRosh);
        }
    }

}