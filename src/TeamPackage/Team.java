package TeamPackage;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private  List<T> players = new ArrayList();

    public boolean addPlayer(T player){
        if(players.contains(player)){
            return false;
        }else{
            players.add(player);
            System.out.println(player.getName() + " was added to the team");
        }
        return true;
    }
}
