package ua.itea.homework9Pudge;

public class Controller {

	Pudge p1 = null;
	Pudge p2 = null;

	public Controller(Pudge p1, Pudge p2) {
		this.p1 = p1;
		this.p2 = p2;
		run();
	}

	public void run() {
		System.out.println("p1 - " + p1.getInfo() + "\np2 - " + p2.getInfo());
		System.out.println("Start game");
		while (p1.getHealth() > 0 && p2.getHealth() > 0) {
			p1.tookStrike(p2.getStrike());
			System.out.println("p2 struck p1 on the - " + p1.getStrike() + " health ");
			if (p1.getHealth() > 0) {
				p2.tookStrike(p1.getStrike());
				System.out.println("p1 struck p2 on the - " + p2.getStrike() + " health");
			} else {
				break;
			}
		}
		System.out.println("Game over");
		System.out.println(p1.getHealth() > 0 ? "p1 - won\nhealth left - " + p1.getHealth()
				: "p2 - won\nhealth left - " + p2.getHealth());
	}

}
