package basic_section5_test;

public class Player {

	
	private PlayerLevel level ;

	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public PlayerLevel getLevel() {
		return level;
	}

	public void upgradeLevel(PlayerLevel playerlevel) {
		level = playerlevel;
	}
	
	public void play(int count) {
		level.go(count);
	}
}
