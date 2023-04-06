package Game;

public class Tester {

	public static void main(String[] args) {

		Character char1 = new Character("Nutte", 100, 20);
		Character char2 = new Character("Zuhälter", 100, 20);

		char1.setIWeapon(new Dagger());


		Fight game = new Fight(char1, char2);
		game.fight();


		Character winner = game.getWinner();
		if (winner != null) {
			System.out.println(winner.getName() + " hat den Kampf gewonnen.");
		}
	}

}
