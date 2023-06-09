package tests;

public class Player {
	
	String name;
	double score;
	String type;
	
	@Override
	public String toString() {
		return "Player [name=" + name + ", score=" + score + ", type=" + type + "]";
	}
	
	
	
	public Player(String name, double score, String type) {
		super();
		this.name = name;
		this.score = score;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	

}
