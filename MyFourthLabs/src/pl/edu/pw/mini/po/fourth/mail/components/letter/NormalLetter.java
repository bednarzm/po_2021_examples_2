package pl.edu.pw.mini.po.fourth.mail.components.letter;

public class NormalLetter extends Letter {
	
	public NormalLetter(String text, Address address) {
		super(text, address);
	}
	public String getAuthor() {
		return "Maciek";
	}
	public void readMe() {
		System.out.println("This is normal letter: " + text);
	}
	@Override
	public void test() {
		super.test();
	}
	
}
