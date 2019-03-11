package getters_and_setters;

public class Taco {
	private String meat;
	private String sauce;
	Taco(String meat, String sauce) {
		this.meat=meat;
		this.sauce=sauce;
	}
	String getMeat() {
		return meat;
	}
	String getSauce() {
		return sauce;
	}
	void setMeat(String meat) {
		this.meat=meat;
	}
	void setSauce(String sauce) {
		this.sauce=sauce;
	}
}
