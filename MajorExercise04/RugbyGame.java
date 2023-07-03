public class RugbyGame {

	public static void main(String[] args) {
		RugbyGame game = new RugbyGame();
		Player a1 = game.getTeamA().getPlayer(1);
		Player a4 = game.getTeamA().getPlayer(4);
		Player a8 = game.getTeamA().getPlayer(8);
		Player b2 = game.getTeamB().getPlayer(2);
		Player b10 = game.getTeamB().getPlayer(10);
		a1.setBall(new Ball());
		a1.pass(a4);
		b2.attack(a4);
		b2.pass(b10);
		b10.score(game.getTeamA().getGoal());
		game.displayScore();
		a1.pass(a8);
		a8.score(game.getTeamB().getGoal());
		game.displayScore();
	}
	
	private Team teamA;
	private Team teamB;
	
	public RugbyGame() {
		teamA = new Team("A");
		teamB = new Team("B");
	}

	public Team getTeamA() {
		return teamA;
	}

	public Team getTeamB() {
		return teamB;
	}
	
	public void displayScore() {
		System.out.println(teamA.getScore() + ":" + teamB.getScore());
	}

}
