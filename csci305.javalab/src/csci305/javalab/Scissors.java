package csci305.javalab;

public class Scissors extends Element {

	public Scissors(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String compareTo(Element ele) {
		Outcome outcome = new Outcome(this, ele);
		return outcome.rule + " -- " + outcome.result;
	}


}