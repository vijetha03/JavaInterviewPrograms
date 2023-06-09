package tests;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Team {
		
	private List<Player> players;
	

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public double getScore(List<Player> players2) {
		if(players!=null) {
			double score = players.stream().mapToDouble(e->e.getScore()).reduce(0,(a,b)->(a+b));
			return score;
		}
		return 0;
		
	}

	public Map<String,List<Player>> givePlayesBySkillset(){
		
		Map<String, List<Player>> skillset = players.stream().collect(Collectors.groupingBy(Player::getType));
		return skillset;
		
	}


	public static void main(String[] args) {
		
		Map<Player, Long> collect = Stream.of(new Player("Sachin",100,"Batsman"),
				new Player("Sachin2",80,"Bowler"),
				new Player("Sachin3",100,"Captain")).
		collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		int count =0;
		for (Entry<Player, Long> e : collect.entrySet()) {
			int
			value = (int) e.getKey().getScore();
			count = count+ value;
		}
		
		System.out.println(count);
		
		
		
	}

}
