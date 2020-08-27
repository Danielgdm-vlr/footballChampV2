package model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "players", schema = "football")
public class Player implements Comparable<Player>{
    private int idPlayer;
    private String playerName;
    private int matchesPlayed;
    private int goalsScoredPlayer;
    private int idTeam;

    @Id
    @Column(name = "idPlayer")
    public int getIdPlayer() {
        return idPlayer;
    }

    public void setIdPlayer(int idPlayer) {
        this.idPlayer = idPlayer;
    }

    @Basic
    @Column(name = "playerName")
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    @Basic
    @Column(name = "matchesPlayed")
    public int getMatchesPlayed() {
        return matchesPlayed;
    }

    public void setMatchesPlayed(int matchesPlayed) {
        this.matchesPlayed = matchesPlayed;
    }

    @Basic
    @Column(name = "goalsScoredPlayer")
    public int getGoalsScoredPlayer() {
        return goalsScoredPlayer;
    }

    public void setGoalsScoredPlayer(int goalsScoredPlayer) {
        this.goalsScoredPlayer = goalsScoredPlayer;
    }

    @Basic
    @Column(name = "idTeam")
    public int getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Player player = (Player) o;

        if (idPlayer != player.idPlayer) return false;
        if (matchesPlayed != player.matchesPlayed) return false;
        if (goalsScoredPlayer != player.goalsScoredPlayer) return false;
        if (idTeam != player.idTeam) return false;
        return Objects.equals(playerName, player.playerName);
    }

    @Override
    public int hashCode() {
        int result = idPlayer;
        result = 31 * result + (playerName != null ? playerName.hashCode() : 0);
        result = 31 * result + matchesPlayed;
        result = 31 * result + goalsScoredPlayer;
        result = 31 * result + idTeam;
        return result;
    }

    public int compareTo(Player player){
        int compareGoals = player.getGoalsScoredPlayer();
        return compareGoals - this.goalsScoredPlayer;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", matchesPlayed=" + matchesPlayed +
                ", goalsScoredPlayer=" + goalsScoredPlayer +
                ", idTeam=" + idTeam +
                '}';
    }

}
