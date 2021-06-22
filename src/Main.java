import TeamPackage.BasketBallPlayer;
import TeamPackage.FootballPlayer;
import TeamPackage.Team;

public class Main {

    public static void main(String[] args) {
        FootballPlayer messi = new FootballPlayer("Messi");
        FootballPlayer koke = new FootballPlayer("koke");

        BasketBallPlayer kobe = new BasketBallPlayer("kobe");
        BasketBallPlayer jordan = new BasketBallPlayer("jordan");

        Team<FootballPlayer> footballPlayerTeam = new Team<>();
        footballPlayerTeam.addPlayer(messi);
        messi.identify();
        footballPlayerTeam.addPlayer(koke);
        koke.identify();

        Team<BasketBallPlayer> basketBallPlayerTeam = new Team<>();
        basketBallPlayerTeam.addPlayer(kobe);
        kobe.identify();
        basketBallPlayerTeam.addPlayer(jordan);

        jordan.identify();

    }
}
