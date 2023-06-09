package tests;

import java.util.ArrayList;
import java.util.List;

public class CountPlayersDriver {
	
	public static void main(String[] args) {
		
		Player p1 = new Player("Sachin1",100,"Batsman");
		Player p2 = new Player("Sachin2",80,"Bowler");
		Player p3 = new Player("Sachin3",80,"Bowler");
		Player p4 = new Player("Sourav1",100,"Batsman");
		Player p5 = new Player("Sourav2",80,"Bowler");
		Player p6 = new Player("Sourav3",80,"Bowler");
		
		List<Player> players = new ArrayList<Player>();
		players.add(p1);
		players.add(p2);
		players.add(p3);
		
		Team rcb = new Team();
		rcb.setPlayers(players);
		
		double result = rcb.getScore(players);
		
		System.out.println(result);
		
		
		
		
	}

}
