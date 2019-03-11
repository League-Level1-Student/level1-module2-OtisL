package sea_creature;

public class CreatureRunner {
	public static void main(String[] args) {
		SeaCreature SB = new SeaCreature("Spongebob");
		SB.eat();
		SB.laugh();
		SeaCreature SW = new SeaCreature("Squidward");
		SW.eat();
		SW.laugh();
		SeaCreature PT = new SeaCreature("Patrick");
		PT.eat();
		PT.laugh();
	}
}
