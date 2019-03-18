package tea_party;

public class TeaParty {
	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if (isKnighted == true) {
			return "Hello Sir " + name;
		} else if (isWoman == true) {
			return "Hello Ms. " + name;
		} else {
			return "Hello Mr. " + name;
		}
	}
}
