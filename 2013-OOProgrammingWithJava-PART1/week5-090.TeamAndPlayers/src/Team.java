import java.util.ArrayList;

/**
 * Created by Mark on 12/1/2016.
 */
public class Team {
    private String name;
    private ArrayList<Player> team;
    private int maxSize = 16;

    public Team(String name){
        this.name = name;
        this.team = new ArrayList<Player>();
    }

    public String getName(){
        return this.name;
    }

    public void addPlayer(Player player) {
        if (this.maxSize <= team.size()) {
            return;
        }
        team.add(player);
    }

    public void printPlayers() {
        for (Player players : team) {
            System.out.println(players);
        }
    }

    public void setMaxSize(int maxSize){

        if (this.maxSize != maxSize){
            this.maxSize = maxSize;
        }
        return;
    }

    public int size(){
        return team.size();
    }

    public int goals() {
        int amount = 0;
        for (Player players : team) {
            if (players.goals() > 0) {
                amount += players.goals();
            }
        }
        return amount;
    }

}
