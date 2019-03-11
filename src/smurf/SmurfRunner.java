package smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handy = new Smurf("Handy");
		Smurf papa = new Smurf("Papa Smurf");
		Smurf ette = new Smurf("Smurfette");
		handy.eat();
		handy.getName();
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		System.out.println(ette.getName());
		System.out.println(ette.getHatColor());
		System.out.println(ette.isGirlOrBoy());
	}
}
