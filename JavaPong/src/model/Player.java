package model;

public class Player {
	private String	name;
	private int		lives;
	
	
	public Player(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getLives() {
		return lives;
	}
	
	public int lowerLives() {
		int i = 0;
		for(i = 5; i > 0; i --){
			lives --;
		}
		return lives;
	}
}
