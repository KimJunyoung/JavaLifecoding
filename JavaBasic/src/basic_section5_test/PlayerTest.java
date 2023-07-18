package basic_section5_test;

public class PlayerTest {

	public static void main(String[] args) {
		Player player = new Player();
		PlayerLevel playerlevel1 = new BeginnerLevel();
		PlayerLevel playerlevel2 = new AdvancedLevel();
		PlayerLevel playerlevel3 = new SuperLevel();
		
		player.play(2);
		player.upgradeLevel(playerlevel2);
		player.play(5);
	}

}
